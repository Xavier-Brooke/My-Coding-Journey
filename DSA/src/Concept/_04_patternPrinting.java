package Concept;

public class _04_patternPrinting {

    // Question 1 :-
    // WAF to print triangle pattern :-
    public static void print_triangle(int rows) {
        for(int i = 0; i <= rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Question 2 :-
    // WAF to print inverted triangle pattern :-
    public static void print_inverted_triangle(int rows) {
        for(int i = 0; i <= rows; i++) {
            for(int j = i; j <= rows; j++) {
                System.out.print("*") ;
            }
            System.out.println();
        }
        System.out.println();
    }

    // Question 3 :-
    // WAF to print character triangle
    public static void print_character_triangle(int rows) {
        for(int i = 1; i <= rows; i++) {
            char ch = (char)(64) ;
            for(int j = 1; j <= i; j++) {
                System.out.print(++ch + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Question 4 :-
    // WAF to print zero-one triangle
    public static void print_zero_one_triangle(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Question 5 :-
    // WAF to print butterfly patter
    public static void print_butterfly_pattern(int rows) {
        int nst = 1 ;
        int nsp = (2*rows)-2 ;
        for(int i = 1; i <= (2*rows); i++) {
            for(int p = 1; p <= nst; p++) {
                System.out.print("* ");
            }
            for(int q = 1; q <= nsp; q++) {
                System.out.print("  ");
            }
            for(int r = 1; r <= nst; r++) {
                System.out.print("* ");
            }
            if(i < rows) {
                nst++ ;
                nsp -= 2 ;
            } else if(i > rows) {
                nst-- ;
                nsp += 2 ;
            }
            System.out.println();
        }
    }

    // Question 6 :-
    // WAF to print hollow rhombus
    public static void print_hollow_rhombus(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int p = 1; p <= (rows-i); p++) {
                System.out.print("  ");
            }
            for(int q = 1; q <= rows; q++) {
                if((i == 1) || (q == 1) || (i == rows) || (q == rows)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Question 7 :-
    // WAF to print diamond pattern
    public static void print_diamond_pattern(int rows) {
        int nst = 1 ;
        int nsp = (rows-1) ;
        for(int i = 1; i <= (rows*2); i++) {
            for(int p = 1; p <= nsp; p++) {
                System.out.print("  ");
            }
            for(int q = 1; q <= nst; q++) {
                System.out.print("* ");
            }
            if(i < rows) {
                nst += 2;
                nsp-- ;
            } else if(i > rows) {
                nst -= 2 ;
                nsp++ ;
            }

            System.out.println();
        }
    }

    // Question 8 :-
    // WAF to print unique pattern
    public static void print_unique_pattern(int rows) {
        for(int i = 1; i <= (2*rows-1); i++) {
            for(int j = 1; j <= (2*rows-1); j++) {
                int minI = i ;
                int minJ = j ;
                if(i > rows) {
                    minI = 2*rows-i ;
                }
                if(j > rows) {
                    minJ = 2*rows-j ;
                }
                System.out.print(Math.min(minI, minJ) + " ") ;
            }
            System.out.println();
        }
    }

    // main function
    public static void main(String[] args) {

        // Test Case for Question 8 :-
        print_unique_pattern(4);

        // Test Case for Question 7 :-
//        print_diamond_pattern(5);

        // Test Case for Question 6 :-
//        print_hollow_rhombus(5);

        // Test Case for Question 5 :-
//        print_butterfly_pattern(4);

        // Test Case for Question 4 :-
//        print_zero_one_triangle(4);
//        print_zero_one_triangle(5);

        // Test Case for Question 3 :-
//        print_character_triangle(5);
//        print_character_triangle(6);

        // Test Case for Question 2 :-
//        print_inverted_triangle(4);
//        print_inverted_triangle(5);

        // Test Case for Question 1 :-
//        print_triangle(5);
//        print_triangle(7);
    }
}
