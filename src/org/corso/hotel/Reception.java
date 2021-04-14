package org.corso.hotel;

public class Reception {

    private Prenotazione[] prenotazioniEffettuate;

    public Reception() {
        this.prenotazioniEffettuate = new Prenotazione[5];
    }

    // prova ad eseguire una prenotazione
    public void prenota(String nrStanza, String cognomeCliente, String codiceFiscale) {
        try {
            find(nrStanza);
            Prenotazione prenotazione = new Prenotazione(nrStanza, cognomeCliente, codiceFiscale);
            add(prenotazione, prenotazioniEffettuate);
            System.out.println("Prenotazione effettuata");
        }

        catch (CamerePieneException eccezione) {
            eccezione.Alert();

        }
    }

    // rimuove una prenotazione
    public void disdici(String cognomeCliente) {
        for (int i = 0; i <= prenotazioniEffettuate.length - 1; i++)
            if (prenotazioniEffettuate[i] != null)
                if (prenotazioniEffettuate[i].getCliente().getCognome().equals(cognomeCliente)) {
                    prenotazioniEffettuate[i] = null;
                    System.out.println("Prenotazione rimossa");
                }
    }

    // verifica se una stanza è libera o meno
    public void find(String nrStanza) throws CamerePieneException {
        for (int i = 0; i <= prenotazioniEffettuate.length - 1; i++)
            if (prenotazioniEffettuate[i] != null && prenotazioniEffettuate[i].getNrCamera().equals(nrStanza))
                throw new CamerePieneException();
    }

    public void add(Prenotazione prenotazione, Prenotazione[] prenotazioniEffettuate) {
        for (int i = 0; i <= prenotazioniEffettuate.length - 1; i++)
            if (prenotazioniEffettuate[i] == null) {
                prenotazioniEffettuate[i] = prenotazione;
                break;
            }

    }

    public void vediPrenotazioni() {
        System.out.println("Cognome cliente, Stanza, Numero Prenotazione");
        System.out.println("");
        for (int i = 0; i <= prenotazioniEffettuate.length - 1; i++)
            if (prenotazioniEffettuate[i] != null)
                System.out.println(prenotazioniEffettuate[i].getCliente().getCognome() + "   " + prenotazioniEffettuate[i].getNrCamera()
                        + "   " + prenotazioniEffettuate[i].getNumeroPrenotazione());

    }

}
