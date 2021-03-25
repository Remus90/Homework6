public class Homework {

    public static void main(String[] args) {
        System.out.println(sumaNumerelor());
        System.out.println(elementeleImpare());
        System.out.println(numereleIntregi());


    }

    public static int sumaNumerelor() {
        int sum = 0;
        int numbers[] = {24, 36, 58, 44, 65, 88, 92};
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

    public static int[] numereleIntregi() {
        int[][] numereIntregi = {{4, 7, 112, 10, 74, 27, 36, 88}, {87}};

        for (int primeleNumere : numereIntregi[0]) {
            for (int alDoileaNumar : numereIntregi[1]) {
                if (primeleNumere > alDoileaNumar) {

                }

            }
        }
        return numereIntregi[0];
    }
}
