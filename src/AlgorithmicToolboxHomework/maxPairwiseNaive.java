package AlgorithmicToolboxHomework;

import java.util.Scanner;

public class maxPairwiseNaive {
    public static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int m=scan.nextInt();
        int[] numbers=new int[m];
        for(int j=0;j<m;j++) {
            numbers[j] = scan.nextInt();
        }
        System.out.println(maxPairwise(numbers));
    }
    public static int maxPairwise(int[] array) {
        int first=1;
        int second=1;
        for(int i=0;i<array.length;i++) {
            if(array[i]>first) {
                second=first;
                first=array[i];
            }
            else if(array[i]>second) {
                second=array[i];
            }
        }
        int max = first * second;
        return max;
    }
}
