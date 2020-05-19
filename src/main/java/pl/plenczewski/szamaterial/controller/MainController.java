package pl.plenczewski.szamaterial.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/foruser")
    public ResponseEntity<String> forUser(){
        return new ResponseEntity<>("hello user", HttpStatus.OK);
    }

}
