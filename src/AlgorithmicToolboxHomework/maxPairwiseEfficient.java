package AlgorithmicToolboxHomework;

import java.util.Arrays;
import java.util.Scanner;

class maxPairwiseProduct {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m= scan.nextInt();
        long[] sayilar=new long[m];
        for(int i=0;i<m;i++) {
            sayilar[i]=scan.nextInt();
        }
        Arrays.sort(sayilar);
        long maxPairwise=sayilar[sayilar.length-1]*sayilar[sayilar.length-2];
        System.out.println(maxPairwise);
    }
}

