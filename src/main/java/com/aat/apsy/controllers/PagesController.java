package com.aat.apsy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PagesController {

    @GetMapping("/")
    public String home() {
        return "pages/home";
    }

    @GetMapping("/consultations")
    public String consultations() {
        return "pages/consultations";
    }

    @GetMapping("/experiences")
    public String experiences() {
        return "pages/experiences";
    }

    @GetMapping("/infos_pratiques")
    public String infos_pratiques() {
        return "pages/infos_pratiques";
    }

    @GetMapping("/prendre_rdv")
    public String prendre_rdv() {
        return "pages/prendre_rdv";
    }
}
