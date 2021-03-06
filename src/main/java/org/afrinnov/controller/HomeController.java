package org.afrinnov.controller;

import org.afrinnov.session.AfrinnovSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by simon on 28/09/2016.
 */
@Controller
public class HomeController {

	@Autowired 
	private AfrinnovSession afrinnovSession;
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
    @GetMapping("/index")
    @Secured("ROLE_ADMIN")
    public String home(Map<String, Object> model) {
        model.put("message", "Hello World");
        model.put("title", "Hello Home"); 
        model.put("date", afrinnovSession.getDate());
        return "home";
    }
    
    @RequestMapping("/login")
	public String login() {
		return "login";
	}
}
