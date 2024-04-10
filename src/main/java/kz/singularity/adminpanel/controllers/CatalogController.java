package kz.singularity.adminpanel.controllers;

import kz.singularity.adminpanel.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping("/catalog")
    public String catalogMenu(Model model){
        model.addAttribute("dishes",catalogService.findAll());
        return "catalog";
    }
}
