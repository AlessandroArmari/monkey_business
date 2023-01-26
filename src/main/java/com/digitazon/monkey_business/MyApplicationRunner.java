package com.digitazon.monkey_business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.digitazon.monkey_business.model.Passeggero;
import com.digitazon.monkey_business.model.Prenotazione;
import com.digitazon.monkey_business.model.Treno;
import com.digitazon.monkey_business.service.PasseggeroService;
import com.digitazon.monkey_business.service.PrenotazioneService;
import com.digitazon.monkey_business.service.TrenoService;

@Component
public class MyApplicationRunner implements CommandLineRunner {

    @Autowired
    PasseggeroService passeggeroService;

    @Autowired
    TrenoService trenoService;

    @Autowired
    PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {

        // TRENI

        Treno t1 = new Treno("AF8249", null);
        Treno t2 = new Treno("BR0521", null);
        Treno t3 = new Treno("PN2543", null);
        Treno t4 = new Treno("AZ5214", null);

        trenoService.saveTreno(t1);
        trenoService.saveTreno(t2);
        trenoService.saveTreno(t3);
        trenoService.saveTreno(t4);

        // PRENOTAZIONI

        Prenotazione prenotazione1 = new Prenotazione("AFZY", "Roma", "Milano", "29-02-2023", "12:00", "15:00", "8",
                "Business", "4D", 20, "Paypal", null, t4);
        Prenotazione prenotazione2 = new Prenotazione("NBEU", "Firenze", "Bologna", "15-06-2023", "10:00", "21:00", "2",
                "Business", "8A", 30, "Contanti", null, t3);
        Prenotazione prenotazione3 = new Prenotazione("EFMM", "Pisa", "Palermo", "21-03-2023", "08:00", "09:30", "7",
                "Business", "13C", 40, "Bonifico", null, t2);
        Prenotazione prenotazione4 = new Prenotazione("BLNO", "Ancona", "Napoli", "31-08-2023", "22:00", "23:45", "1",
                "Business", "5G", 50, "Paypal", null, t1);

        prenotazioneService.savePrenotazione(prenotazione1);
        prenotazioneService.savePrenotazione(prenotazione2);
        prenotazioneService.savePrenotazione(prenotazione3);
        prenotazioneService.savePrenotazione(prenotazione4);

        // PASSEGGERI

        Passeggero p1 = new Passeggero("Marco Marfia", "A001", prenotazione1);
        Passeggero p2 = new Passeggero("Federica Battiti", "B001", prenotazione1);
        Passeggero p3 = new Passeggero("Francesco Conte", "C001", prenotazione2);
        Passeggero p4 = new Passeggero("Giulia Cassano", "D001", prenotazione2);
        Passeggero p5 = new Passeggero("Alessandro Armari", "E001", prenotazione3);
        Passeggero p6 = new Passeggero("Zara Dhaouadi", "F001", prenotazione4);

        passeggeroService.savePasseggero(p1);
        passeggeroService.savePasseggero(p2);
        passeggeroService.savePasseggero(p3);
        passeggeroService.savePasseggero(p4);
        passeggeroService.savePasseggero(p5);
        passeggeroService.savePasseggero(p6);

        System.out.println("Application Started");
    }

}
