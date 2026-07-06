import java.util.Scanner ;

public class _02_conditionalStatements {

    // Question 1 :-
    // function for calculating tax using if-else concept
    public static double getTax(float income) {
        double totalTax = 0.0d ;

        if(income < 500000) {
            return totalTax ;
        } else if((income > 500000) && (income < 1000000)) {
            float tax = 20.0f/100.0f ;
            return income * tax ;
        } else if(income > 1000000) {
            float tax = 30.0f/100.0f ;
            return income * tax ;
        }

        return totalTax ;
    }

    // Question 2 :-
    // use the concept of switch statement in calculator
    public static void calculator() {
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Enter first operand :- ");
        int x = sc.nextInt() ;
        System.out.print("Enter second operand :- ");
        int y = sc.nextInt() ;
        System.out.print("Enter operator :- ");
        char ope = sc.next().charAt(0) ;

        switch(ope) {
            case '+' :
                System.out.println("Sum of " + x + " and " + y + " is " + (x+y));
                break ;

            case '-' :
                System.out.println("Difference of " + x + " and " + y + " is " + (x-y));
                break ;

            case '*' :
                System.out.println("Multiplication of " + x + " and " + y + " is " + (x*y));
                break ;

            case '/' :
                System.out.println("Division of " + x + " and " + y + " is " + (x/y));
                break ;

            case '%' :
                System.out.println("Modulo of " + x + " and " + y + " is " + (x%y));
                break ;

            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }

    // main function
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in) ;

        // Test Case for Question 1 :-
//        System.out.print("Enter your income :- ");
//        float income = sc.nextFloat() ;
//        double tax = getTax(income) ;
//        System.out.println("You have to pay " + tax + " as a tax");

        /* Ternary operator
        * variable = condition?statement1:statement2 ;
        * */
//        System.out.print("Enter a number :- ");
//        int n = sc.nextInt() ;
//        boolean isOdd = ((n%2) == 0) ? false : true ;
//        if(isOdd) {
//            System.out.println(n + " is a odd number.");
//        } else {
//            System.out.println(n + " is even number");
//        }

//        System.out.print("Enter a number :- ");
//        int n = sc.nextInt() ;
//        String typeOf_n = (n%2 == 0)? "Even" : "Odd" ;
//        System.out.println(n + " is " + typeOf_n + " number");

        // switch operator
        calculator();

    }
}
