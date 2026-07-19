package Concept;

import java.util.Arrays ;

import static Concept._06_arrays.largestElement;
import static Concept._06_arrays.printArr;

public class _10_sortingAlgorithms {

    /*
    * Question 1 :-
    * Implement Bubble Sort (increasing order)
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static  void bubbleSort_increasingOrder(int[] arr) {
        int n = arr.length ;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < (n-1-i); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }

    /*
    * Question 2 :-
    * Implement Bubble Sort (Decreasing order)
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void bubbleSort_decreasingOrder(int[] arr) {
        int n = arr.length ;
        for(int i = 0; i < (n-1); i++) {
            for(int j = 0; j < (n-1-i); j++) {
                 if(arr[j] < arr[j+1]) {
                     int temp  = arr[j] ;
                     arr[j] = arr[j+1] ;
                     arr[j+1] = temp ;
                 }
            }
        }
    }

    /*
    * Question 3 :-
    * Implementation of Selection Sort
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void selectionSort_increasingOrder(int[] arr) {
        int n = arr.length ;
        int minIdx ;
        for(int i = 0; i < (n-1); i++) {
            minIdx = i ;
            for(int j = (i+1); j < n; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j ;
                }
            }

            int temp  = arr[minIdx] ;
            arr[minIdx] = arr[i] ;
            arr[i] = temp ;
        }
    }

    /*
    * Question 4 :-
    * Implementation of Selection Sort (decreasing order)
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void selectionSort_decreasingOrder(int[] arr) {
        int n = arr.length ;
        int maxIdx ;
        for(int i = 0; i < (n-1); i++) {
            maxIdx = i ;
            for(int j = (i+1); j < n; j++) {
                if(arr[maxIdx] < arr[j]) {
                    maxIdx = j ;
                }
            }

            int temp = arr[maxIdx] ;
            arr[maxIdx] = arr[i] ;
            arr[i] = temp ;
        }
    }

    /*
    * Question 5 :-
    * Implementation of Insertion Sort (increasing order)
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void insertinSort_increasingOrder(int[] arr) {
        int n = arr.length ;
        for(int i = 1; i < n; i++) {
            int idx = i ;
            while((idx > 0) && (arr[idx] < arr[idx-1])) {
                int temp = arr[idx] ;
                arr[idx] = arr[idx-1] ;
                arr[idx-1] = temp ;
                idx-- ;
            }
        }
    }

    /*
    * Question 6 :-
    * Implementation of Insertion Sort (Decreasing order)
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void insertionSort_decreasingOrder(int[] arr) {
        int n = arr.length ;
        for(int i = 1; i < n; i++) {
            int idx = i ;
            while((idx > 0) && (arr[idx] > arr[idx-1])) {
                int temp = arr[idx] ;
                arr[idx] = arr[idx-1] ;
                arr[idx-1] = temp ;
                idx-- ;
            }
        }
    }

    /*
    * Question 7 :-
    * Implementation of Counting Sort
    * Time Complexity :- O(?), Space Complexity :- O(?)
    * Note :- This solution will not work for negative numbers*/
    public static void countingSort_increasingOrder(int[] arr) {
        int largest = largestElement(arr) ;
        int[] freq = new int[largest+1] ;

        for(int i = 0; i < arr.length; i++) {
            freq[arr[i]]++ ;
        }

        int idx = 0 ;
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                arr[idx] = i ;
                idx++ ;
                freq[i]-- ;
            }
        }
    }

    /* main function */
    public static void main(String[] args) {

        // Test Case for Question 7 :-
        int[] arr = {2, 2, 3, 1, 1, 3, 3, 4, 5, 5, 1} ;
        countingSort_increasingOrder(arr);
        printArr(arr);

        // Test Case for Question 6 :-
//        int[] arr = {5, 4, 1, 3, 2, 0, -12, 243, -8374, 338} ;
//        insertionSort_decreasingOrder(arr);
//        Arrays.sort(arr);
//        printArr(arr);

        // Test Case for Question 5 :-
//        int[] arr = {5, 4, 1, 3, 2, 0, -12, 243, -8374, 338} ;
//        insertinSort_increasingOrder(arr);
//        printArr(arr);

        // Test Case for Questin 4 :-
//        int[] arr = {5, 4, 1, 3, 2} ;
//        selectionSort_decreasingOrder(arr);
//        printArr(arr);

        // Test Case for Question 3 :-
//        int[] arr =  {5, 4, 1, 3, 2} ;
//        selectionSort_increasingOrder(arr);
//        printArr(arr);

        // Test Case for Question 2 :-
//        int[] arr = {5, 4, 1, 3, 2} ;
//        bubbleSort_decreasingOrder(arr);
//        printArr(arr);

        // Test Case for Question 1 :-
//        int[] arr = {5, 4, 1, 3, 2} ;
//        bubbleSort_increasingOrder(arr);
//        printArr(arr) ;
    }
}
