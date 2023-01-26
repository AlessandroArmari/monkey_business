package com.digitazon.monkey_business.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Treno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String codice;

    @OneToMany
    private List<Prenotazione> listaPrenotazioni;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
        this.listaPrenotazioni = listaPrenotazioni;
    }

    public Treno() {
    }

    public Treno(String codice, List<Prenotazione> listaPrenotazioni) {
        this.codice = codice;
        this.listaPrenotazioni = listaPrenotazioni;
    }

    @Override
    public String toString() {
        return "Treno [id=" + id + ", codice=" + codice + ", listaPrenotazioni=" + listaPrenotazioni + "]";
    }

}
