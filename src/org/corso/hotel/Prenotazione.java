package org.corso.hotel;

public class Prenotazione {

    private String nrCamera;
    private Cliente cliente;
    private static int numeroGeneralePrenotazione = 0;
    private int numeroPrenotazione;


    

    public Prenotazione(String nrCamera, String cognomeCliente, String codiceFiscale) {
        this.nrCamera = nrCamera;
        this.cliente = new Cliente(cognomeCliente, codiceFiscale);
        this.numeroGeneralePrenotazione ++;
        this.numeroPrenotazione = numeroGeneralePrenotazione;
    }

    public String getNrCamera() {
        return this.nrCamera;
    }

    public Cliente getCliente() {
        return this.cliente;

    }

    public int getNumeroPrenotazione() {
        return this.numeroPrenotazione;
    }
}
