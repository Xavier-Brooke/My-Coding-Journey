package Problems;

import java.util.ArrayList;
import java.util.Collections ;

public class _07_arrayLists {

    /*
    * Problem 1 :-
    * Container With most water
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static int container_with_most_water(ArrayList<Integer> heights) {
        int maxWater =  0 ;
        for(int i = 0; i < heights.size()-1; i++) {
            int waterLevel = 0 ;
            for(int j = (i+1); j < heights.size(); j++) {
                waterLevel = Math.min(heights.get(i), heights.get(j)) ;
                int tempWater = waterLevel * (j - i) ;
                maxWater = Math.max(maxWater, tempWater) ;
            }
        }
        return maxWater ;
    }

    /*
    * Problem 2 :-
    * Pair Sum 2
    * Time Complexity :- O(), Space Complexity :- O()*/
    public static boolean pairSum_2(ArrayList<Integer> list, int target) {
        int n = list.size() ;
        int lp = 0;
        int rp = n-1;
        for(int i = 0; i < n-1; i++) {
            if(list.get(i) >  list.get(i+1)) {
                lp = (i+1) ;
                rp = i ;
            }
        }

        while(lp != rp) {
            int currSum = (list.get(lp) + list.get(rp)) ;
            if(currSum == target) {
                return true ;
            } else if(currSum < target) {
                lp = (lp+1)%n ;
            } else {
                rp = (n+rp-1)%n ;
            }
        }
        return false ;
    }

    // main function
    public static void main(String[] args) {

        // Test Case for Problem 2 :-
//        ArrayList<Integer> list = new ArrayList<>() ;
//        Collections.addAll(list, 11, 15, 6, 8, 9, 10) ;
//        System.out.println(pairSum_2(list, 151));

        // Test Case for Question 1 :-
//        ArrayList<Integer> heights = new ArrayList<Integer>() ;
//        Collections.addAll(heights, 1, 8, 6, 2, 5, 4, 8, 3, 7) ;
//        System.out.println(container_with_most_water(heights));
    }
}
