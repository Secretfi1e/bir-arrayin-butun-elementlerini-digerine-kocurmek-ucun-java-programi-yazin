public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        int newnumberslength = 7;
        int indexForUniques = 0;

        int[] number = new int[newnumberslength];
        for (int i = 0; i < numbers.length; i++) {

            if (indexForUniques < newnumberslength) {

                number[indexForUniques] = numbers[i];
                indexForUniques++;


                System.out.println(number[i]);

            }
        }
    }
}



