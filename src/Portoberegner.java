import java.util.Scanner;

public class Portoberegner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hvor meget vejer dit brev?");
        double prisfor100 = 25;
        double brevVægt = input.nextDouble();
        double prisForBrev = prisfor100 * (brevVægt / 100);


        if (brevVægt == 0 || brevVægt < 0) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        } else if (brevVægt <= 100) {
            System.out.println("Det koster " + prisForBrev);
        } else if (brevVægt > 100 && brevVægt <= 200) {
            System.out.println("Det koster " + prisForBrev);
        } else if (brevVægt > 200 && brevVægt <= 300) {
            System.out.println("Det koster " + prisForBrev);
        } else if (brevVægt > 300 && brevVægt <= 400) {
            System.out.println("Det koster " + prisForBrev);
        } else if (brevVægt > 400 && brevVægt <= 500) {
            System.out.println("Det koster " + prisForBrev);
        } else {
            System.out.println("Et brev med denne vægt kan vi ikke sende");


        }

    }
}