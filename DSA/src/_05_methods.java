public class _05_methods {

    // Question 1 :-
    // WAF to calculate binomial coefficient of a number :-
    public static int factorial(int n) {
        int fact = 1 ;

        for(int i = 2; i <= n; i++) {
            fact *= i ;
        }

        return fact ;
    }

    public static int binomialCoefficient(int n, int r) {
        int factorial_n = factorial(n) ;
        int factorial_r = factorial(r) ;
        int factorial_nr = factorial(n-r) ;
        int nCr = (factorial_n)/((factorial_nr) * (factorial_r)) ;
        return nCr ;
    }

    // Question 2 :-
    // WAF to print all prime numbers from 2 to n
    public static void primeRange(int n) {
        for(int i = 2; i <= n; i++) {
            boolean isPrime = true ;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    isPrime = false ;
                    break ;
                }
            }
            if(isPrime) {
                System.out.print(i + ",");
            }
        }
    }

    // Question 3 :-
    // WAF to convert Binary number to Decimal number
    public static int binary_to_decimal(int num) {
        int ans = 0 ;
        int pow = 0 ;
        while(num > 0) {
            int rem = num%10;
            ans += (rem * (int)(Math.pow(2, pow))) ;
            pow++ ;
            num /= 10 ;
        }
        return ans ;
    }

    // Question 4 :-
    // WAF to convert Decimal number to Binary number
    public static int decimal_to_binary(int num) {
        int ans = 0 ;
        int pow = 0 ;

        while(num > 0) {
            int rem = num%2 ;
            ans += (rem * (int)Math.pow(10, pow)) ;
            pow++ ;
            num /= 2 ;
        }

        return ans ;
    }

    // main function
    public static void main(String[] args) {

        // Test Case for Question 4 :-
        System.out.println(decimal_to_binary(5));
        System.out.println(decimal_to_binary(69));

        // Test Case for Question 3 :-
//        System.out.println(binary_to_decimal(1000101));
//        System.out.println(binary_to_decimal(1010));

        // Test Case for Question 2 :-
//        primeRange(100);

        // Test Case for Question 1 :-
//        System.out.println(binomialCoefficient(5, 2)); ;
    }
}
