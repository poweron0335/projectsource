package com.example.projectsource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/project")
public class AuctionArenaController {
    @GetMapping("/blog-details")
    public void getNotice() {
        log.info("공지사항 페이지 요청");
    }

    @GetMapping("/anime-details")
    public void getDetails() {
        log.info("상세정보 페이지 요청");
    }

}
