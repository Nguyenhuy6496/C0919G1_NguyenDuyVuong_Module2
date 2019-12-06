package controllers;

import models.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailControllers {
    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home", "enterEmail", new Email());
    }

    @PostMapping("/validate")
    public ModelAndView validate(@ModelAttribute("enterEmail") Email email) {
        boolean result = EmailValidation.validate(email.getEmail());
        if (result) {
            ModelAndView modelAndView = new ModelAndView("displayEmail");
            modelAndView.addObject("correctEmail", email.getEmail());
            return modelAndView;
        } else {
            return new ModelAndView("home");
        }
    }
}
