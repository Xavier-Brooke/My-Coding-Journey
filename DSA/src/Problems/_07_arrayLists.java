package Problems;

import java.util.ArrayList;
import java.util.Arrays;
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

    /*
    * Problem 3 :-
    * Adding 1 to the ArrayList
    * Time Complexity :- O(), Space Complexity :- O()*/
    public static void addOne(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>() ;
        for(int ele : arr) {
            list.add(ele) ;
        }

        int curr = list.size()-1 ;
        int currEle = list.get(curr) ;

        if(currEle < 9) {
            list.set(curr, (currEle + 1)) ;
        } else {
            while(currEle >= 9 && curr > 0) {
                list.set(curr, 0) ;
                curr-- ;
                currEle = list.get(curr) ;
                list.set(curr, (currEle+1)) ;
            }
        }

        if(list.getFirst() > 9) {
            list.removeFirst() ;
            list.addFirst(0); ;
            list.addFirst(1); ;
        }
        System.out.println("---".repeat(10));
        System.out.print(list);
        System.out.println();
    }

    /*
    * Problem 4 :-
    * WAF to add two arrays where every element of the array is <= 9
    * Time Complexity :- O(), Space Complexity :- O()*/
    public static ArrayList<Integer> add_arrays(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> ans = new ArrayList<>() ;

        int p = a.size()-1 ; // pointer for a
        int q = b.size()-1 ; // pointer for b

        // step 1 :- first we will simply calculate the sum of a and b
        int curr = Math.min(a.size(), b.size()) ;
        while(curr > 0) {
            int sum = a.get(p) + b.get(q) ;
            ans.addFirst(sum);
            p-- ;
            q-- ;
            curr-- ;
        }

        // Step 2 :- now we will simply push element of a or b (if size is different)
        while(p >= 0) {
            ans.addFirst(a.get(p));
            p-- ;
        }
        while(q >= 0) {
            ans.addFirst(b.get(q));
            q-- ;
        }

        // Step 3 :- Now we will make every element of ans in range of 0 to 9
        int r = ans.size()-1 ;
        while(r > 0) {
            int currEle = ans.get(r) ;
            if(currEle > 9) {
                int ele = currEle%10 ;
                ans.set(r, ele) ;
                int prevEle = (ans.get(r-1)) ;
                ans.set(r-1, prevEle+1) ;
            }
            r-- ;
        }

        if(ans.size() > 0) {
            int firstEle = ans.getFirst() ;
            if(firstEle > 9) {
                ans.set(0, firstEle%10) ;
                ans.addFirst(1);
            }
        }

        return ans ;
    }

    // main function
    public static void main(String[] args) {

        // Test Case for Problem 4 :-
        ArrayList<Integer> a = new ArrayList<>() ;
        Collections.addAll(a, 9, 9, 9, 9, 9) ;

        ArrayList<Integer> b = new ArrayList<>() ;
        Collections.addAll(b, 9, 9, 9, 9, 9) ;

        ArrayList<Integer> sum;
        sum = add_arrays(a, b) ;
        System.out.println(sum);

        // Test Case for Problem 3 :-
//        int[] arr = {7, 7, 8} ;
//        int[] arr2 = {7, 8, 9} ;
//        int[] arr3 = {9, 9, 9} ;
//        int[] arr4 = {1, 9, 9} ;
//        addOne(arr);
//        addOne(arr2);
//        addOne(arr3);
//        addOne(arr4);

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
