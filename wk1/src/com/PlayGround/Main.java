package com.PlayGround;

public class Main {

    public static void main(String[] args) {
	printPrimes(Integer.parseInt(args[0]));

    }

    private static void printPrimes(int limit) {
        for (int p = 2; p <=limit; p++ ) {
            if (isPrime(p)){
                System.out.println(p + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int x){
     if (x <= 1){
         return false;
     }
     else
         return !isDivisible(x, 2); //! is menaing not
    }

    private static boolean isDivisible(int x, int k){
        if (k >= x){
            return false;
        }
        else if (x % k == 0){
            return true;
        }
        else
            return isDivisible(x, k+1);
    }
}
