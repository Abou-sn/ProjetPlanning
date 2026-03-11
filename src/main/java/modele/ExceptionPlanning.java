package modele;

public class ExceptionPlanning extends Exception {

    private ErreursPlanning typeErreur;

    public ExceptionPlanning(ErreursPlanning typeErreur) {
        this.typeErreur = typeErreur;
    }

    public ErreursPlanning getTypeErreur(){
        return typeErreur;
    }


}
