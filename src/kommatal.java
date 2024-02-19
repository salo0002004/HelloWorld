
import java.util.Scanner;

public class kommatal {

    public static void main(String[] args) {

        System.out.println("Indtast en længde i tommer:");


        Scanner input = new Scanner(System.in);
        double tommer= input.nextDouble();
        final double LENGTHVALUE = 2.54;
        double centimeter = (tommer*LENGTHVALUE);


        System.out.println(tommer+ " tommer svarer til " + centimeter + " centimeter" );





    }
}
