package Problems;

public class _08_strings {

    /*
    * Problem 1 :-
    * WAF to determine if 2 Strings are anagrams of each other
    * Time Complexity :- O(n), Space Complexity :- O(n)*/
    public static boolean isAnagram(String str1, String str2) {

        int len1 = str1.length() ;
        int len2 = str2.length() ;

        if(len1 != len2) {
            return false ;
        }

        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;
        int[] freq = new int[26] ;

        for(int i = 0; i < len1; i++) {
            char ch1 = str1.charAt(i) ;
            char ch2 = str2.charAt(i) ;
            freq[(ch1 - 'a')]++ ;
            freq[(ch2 - 'a')]-- ;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                return false ;
            }
        }

        return true ;
    }

    /* main function */
    public static void main(String[] args) {

        // Test Case For Problem 1 :-
        String str1 = "racecar" ;
        String str2 = "carbace" ;
        System.out.println(isAnagram(str1, str2));
    }
}
