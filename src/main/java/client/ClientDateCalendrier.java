package client;

import modele.DateCalendrier;

import java.util.Arrays;

public class ClientDateCalendrier {
    public static void main(String[] args) {

//        DateCalendrier dc4 = new DateCalendrier(31, 1, 2025);
//        System.out.println(dc4);
//
//        DateCalendrier dc5 = dc4.dateDuLendemain();
//        System.out.println(dc5);
//
//        DateCalendrier dc6 = dc5.dateDeLaVeille().dateDeLaVeille();
//        System.out.println(dc6);
//
//        DateCalendrier [] tabDeDate = {dc4,dc5,dc6};
//
//
//        System.out.println(Arrays.toString(tabDeDate));
//        Arrays.sort(tabDeDate);
//        System.out.println(Arrays.toString(tabDeDate));
//
//        DateCalendrier dc7 = new DateCalendrier(1,5,2026);
//
//        System.out.println(dc7);

        DateCalendrier ajd = new DateCalendrier();
        System.out.println(ajd);
        DateCalendrier dm1 = ajd.dateDuLendemain();
        System.out.println(dm1);

    }

}
