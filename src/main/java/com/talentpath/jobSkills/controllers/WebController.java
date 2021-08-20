package com.talentpath.jobSkills.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/")
    public String home(){return "index.html";}

    @RequestMapping("/about")
    public String about(){return "about.html";}

    @RequestMapping("/team")
    public String team(){return "team.html";}
}
