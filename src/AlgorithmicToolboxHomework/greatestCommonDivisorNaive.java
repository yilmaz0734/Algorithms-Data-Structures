package AlgorithmicToolboxHomework;

import java.util.Scanner;

public class greatestCommonDivisorNaive {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m=scan.nextInt();
        int k=scan.nextInt();
        long start = System.nanoTime();
        System.out.println(greatest(m,k));
        long elapsedTime = System.nanoTime() - start;
        System.out.println(elapsedTime);
    }
    public static int greatest(int a,int b) {
        int min=0;
        int gdc=1;
        if(a>b) {
            min=b;
        }
        else {
            min=a;
        }
        for(int i=min;i>0;i--) {
            if((a%i==0) && (b%i==0)) {
                gdc=i;
                break;
            }
        }
        return gdc;
    }
}
