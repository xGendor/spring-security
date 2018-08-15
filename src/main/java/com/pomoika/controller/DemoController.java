package com.pomoika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){

        return "homesuka";
    }

    @GetMapping("/leaders")
    public String showLeader(){

        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystem(){

        return "systems";
    }

}
