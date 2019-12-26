package case_study.furama_resort.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ResortController {
    @GetMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("homePage");
    }
}
