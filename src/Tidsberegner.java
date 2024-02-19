import java.util.Scanner;

public class Tidsberegner {

    public static void main(String[] args) {
        int sekund = 3;
        int minut = 1;
        int time = 2;

        System.out.println(sekund * minut * time);

        Scanner input = new Scanner(System.in);
        System.out.println("Please input ind hours, mins and seconds");
        sekund = input.nextInt();
        minut = input.nextInt();
        time = input.nextInt();

        System.out.println(sekund * minut * sekund);

        System.out.println("hvor mange timer er der gået?");
        int timer = input.nextInt();
        System.out.println("Der er gået " + timer + " timer");


        System.out.println("Hvor mange minutter er der gået?");
        int minutter = input.nextInt();
        System.out.println("Der er gået " + minutter + " minutter");


        System.out.println("Hvor mange sekunder er der gået");
        int sekunder = input.nextInt();
        System.out.println("Der er gået " + sekunder + " sekunder");

        System.out.println("Hvor mange timer, minutter og sekunder er der gået?");
        System.out.println("Der er gået " + timer + "timer, " + minutter + "minutter og " + sekunder + " sekunder");


    }
}
