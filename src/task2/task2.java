package task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите температуру");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 & t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
