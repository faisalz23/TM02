import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Angka Fibonacci:");
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }

        int sumOfEvenFibonacciNumbers = 0;
        int numberOfEvenFibonacciNumbers = 0;
        a = 0;
        b = 1;
        for (int i = 0; i < n; i++) {
            if (a % 2 == 0) {
                sumOfEvenFibonacciNumbers += a;
                numberOfEvenFibonacciNumbers++;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Banyaknya Bilangan Genap: " + numberOfEvenFibonacciNumbers);
        System.out.println("Jumlah Bilangan Fibonacci Genap: " + sumOfEvenFibonacciNumbers);
    }
}
