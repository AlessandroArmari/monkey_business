package com.digitazon.monkey_business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.monkey_business.model.Passeggero;
import com.digitazon.monkey_business.repository.PasseggeroRepository;

@Service
public class PasseggeroService {

    @Autowired
    PasseggeroRepository passeggeroRepository;

    @Autowired
    PrenotazioneService prenotazioneService;

    public Passeggero savePasseggero(Passeggero passeggero) {

        if (passeggero.getPrenotazione() != null) {
            prenotazioneService.savePrenotazione(passeggero.getPrenotazione());
        }

        return passeggeroRepository.save(passeggero);

        // Se il passeggero che vogliamo salvare ha una prenotazione, dobbiamo prima
        // salvare la prenotazione, e poi salvare il passeggero
        // PERCHè: IL PASSEGGERO PER ESISTERE DEVE AVERE UNA PRENOTAZIONE (FOREIGN KEY
        // Passeggero--->Prenotazione)

    }

    public List<Passeggero> findAllPasseggeri() {
        return passeggeroRepository.findAll();
    }

    public Passeggero findById(Long id) {

        Optional<Passeggero> passeggeroOptional = passeggeroRepository.findById(id);
        // findById(id) ritorna un Optional<Passeggero>,
        // con .get() trasformiamo l'Optional<Passeggero> in un tipo Passeggero

        if (passeggeroOptional.isPresent())
            return passeggeroOptional.get();

        else
            return null;
    }

    // Find By Surname!!!!

}
