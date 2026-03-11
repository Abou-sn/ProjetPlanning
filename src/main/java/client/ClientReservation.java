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

        String t2 = "Manger";
        PlageHoraire ph2 = new PlageHoraire(new Horaire(21,15),new Horaire(22,30));
        Reservation r2 = new Reservation(t2,d,ph2);


        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1.compareTo(r2));
    }
}
