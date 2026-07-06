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

    // main function
    public static void main(String[] args) {

        // Test Case for Question 3 :-
        print_character_triangle(5);
        print_character_triangle(6);

        // Test Case for Question 2 :-
//        print_inverted_triangle(4);
//        print_inverted_triangle(5);

        // Test Case for Question 1 :-
//        print_triangle(5);
//        print_triangle(7);
//        print_triangle(10);
    }
}
