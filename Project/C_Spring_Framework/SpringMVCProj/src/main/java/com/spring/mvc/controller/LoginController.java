package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import com.spring.mvc.model.LoginAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView authenticate(@RequestParam("username") String username, @RequestParam("password") String password) {

        String result = LoginAction.verifyUser(username, password); //invoke Model/Action/Service class
        if (result.equals("success"))
            return new ModelAndView("success.jsp","username",username); // invoke view
        else
            return new ModelAndView("failure.jsp"); // invoke view
    }
}
