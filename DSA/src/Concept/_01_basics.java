package Concept;

public class _01_basics {

    // main function
    public static void main(String[] args) {

//        float PI = 3.14f ;
//        System.out.println(PI);

//        char ch1 = 'a' ;
//        char ch2 = 'b' ;
//        int x = ch1 - ch2 ;
//        System.out.println(x);

        /* Operators in java */
        // 1 :- Arithmetic operator
        int a = 23 ;
        int b = 98 ;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(b / a);
//        System.out.println(b % a);

        // 2 :- relational operator
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a != b);
//        System.out.println(a == b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);

        // 3 :- logical operators
        System.out.println((a >= b) || (a != b));
        System.out.println((a > 50) && (b <= 100));
        System.out.println((a < 50) && (b >= 50));
        System.out.println((!(a > 50) && (b <= 100)));
    }
}