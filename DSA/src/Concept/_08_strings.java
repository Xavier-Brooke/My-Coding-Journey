package Concept;

import java.util.Scanner ;

public class _08_strings {

    /*
    * Question 1 :-
    * WAF to check if a given string is palindrome or not
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static String isPalindrome(String str) {
        int i = 0 ;
        int j = str.length()-1 ;
        str = str.toLowerCase() ;
        while(i < j) {
            int firstChar = str.charAt(i) ;
            int lastChar = str.charAt(j) ;
            if(firstChar != lastChar) {
                return (str + " is not a palindrome") ;
            }
            i++ ;
            j-- ;
        }

        return (str + " is a palindrome") ;
    }

    /*
    * Question 2 :-
    * WAF to find the shortest distance
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static double shortestDistance(String str) {
        str = str.toUpperCase() ;
        int x = 0 ;
        int y = 0 ;
        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i) ;
            if(currChar == 'N') {
                y++ ;
            } else if(currChar == 'E') {
                x++ ;
            } else if(currChar ==  'S') {
                y-- ;
            } else if(currChar == 'W') {
                x-- ;
            }
        }

        return (Math.sqrt(Math.pow(x,2) + Math.pow(y, 2))) ;
    }

    /*
    * Questin 3 :-
    * WAF to print substring of a string
    * Time Complexity :- O(n), Space Complexity :- O(n)*/
    public static String substring(String str, int si, int ei) {
        String string = "" ;
        for(int i = si; i < ei; i++) {
            string += str.charAt(i) ;
        }
        return string ;
    }

    /*
    * Question 4 :-
    * for a given array of string print the largest string
    * Time Complexity :- O(), Space Complexity :- O()*/
    public static String largestString(String[] strArr) {
        String largest = strArr[0] ;
        for(int i = 1; i < strArr.length; i++) {
            if((largest.compareToIgnoreCase(strArr[i])) <= 0) {
                largest = strArr[i] ;
            }
        }

        return largest ;
    }

    // main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        // Test Case for Question 4 :-
        String[] fruits = {"Apple", "apple", "BaNana", "Mango", "Orange", "orAngE"} ;
        System.out.println(largestString(fruits));

        // Test Case for Question 3 :-
//        String str = "Hello World" ;
//        System.out.println(substring(str, 0, 5));

        // Test Case for Questin 2 :-
//        String str = "wneenesennn" ;
//        System.out.println(shortestDistance(str));

        // Test Case for Question 1 :-
//        System.out.print("Enter a string to check whether it is a palindrome or not :- ");
//        String str = sc.nextLine() ;
//        System.out.println(isPalindrome(str));

        // basics of Strings

        // 3. :-
//        String str = "Hello World" ;
//        System.out.println(str.substring(0, 5));

        // 2. :-
//        String str = "ABCDE" ;
//        System.out.println(str);

//        String str = sc.nextLine() ;
//        System.out.println(str);
        // 1. :-
//        char[] chars = {'a', 'b', 'c', 'd', 'e'} ;
//        for(int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i) + " ");
//        }

        sc.close() ;
    }
}
