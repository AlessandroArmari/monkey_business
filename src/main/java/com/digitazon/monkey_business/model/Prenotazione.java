package com.digitazon.monkey_business.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String codicePrenotazione;

    @Column
    private String stazionePartenza;

    @Column
    private String stazioneArrivo;

    @Column
    private String giornoViaggio;

    @Column
    private String orarioPartenza;

    @Column
    private String orarioArrivo;

    @Column
    private String carrozza;

    @Column
    private String classe;

    @Column
    private String posto;

    @Column
    private int prezzo;

    @Column
    private String metodoPagamento;

    // F.K.

    @OneToMany
    private List<Passeggero> listaPasseggeri;

    @ManyToOne
    private Treno treno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodicePrenotazione() {
        return codicePrenotazione;
    }

    public void setCodicePrenotazione(String codicePrenotazione) {
        this.codicePrenotazione = codicePrenotazione;
    }

    public String getStazionePartenza() {
        return stazionePartenza;
    }

    public void setStazionePartenza(String stazionePartenza) {
        this.stazionePartenza = stazionePartenza;
    }

    public String getStazioneArrivo() {
        return stazioneArrivo;
    }

    public void setStazioneArrivo(String stazioneArrivo) {
        this.stazioneArrivo = stazioneArrivo;
    }

     public String getGiornoViaggio() {
         return giornoViaggio;
    }

    public void setGiornoViaggio(String giornoViaggio) {
        this.giornoViaggio = giornoViaggio;
    }

    public String getOrarioPartenza() {
        return orarioPartenza;
    }

    public void setOrarioPartenza(String orarioPartenza) {
        this.orarioPartenza = orarioPartenza;
    }

    public String getOrarioArrivo() {
        return orarioArrivo;
    }

    public void setOrarioArrivo(String orarioArrivo) {
        this.orarioArrivo = orarioArrivo;
    }

    public String getCarrozza() {
        return carrozza;
    }

    public void setCarrozza(String carrozza) {
        this.carrozza = carrozza;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public List<Passeggero> getListaPasseggeri() {
        return listaPasseggeri;
    }

    public void setListaPasseggeri(List<Passeggero> listaPasseggeri) {
        this.listaPasseggeri = listaPasseggeri;
    }

    public Treno getTreno() {
        return treno;
    }

    public void setTreno(Treno treno) {
        this.treno = treno;
    }

    public Prenotazione() {
    }

    

    public Prenotazione(String codicePrenotazione, String stazionePartenza, String stazioneArrivo, String giornoViaggio,
            String orarioPartenza, String orarioArrivo, String carrozza, String classe, String posto, int prezzo,
            String metodoPagamento, List<Passeggero> listaPasseggeri, Treno treno) {
        this.codicePrenotazione = codicePrenotazione;
        this.stazionePartenza = stazionePartenza;
        this.stazioneArrivo = stazioneArrivo;
        this.giornoViaggio = giornoViaggio;
        this.orarioPartenza = orarioPartenza;
        this.orarioArrivo = orarioArrivo;
        this.carrozza = carrozza;
        this.classe = classe;
        this.posto = posto;
        this.prezzo = prezzo;
        this.metodoPagamento = metodoPagamento;
        this.listaPasseggeri = listaPasseggeri;
        this.treno = treno;
    }


    @Override
    public String toString() {
        return "Prenotazione [id=" + id + ", codicePrenotazione=" + codicePrenotazione + ", stazionePartenza="
                + stazionePartenza + ", stazioneArrivo=" + stazioneArrivo + ", giornoViaggio=" + giornoViaggio
                + ", orarioPartenza=" + orarioPartenza + ", orarioArrivo=" + orarioArrivo + ", carrozza=" + carrozza
                + ", classe=" + classe + ", posto=" + posto + ", prezzo=" + prezzo + ", metodoPagamento="
                + metodoPagamento + ", listaPasseggeri=" + listaPasseggeri + ", treno=" + treno + "]";
    }

   

}
