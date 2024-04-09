package kz.singularity.adminpanel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/home")
    public String HomePageMenu(){
        return "HomePage";
    }
}
