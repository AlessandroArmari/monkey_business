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

import com.digitazon.monkey_business.model.Treno;
import com.digitazon.monkey_business.service.TrenoService;

@RestController
@RequestMapping("/api/treni")
public class TrenoController {

    @Autowired
    TrenoService trenoService;

    @GetMapping("/all")
    public ResponseEntity<List<Treno>> findAllTreni() {
        List<Treno> treni = trenoService.findAllTreni();
        return new ResponseEntity<List<Treno>>(treni, HttpStatus.CREATED);
    }

    @PostMapping("/save")
    public ResponseEntity<Treno> saveTreno(@RequestBody Treno treno) {
        return new ResponseEntity<Treno>(trenoService.saveTreno(treno), HttpStatus.OK);
    }

}
