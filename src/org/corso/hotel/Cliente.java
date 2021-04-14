package org.corso.hotel;

public class Cliente {

    private String cognome;
    private String codiceFiscale;

    public Cliente(String cognome, String codiceFiscale ) {
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

}
