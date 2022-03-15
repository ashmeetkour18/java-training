package tweete_assessment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @GetMapping("/loginForm")
    public ModelAndView loginForm() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/registerForm")
    public ModelAndView registerUser() {
        ModelAndView modelAndView = new ModelAndView("register");
        return modelAndView;
    }
}
