package client;

import modele.Horaire;

public class ClientHoraire {
    public static void main(String[] args) {
        Horaire h1 = new Horaire(18,45);
        System.out.println(h1.getHeure());
        h1.setHeure(15);
        h1.setQuartHeure(30);
        System.out.println(h1);

    }
}
