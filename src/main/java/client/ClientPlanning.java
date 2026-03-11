package client;

import modele.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClientPlanning {
    public static void main(String[] args) {
        try {
            Planning planning = new Planning(5);

            // Instancie le scanner avec pour flux d'entrée le fichier texte
            Scanner scanner = new Scanner(new File("data" + File.separator + "planning.txt"));

            // La virgule est le délimiteur qui sépare les données
            scanner.useDelimiter(",");

            while (scanner.hasNext()) {
                String intitule = scanner.next().trim();
                int jour = scanner.next();
                int mois = scanner.nextInt();
                int annee = scanner.nextInt();

                Date date = new Date(jour,mois,annee);
                Horaire debut = new Horaire(scanner.nextInt(),scanner.nextInt());
                Horaire fin = new Horaire(scanner.nextInt(),scanner.nextInt());

                PlageHoraire plageHoraire = new PlageHoraire(debut,fin);

                planning.ajout(new Reservation(intitule,date,plageHoraire));

            }

            System.out.println(planning);
            scanner.close();
        }

        catch (FileNotFoundException exception) { // Fichier non trouvé
            System.out.println(exception.getMessage());
        }
        catch (InputMismatchException exception) { // Mauvais type
            System.out.println("Mauvais Type");
            System.out.println(exception.getMessage());
        }
        catch (NoSuchElementException exception) { //L'elm n'existe pas
            System.out.println(exception.getMessage());
        }
        catch (IllegalStateException exception) { // Quand le scanner est fermé
            System.out.println(exception.getMessage());
        }




    }
}