package com.digitazon.monkey_business.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Passeggero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cartaFreccia;

    @ManyToOne
    private Prenotazione prenotazione;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCartaFreccia() {
        return cartaFreccia;
    }

    public void setCartaFreccia(String cartaFreccia) {
        this.cartaFreccia = cartaFreccia;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }

    public Passeggero() {
    }

    public Passeggero(String nome, String cartaFreccia, Prenotazione prenotazione) {
        this.nome = nome;
        this.cartaFreccia = cartaFreccia;
        this.prenotazione = prenotazione;
    }

    @Override
    public String toString() {
        return "Passeggero [id=" + id + ", nome=" + nome + ", cartaFreccia=" + cartaFreccia + ", prenotazione="
                + prenotazione + "]";
    }

}
