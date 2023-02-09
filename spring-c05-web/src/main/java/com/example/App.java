package com.example;

import com.example.entities.Beer;
import com.example.repositories.BeerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        BeerRepository beerRepo = context.getBean(BeerRepository.class);

        Beer beer1 = new Beer(null, "Unfiltered", "yellow", 5.5, 3.5);
        Beer beer2 = new Beer(null, "Pilsner Urquel", "yellow", 5.5, 3.5);
        Beer beer3 = new Beer(null, "Staropramen", "yellow", 5.5, 3.5);
        Beer beer4 = new Beer(null, "Starobrno", "yellow", 5.5, 3.5);

        beerRepo.saveAll(List.of(beer1, beer2, beer3, beer4));
    }

}
