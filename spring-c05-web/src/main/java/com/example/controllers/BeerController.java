package com.example.controllers;

import com.example.entities.Beer;
import com.example.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class BeerController {

    private final BeerService beerService;


    @GetMapping("/beers")
    public String findAll(Model model) {
        List<Beer> beers = beerService.findAll();
        model.addAttribute("beers", beers);
        model.addAttribute("message", "Hola mundo");
        return "beer-list";
    }



}
