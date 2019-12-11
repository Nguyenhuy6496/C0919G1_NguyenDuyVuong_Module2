package database.customer_management.controller;

import database.customer_management.entity.Customer;
import database.customer_management.service.CustomerService;
import database.customer_management.service.impl.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @GetMapping("/")
    public ModelAndView showCreateForm() {
        return new ModelAndView("create", "customer", new Customer());
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
        CustomerService customerService = new CustomerServiceImpl();
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "New customer created successfully!");
        return modelAndView;
    }

}
