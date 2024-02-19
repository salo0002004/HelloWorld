import java.util.Random;

public class Terningkast {

    public static void main(String[] args) {

Random rand = new Random();

        int sum = 0;

        while(sum != 7) {
            int terning1 = rand.nextInt(6)+1;
            int terning2 = rand.nextInt(6)+1;
            sum = terning1 + terning2;

            System.out.println(terning1 + " + " + terning2 + " = " + sum);



        }

System.out.println("Det er nåede ud af loopet");

    }
}
