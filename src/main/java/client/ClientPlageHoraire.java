package client;

import modele.Horaire;
import modele.PlageHoraire;

public class ClientPlageHoraire {
    public static void main(String[] args) {

     Horaire debut = new Horaire(20,45);
     Horaire fin = new Horaire(21,0);

     PlageHoraire ph = new PlageHoraire(debut, fin);

     System.out.println(ph); //Affichage de la plage horaire
     System.out.println(ph.estValide()); // Affichage de la validité

    }
}
