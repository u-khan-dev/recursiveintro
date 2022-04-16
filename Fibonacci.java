// print the n-th Fibonacci number

/*
 Fibonacci Sequence:
 n    =  0, 1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11,  12
 F(n) =  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144


 If n = 10, the 10th Fibonacci number, F(10) is: 55.
 */

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;

        return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

}