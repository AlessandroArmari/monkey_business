package com.digitazon.monkey_business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.monkey_business.model.Passeggero;
import com.digitazon.monkey_business.service.PasseggeroService;

@RestController
@RequestMapping("/api/passeggero")
public class PasseggeroController {

    @Autowired
    PasseggeroService passeggeroService;

    @GetMapping("/all")
    public ResponseEntity<List<Passeggero>> findAllPasseggeri() {
        List<Passeggero> passeggeri = passeggeroService.findAllPasseggeri();
        return new ResponseEntity<List<Passeggero>>(passeggeri, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Passeggero> savePasseggero(@RequestBody Passeggero passeggero) {
        return new ResponseEntity<>(passeggeroService.savePasseggero(passeggero), HttpStatus.OK);
    }

}
