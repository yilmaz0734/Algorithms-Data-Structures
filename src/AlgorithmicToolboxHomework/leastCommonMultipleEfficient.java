package AlgorithmicToolboxHomework;

import java.util.Scanner;

public class leastCommonMultipleEfficient {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m=scan.nextInt();
        int k=scan.nextInt();
        long start = System.nanoTime();
        System.out.println(lcm(m,k));
        long elapsedTime = System.nanoTime() - start;
        System.out.println(elapsedTime);
    }
    public static int lcm(int a,int b) {
        int c, min;
        if(a>b) {
            c=a%b;
            min=b;
        }
        else {
            c=b%a;
            min=a;
        }
        int gdc=1;
        for(int i=min;i>0;i--) {
            if(min%i==0 && c%i==0) {
                gdc=i;
                break;
            }
        }
        int leastCommon = a * b / gdc;
        return leastCommon;
    }
}
