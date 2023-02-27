import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();
    }

    private static void task1() {
        System.out.println("Задача 1-3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] number2 = {1.57, 7.654, 9.986};
        int[] number3 = {1, 3, 7, 9};

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < number3.length; i++) {
            System.out.print(number3[i]);
            if (i != number3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = number3.length - 1; i >= 0; i--) {
            System.out.print(number3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    private static void task2() {
        System.out.println("Задача 4");
        int[] number4 = new int[3];
        number4[0] = 1;
        number4[1] = 2;
        number4[2] = 3;
        for (int i = 0; i < number4.length; i++) {
            if (number4[i] % 2 == 1) {
                number4[i]++;
            }
            System.out.print(number4[i]);
            if (number4.length - 1 != i) {
                System.out.print(", ");
            }
        }

    }

}



