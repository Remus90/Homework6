public class Homework {

    public static void main(String[] args) {
              int[] numbers= {24, 36, 58, 44, 65, 88, 92};
        System.out.println(sumaNumerelor(numbers));
        System.out.println(elementeleImpare());
        System.out.println(numereleIntregi());


    }

    public static int sumaNumerelor(int numbers[]) {
        int sum = 0;
   
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;


    }

    public static int elementeleImpare() {
        int numarulElementeImpare = 0;
        int numbers[] = {15, 23, 37, 48, 57, 66, 78};
        for (int number : numbers) {
            if (number % 2 != 0) {
                numarulElementeImpare++;
            }
        }
        return numarulElementeImpare;

    }

    public static int[] numereleIntregi(int nr, int[] numbere) {
        int[] numereIntregi = {4, 7, 112, 10, 74, 27, 36, 88};
        int nr=87;

        for (int number : numbers) {
            if (number >nr ) {
                System.out.println(number);
            }
        }
        return numereIntregi[0];
    }
}
