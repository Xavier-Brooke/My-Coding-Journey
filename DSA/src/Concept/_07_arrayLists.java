package Concept;

import java.util.ArrayList ;
import java.util.Collections ;

public class _07_arrayLists {

    /* 1D ArrayList */

    /*
    * Question 1 :-
    * WAF to print ArrayList
    * Time complexity :- O(n), Space Complexity :- O(1)*/
    public static void print_ArrayList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    /*
    * Question 2 :-
    * WAF to reverse ArrayList
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static void reverse_ArrayList(ArrayList<Integer> list) {
        int i = 0 ;
        int j = (list.size()-1) ;
        while(i < j) {
            int temp = list.get(i) ;
            list.set(i, list.get(j)) ;
            list.set(j, temp) ;
            i++ ;
            j-- ;
        }
    }

    /*
    * Question 3 :-
    * WAF to find maximum element in ArrayList
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static int findMaximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE ;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i) ;
            }
        }
        return max ;
    }

    /*
    * Question 4 :-
    * Container with max water problem
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static int container_with_most_water(ArrayList<Integer> heights) {
        int maxWater = 0 ;
        int left = 0 ;
        int right = heights.size()-1 ;
        while(left < right) {
            int leftHeight = heights.get(left) ;
            int rightHeight =  heights.get(right) ;
            int waterLevel = Math.min(leftHeight, rightHeight) ;
            int width = (right - left) ;
            int currWater = waterLevel * width ;
            maxWater = Math.max(currWater, maxWater) ;
            if(leftHeight < rightHeight) {
                left++ ;
            } else {
                right-- ;
            }
        }
        return maxWater ;
    }

    /*
    * Question 5 :-
    * Pair Sum 1
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static boolean pairSum_1(ArrayList<Integer> list, int sum) {
        int lp = 0 ;
        int rp = list.size()-1 ;
        while(lp < rp) {
            int currSum = (list.get(lp) + list.get(rp)) ;
            if(currSum == sum) {
                return true ;
            } else if(currSum < sum) {
                lp++ ;
            } else {
                rp-- ;
            }
        }

        return false ;
    }

    /* multi dimensional ArrayList */

    /*
    * Question 1 :-
    * WAF to print multiDimensional ArrayList
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void print_multiDimensional_ArrayList(ArrayList<ArrayList<Integer>> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j =  0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // main function
    public static void main(String[] args) {

        /* multi dimensional ArrayList */

//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>() ;
//        ArrayList<Integer> list1 = new ArrayList<>() ;
//        list1.add(1) ; list1.add(34) ; list1.add(97);
//        ArrayList<Integer> list2 = new ArrayList<>() ;
//        list2.add(-234); list2.add(87); list2.add(234) ;
//        mainList.add(list1) ;
//        mainList.add(list2) ;
//        System.out.println(mainList);

        // Test Case for Question 1 :-
//        print_multiDimensional_ArrayList(mainList);

        /* 1D ArrayList */
        //

//        ArrayList<Integer> list = new ArrayList<>() ;
//        list.add(1); list.add(20) ; list.add(-3) ; list.add(4) ; list.add(-5) ;

        // Test Case for Question 5 :-
        ArrayList<Integer> list = new ArrayList<>() ;
        Collections.addAll(list, 1, 2, 3, 4, 5, 6) ;
        int target = 5 ;
        System.out.println(pairSum_1(list, target));

        // Test Case for Question 4 :-
//        ArrayList<Integer> heights = new ArrayList<>() ;
//        Collections.addAll(heights, 1, 8, 6, 2, 5, 4, 8, 3, 7) ;
//        System.out.println(container_with_most_water(heights));

        // Test Case for Question 3 :-
//        System.out.println(findMaximum(list));

        // Test Case for Question 2 :-
//        reverse_ArrayList(list);
//        print_ArrayList(list);

        // Test Case for Question 1 :-
//        print_ArrayList(list);

        // ArrayList creation and operations
//        ArrayList<Integer> list = new ArrayList<>() ;
//        list.add(1);
//        list.add(2) ;
//        list.add(3) ;
//        list.add(4) ;
//        list.add(5) ;
//        System.out.println(list);
//        System.out.println(list.get(3));
//        System.out.println("Size of list :- " + list.size());
//        System.out.println(list.remove(4));
//        System.out.println(list);
//        System.out.println(list.contains(53));
//        System.out.println(list.contains(3));
//        Collections.sort(list);
//        print_ArrayList(list);
//        Collections.sort(list, Collections.reverseOrder()) ;
//        print_ArrayList(list);
    }
}
