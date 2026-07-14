package Concept;

import java.util.Scanner;

public class _03_loops {

    // Question 1 :-
    // WAF to reverse a number
    public static int reverseNumber(int num) {
        int ans = 0 ;
        while(num > 0) {
            int rem = (num%10) ;
            ans = (ans* 10 + rem) ;
            num /= 10 ;
        }
        return  ans ;
    }

    // Question 2 :-
    // WAF to find if a number is prime or composite
    public static String isPrime(int num) {
        if(num <= 1) {
            return num +  " is Neither Prime nor Composite" ;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) {
                return num + " is a Composite number" ;
            }
        }

        return num + " is a Prime number" ;
    }

    // main function
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        // Test Case for Question 2 :-
//        System.out.print("Enter a number :- ");
//        int num = sc.nextInt() ;
//        String ans = isPrime(num) ;
//        System.out.println(ans);

        // Test case for Question 1 :-
//        System.out.print("Enter a number :- ");
//        int num = sc.nextInt() ;
//        System.out.println("Reverse of " + num + " is " + reverseNumber(num));
    }
}
