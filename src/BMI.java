import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("indtast din højde i meter");
        double højde = input.nextDouble();
        System.out.println("indtast din vægt i KG");
        double vægt = input.nextDouble();
        double bmi = vægt / (højde * højde);
        System.out.println("Din BMI er " + bmi +" kg");

        if (bmi < 18.5) {
            System.out.println("BMI-værdien viser at du er undervægtig");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Bmi-værdien viser at du er normalvægtig");
        } else if (bmi > 25 && bmi <=30){
            System.out.println("Bmi-værdien viser at du er overvægtig");
        } else {
            System.out.println("BMI-værdien viser at du er svægt overvægtig");


        }
    }


}



