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
//        ArrayList<Integer> list = new ArrayList<>() ;
//        list.add(1); list.add(20) ; list.add(-3) ; list.add(4) ; list.add(-5) ;

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
