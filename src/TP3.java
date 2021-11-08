import java.util.Scanner;

public class TP3 {

    private double argent;


    public double getMontant() {
        return argent;
    }

    @Override
    public String toString() {
        return argent>0? "Vous avez : " +argent+"€ dans votre tirelire" : "Vous êtes sans le sous";
    }
}


class TP3Main{
    public static void main(String[] args) {

    }
}
