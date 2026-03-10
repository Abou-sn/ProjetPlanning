package client;

import modele.*;

import java.util.Arrays;

public class ClientPlanning {
    public static void main(String[] args) {
        String titre1 = "Muscu";
        Date d1 = new Date(13,02,2025);
        PlageHoraire ph1 = new PlageHoraire(new Horaire(20,45),new Horaire(21,15));

        String titre2 = "Manger";
        Date d2 = new Date(14,02,2025);
        PlageHoraire ph2 = new PlageHoraire(new Horaire(20,45),new Horaire(21,30));

        String titre3 = "Douche";
        Date d3 = new Date(15,02,2025);
        PlageHoraire ph3 = new PlageHoraire(new Horaire(21,30),new Horaire(22,00));

        Reservation r1 = new Reservation(titre1,d1, ph1);
        Reservation r2 = new Reservation(titre2,d2, ph2);
        Reservation r3 = new Reservation(titre3,d3, ph3);

        Planning monPlanning = new Planning(3);

        System.out.println(monPlanning);

        monPlanning.ajout(r1); monPlanning.ajout(r2); monPlanning.ajout(r3);

        System.out.println(monPlanning);

        System.out.println(Arrays.toString(monPlanning.getReservations(d2)));
    }
}
