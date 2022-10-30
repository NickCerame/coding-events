package org.launchcode.codingevents.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @GetMapping
    public String displayIndex() { return "index"; }

}
