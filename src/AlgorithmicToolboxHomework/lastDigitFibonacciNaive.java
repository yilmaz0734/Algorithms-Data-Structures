package AlgorithmicToolboxHomework;

import java.util.Scanner;

public class lastDigitFibonacciNaive {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m=scan.nextInt();
        System.out.println(fibonacci(m));
    }
    public static int fibonacci(int n) {
        if(n<=1) {
            return n;
        }
        int fib = (fibonacci(n - 1) + fibonacci(n - 2))%10;
        return fib;
    }
}
