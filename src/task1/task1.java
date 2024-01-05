package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("число " + number + " чётное");
        } else {
            System.out.println("число " + number + " нечётное");
        }

    }
}
