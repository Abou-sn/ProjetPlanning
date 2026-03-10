package client;

import modele.Date;
import modele.Horaire;
import modele.PlageHoraire;
import modele.Reservation;

public class ClientReservation {
    public static void main(String[] args) {
        String titre = "Muscu";
        Date d = new Date(13,02,2025);
        PlageHoraire ph = new PlageHoraire(new Horaire(20,45),new Horaire(21,15));
        Reservation r1 = new Reservation(titre,d,ph);

        System.out.println(r1);
    }
}
