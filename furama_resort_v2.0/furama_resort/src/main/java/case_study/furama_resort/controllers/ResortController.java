package case_study.furama_resort.controllers;

import case_study.furama_resort.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResortController {

    @Autowired
    Services services;

    @GetMapping("/")
    public ModelAndView homePage(@RequestParam(value = "fromPrice", required = false) Integer fromPrice,
                                 @RequestParam(value = "toPrice", required = false) Integer toPrice) {
        ModelAndView modelAndView = new ModelAndView("homePage");
        if (fromPrice == null || toPrice == null) {
            modelAndView.addObject("listServices", services.getAllService());
        } else {
            modelAndView.addObject("listServices", services.findAllByRentalCostBetween(fromPrice, toPrice));
        }
        return modelAndView;
    }

    @GetMapping("/services/details/{id}")
    public ModelAndView serviceDetails(@PathVariable long id) {
        return new ModelAndView("serviceDetails", "details", services.getService(id));
    }
}
