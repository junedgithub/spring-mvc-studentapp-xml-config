package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/info")
    public ModelAndView getMessage(){
        ModelAndView modelAndView = new ModelAndView("myMessage.jsp");
        modelAndView.addObject("kingName","David");
        modelAndView.addObject("queenName","Priya");
        return modelAndView;
    }
}
