package com.sprin5.tutorials.mysfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(){


        return "vets/index";
    }
}