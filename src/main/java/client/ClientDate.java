package client;

import modele.Date;

public class ClientDate {
    public static void main(String[] args) {

        Date d = new Date(13, 1, 2026);
        Date d2 = new Date(12, 12, 2026);

        System.out.println(d2.equals(new Date(12, 12, 2026)));

        System.out.println(d.compareTo(d2));

    }
}
