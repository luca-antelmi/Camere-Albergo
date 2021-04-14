import org.corso.hotel.Reception;

public class Hotel {

    public static void main(String[] args) throws Exception {

        Reception reception = new Reception();

        // popolo l'albergo
        reception.prenota("100", "Gialli", "G");
        reception.prenota("101", "Rossi", "R");
        reception.prenota("102", "Verdi", "V");
        reception.prenota("103", "Bianchi", "B");
        reception.prenota("104", "Neri", "N");
        System.out.println("");

        // rimuovo due prenotazioni
        reception.disdici("Bianchi");
        reception.disdici("Rossi");
        System.out.println("");

        // aggiungo tre prenotazioni
        reception.prenota("103", "Marroni", "M");
        reception.prenota("101", "Arancioni", "A");
        reception.prenota("102", "Fucsia", "F"); // CAMERA GIA PRENOTATA
        System.out.println("");

        // controllo le prenotazioni
        reception.vediPrenotazioni();

    }

}
