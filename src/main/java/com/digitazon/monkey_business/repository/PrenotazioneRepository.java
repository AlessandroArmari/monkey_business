package com.digitazon.monkey_business.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitazon.monkey_business.model.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    /* 1 */
    public Prenotazione findByCodicePrenotazione(String codicePrenotazione);

}
