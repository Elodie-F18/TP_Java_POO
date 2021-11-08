import java.util.Scanner;

public class TP2 {

    private double poids;
    private double taille;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getIMC(){
        return poids / Math.pow(taille, 2.0);
    }
}


class TP2main{
    public static void main(String[] args) {
        TP2 patient = new TP2();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("============= Création de patient =============");
        System.out.print("Entrez la taille du patient: ");
        double taille = keyboard.nextDouble();

        System.out.print("Entrez le poid du patient: ");
        double poids = keyboard.nextDouble();

        patient.setTaille(taille);
        patient.setPoids(poids);

        System.out.println("Taille du patient: " + patient.getTaille());
        System.out.println("Poid du patient: " + patient.getPoids());
        System.out.println("IMC : " + patient.getIMC()) ;
    }
}
