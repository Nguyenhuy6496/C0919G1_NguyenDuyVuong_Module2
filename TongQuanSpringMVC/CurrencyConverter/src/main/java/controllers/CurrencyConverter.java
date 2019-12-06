package controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String converter(@RequestParam double rate, @RequestParam double usd, Model model) {
        double vnd = usd * rate;
        model.addAttribute("usd", String.format("%,3f", usd));
        model.addAttribute("vnd", String.format("%,3f", vnd));
        model.addAttribute("rate", rate);
        return "home";
    }
}
