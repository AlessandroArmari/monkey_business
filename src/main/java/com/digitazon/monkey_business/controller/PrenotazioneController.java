package com.digitazon.monkey_business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitazon.monkey_business.model.Prenotazione;
import com.digitazon.monkey_business.service.PrenotazioneService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/prenotazione")
public class PrenotazioneController {

    @Autowired
    PrenotazioneService prenotazioneService;

    @PostMapping("/save")
    public ResponseEntity<Prenotazione> savePrenotazione(@RequestBody Prenotazione prenotazione) {
        return new ResponseEntity<>(prenotazioneService.savePrenotazione(prenotazione), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Prenotazione>> getAllPrenotazioni() {
        return new ResponseEntity<>(prenotazioneService.findAllPrenotazioni(), HttpStatus.OK);
    }

    @GetMapping("/find/id")
    public ResponseEntity<Prenotazione> getPrenotazioneById(@RequestParam Long id) {
        return new ResponseEntity<>(prenotazioneService.findById(id), HttpStatus.OK);
    }

    /* 1 */

    @GetMapping("/find/codicePrenotazione")
    public ResponseEntity<Prenotazione> getPrenotazioneByCodicePrenotazione(@RequestParam String codicePrenotazione) {
        return new ResponseEntity<>(prenotazioneService.findByCodicePrenotazione(codicePrenotazione), HttpStatus.OK);

    }

}
