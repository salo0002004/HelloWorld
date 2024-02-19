public class ArrayDemo {

    public static void main(String[] args) {

        int[] array = new int[8];
        array[0] = 34;
        array[7] = 177;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

            String[] hello = new String[3];
            hello[0] = "Hej";
            hello[1] = "med";
            hello[2] = "dig";

            for (String i: hello) {
                System.out.print(i + " ");

            }

            double [] numbers = {3.4, 2.5, 1.2, 6.7};
        System.out.println(numbers[2]);

        }



    }
