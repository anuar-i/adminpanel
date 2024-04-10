package kz.singularity.adminpanel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatalogController {

    @GetMapping("/catalog")
    public String catalogMenu(){

        return "catalog";
    }
}
