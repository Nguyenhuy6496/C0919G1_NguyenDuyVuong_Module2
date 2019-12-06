package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("/")
    public String home() {
        return "dictionary";
    }

    @PostMapping("/translate")
    public String dictionary(@RequestParam String english, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "Xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");

        String result = dictionary.get(english);
        if (result != null) {
            model.addAttribute("english", english);
            model.addAttribute("vietnamese", result);
        } else {
            model.addAttribute("notFound", "not found");
        }
        return "dictionary";
    }
}
