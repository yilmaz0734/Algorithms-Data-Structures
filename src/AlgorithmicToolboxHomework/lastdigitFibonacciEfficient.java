package AlgorithmicToolboxHomework;

import java.util.Scanner;

public class lastdigitFibonacciEfficient {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m=scan.nextInt();
        System.out.println(fibonacci(m));
    }
    public static int fibonacci(int n) {
        int[] array=new int[n];
        array[0]=1;
        array[1]=1;
        for(int i=2;i<n;i++) {
            array[i]=(array[i-1]+array[i-2])%10;
        }
        int number = array[array.length - 1];
        return number;
    }
}
