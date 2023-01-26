package com.digitazon.monkey_business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.monkey_business.model.Prenotazione;
import com.digitazon.monkey_business.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepository prenotazioneRepository;

    public Prenotazione savePrenotazione(Prenotazione prenotazione) {
        return prenotazioneRepository.save(prenotazione);
    }

    public List<Prenotazione> findAllPrenotazioni() {
        return prenotazioneRepository.findAll();
    }

    public Prenotazione findById(Long id) {

        Optional<Prenotazione> prenotazioneOptional = prenotazioneRepository.findById(id);
        // findById(id) ritorna un Optional<Passeggero>,
        // con .get() trasformiamo l'Optional<Passeggero> in un tipo Passeggero

        if (prenotazioneOptional.isPresent())
            return prenotazioneOptional.get();

        else
            return null;
    }

    /* 1 */
    public Prenotazione findByCodicePrenotazione(String codicePrenotazione) {
        return prenotazioneRepository.findByCodicePrenotazione(codicePrenotazione);
    }

}
