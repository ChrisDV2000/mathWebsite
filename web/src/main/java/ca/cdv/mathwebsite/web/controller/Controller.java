package ca.cdv.mathwebsite.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    public String start() {
        return "index";
    }
}
