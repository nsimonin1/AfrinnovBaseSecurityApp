package org.afrinnov.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by simon on 28/09/2016.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    @Secured("ROLE_ADMIN")
    public String home(Map<String, Object> model) {
        model.put("message", "Hello World");
        model.put("title", "Hello Home");
        model.put("date", new Date());
        return "home";
    }
}
