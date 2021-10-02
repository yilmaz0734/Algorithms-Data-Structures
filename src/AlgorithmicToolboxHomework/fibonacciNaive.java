package AlgorithmicToolboxHomework;

public class fibonacciNaive {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    public static int fibonacci(int n) {
        if(n<=1) {
            return n;
        }
        int fib = fibonacci(n - 1) + fibonacci(n - 2);
        return fib;
    }
}
