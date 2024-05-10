package com.example.projectsource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        log.info("메인화면 요청");

        return "index";
    }

}
