/* Вывести все простые числа от 1 до 1000  */

import java.util.Scanner;
public class primeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = console.nextInt();
        primeNumbersOf(num);
        console.close();
    }
    static boolean isPrime(int number) {
        for (int i = 3; i * i <= number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void primeNumbersOf(int n) {
        if (n < 2) {
            System.out.println("Incorrect num!");
        } else {
            System.out.print(2 + " ");
            for (int i = 3; i < n; i+=2) {
                if (isPrime(i)) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
