import java.util.Scanner;
public class Sentinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SENTINAL = -1;
        int sum = 0;
        int tal = 0;

        System.out.println("indtast de tal der skal lægges sammen, eller -1 for at stoppe.");

        while (tal != SENTINAL) {

            sum += tal;
            tal = scanner.nextInt();


        }

System.out.println("Din sum er " + sum);

    }
}
