package modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanningCollections {
     private ArrayList <Reservation> reservationArrayList;
     private TreeSet <Reservation> reservationTreeSet;

    /**
     * Constructeur qui instancie les Arraylist et TreeSet
     */
     public PlanningCollections (){
         reservationArrayList = new ArrayList<Reservation>();
         reservationTreeSet = new TreeSet<Reservation>();
     }

    /**
     * Méthode qui ajoute une reservation de la classe Reservation au planning.
     *
     * La reservation est ajouté au ArrayList et au TreeSet
     * Renvoi une exception dans le cas ou la reservation est invalide ou incompatible avec ceux déja présentes.
     *
     * @param res la reservation à ajouter.
     * @throws ExceptionPlanning
     */
     public void ajout(Reservation res) throws ExceptionPlanning{
         if (!res.estValide()) throw new ExceptionPlanning(ErreursPlanning.RESERVATION_NON_VALIDE);

         Iterator <Reservation> arrayIterateur = reservationArrayList.iterator();
         while (arrayIterateur.hasNext()){
             Reservation autreRes = arrayIterateur.next();
             if (res.compareTo(autreRes)==0) throw new ExceptionPlanning(ErreursPlanning.RESERVATION_INCOMPATIBLE);

         }
         reservationArrayList.add(res);

         Iterator <Reservation> setIterateur = reservationTreeSet.iterator();
         while (setIterateur.hasNext()){
             Reservation autreRes = arrayIterateur.next();
             if (res.compareTo(autreRes)==0) throw new ExceptionPlanning(ErreursPlanning.RESERVATION_INCOMPATIBLE);
         }
         reservationTreeSet.add(res);
     }

    public String toString() {
        String array = "ArrayList : " + reservationArrayList.toString();
        String set =  "TreeSet : " + reservationTreeSet.toString();

        return array + "\n" + set ;
    }
}
