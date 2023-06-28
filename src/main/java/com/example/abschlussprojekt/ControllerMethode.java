package com.example.abschlussprojekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMethode {
    private int total;
    @GetMapping("api/factorial")
    public int getFactor(@RequestParam int number) {
        int factor = 1;
        for(int i = 1; i <= number; i++) {
            factor *= i;
        }
        this.total = this.total+ factor;
        return factor;
    }



}
