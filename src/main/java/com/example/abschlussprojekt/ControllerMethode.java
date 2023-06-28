package com.example.abschlussprojekt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMethode {

    @GetMapping("api/factorial")
    public int getFactor(@RequestParam int number) {
        int erg = 0;
        int factor = 1;
        for(int i = 1; i <= number; i++) {
            factor *= i;
        }
        erg += factor;
        return factor;
    }

}
