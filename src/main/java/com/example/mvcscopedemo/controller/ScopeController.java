package com.example.mvcscopedemo.controller;

import com.example.mvcscopedemo.beans.ApplicationScopeBean;
import com.example.mvcscopedemo.beans.RequestScopedBean;
import com.example.mvcscopedemo.beans.SessionScopeBean;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ScopeController {

    private final RequestScopedBean requestScopedBean;
    private final SessionScopeBean sessionScopeBean;
    private final ApplicationScopeBean applicationScopeBean;

    @RequestMapping("/")
    public String listScopedValue(Model model){
        model.addAttribute("requestValue", requestScopedBean.getValue());
        model.addAttribute("sessionValue", sessionScopeBean.getValue());
        model.addAttribute("applicationValue", applicationScopeBean.getValue());
       return "index";

    }
    @PostMapping("/save-request-value")
    public String addRequestValue(@RequestParam("requestValue")int requestValue){
        requestScopedBean.setValue(requestValue);
        return "forward:/";
    }

    @PostMapping("/save-session-value")
    public String addSessionValue(@RequestParam("sessionValue")int sessionValue){
        sessionScopeBean.setValue(sessionValue);
        return "redirect:/";
    }

    @PostMapping("/save-application-value")
    public String addApplicationValue(@RequestParam("applicationValue")int applicationValue){
        applicationScopeBean.setValue(applicationValue);
        return "redirect:/";
    }





}
