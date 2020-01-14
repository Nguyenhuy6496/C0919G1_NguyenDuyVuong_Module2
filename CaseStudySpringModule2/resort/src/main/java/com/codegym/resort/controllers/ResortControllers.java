package com.codegym.resort.controllers;

import com.codegym.resort.entity.FuramaContracts;
import com.codegym.resort.entity.FuramaCustomers;
import com.codegym.resort.services.ResortContracts;
import com.codegym.resort.services.ResortCustomers;
import com.codegym.resort.services.ResortServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ResortControllers {

    @Autowired
    ResortServices resortServices;

    @Autowired
    ResortContracts resortContracts;

    @Autowired
    ResortCustomers resortCustomers;

    //  Hiển thị thông tin dịch vụ theo giá
    @GetMapping("/")
    public ModelAndView homePage(@RequestParam(value = "fromPrice", required = false) Integer fromPrice,
                                 @RequestParam(value = "toPrice", required = false) Integer toPrice) {
        ModelAndView modelAndView = new ModelAndView("homePage");
        if (fromPrice == null || toPrice == null) {
            modelAndView.addObject("listServices", resortServices.getAllService());
        } else {
            modelAndView.addObject("listServices", resortServices.findAllByRentalCostBetween(fromPrice, toPrice));
        }
        return modelAndView;
    }

    //  Hiển thị thông tin dịch vụ
    @GetMapping("/services/details/{id}")
    public ModelAndView serviceDetails(@PathVariable long id) {
        return new ModelAndView("serviceDetails", "details", resortServices.getService(id));
    }

    //  Chức năng đặt phòng
    @GetMapping("/services/booking/{id}")
    public ModelAndView booking(@PathVariable long id) {
        return new ModelAndView("bookingPage", "details", resortServices.getService(id));
    }

    //  Lưu thông tin đơn đặt phòng và có lưu cookie
    @PostMapping("/services/booking")
    public ModelAndView saveBooking(@RequestParam(value = "idService") Long idService,
                                    @RequestParam(value = "startDay") Date startDay,
                                    @RequestParam(value = "endDay") Date endDay,
                                    @RequestParam(value = "deposits") int deposits,
                                    HttpServletRequest request, HttpServletResponse response) {
        FuramaContracts furamaContracts = new FuramaContracts();
        furamaContracts.setIdService(idService);
        furamaContracts.setStartDay(startDay);
        furamaContracts.setEndDay(endDay);
        furamaContracts.setDeposits(deposits);
        furamaContracts.setIdCustomer((long) 1);
        furamaContracts.setIdEmployee((long) 1);
        resortContracts.saveContract(furamaContracts);
        Iterable<FuramaContracts> contractsIterable = resortContracts.findAllByIdCustomer((long) 1);
        for (FuramaContracts contracts : contractsIterable) {
            String cookieValue = contracts.getIdContract() + "_" + contracts.getIdService() + "_" + contracts.getStartDay() + "_" + contracts.getEndDay();
            Cookie cookie = new Cookie("contract" + contracts.getIdContract(), cookieValue);
            cookie.setMaxAge(60*60);
            cookie.setPath("history");
            response.addCookie(cookie);
        }
        return new ModelAndView("bookingSuccessPage");
    }

    //  lịch sử booking
    @GetMapping("history")
    public ModelAndView getHistoryPage(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        List<FuramaContracts> contractsList = new ArrayList<>();
        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().contains("contract")) {
                FuramaContracts furamaContracts = new FuramaContracts();
                String[] cookieValue = cookies[i].getValue().split("\\_");
                furamaContracts.setIdContract(Long.parseLong(cookieValue[0]));
                furamaContracts.setIdCustomer(Long.parseLong(cookieValue[1]));
                furamaContracts.setStartDay(Date.valueOf(cookieValue[2]));
                furamaContracts.setEndDay(Date.valueOf(cookieValue[3]));
                contractsList.add(furamaContracts);
            }
        }
        return new ModelAndView("historyPage", "historyContracts", contractsList);
    }
    //  Đăng ký khách hàng
    @GetMapping("register/customers")
    public ModelAndView registerCustomers() {
        return new ModelAndView("registerCustomerPage", "customer", new FuramaCustomers());
    }

    //  Lưu thông tin khách hàng
    @PostMapping("register/customers")
    public String saveCustomer(@Valid @ModelAttribute("customer") FuramaCustomers furamaCustomers, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registerCustomerPage";
        } else {
            resortCustomers.saveCustomer(furamaCustomers);
            return "registerCustomerSuccessPage";
        }
    }

//    @GetMapping("login")
//    public ModelAndView loginUser() {
//        return new ModelAndView("loginPage");
//    }
}