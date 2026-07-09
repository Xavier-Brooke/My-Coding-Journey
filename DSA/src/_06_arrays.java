public class _06_arrays {

    /* 1D Arrays */

    // function for printing array
    public static void printArr(int[] arr) {
        for(int ele : arr) {
            System.out.print(ele + ",");
        }
    }

     /*
     Question 1 :-
     WAF to find a given target in an array (Linear Search)
                                                  ^
                                                  |
                                             Time Complexity :- O(n), Space Complexity :- O(1)
    */
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i ;
            }
        }
        return -1 ;
    }

    /*
    * Question 2 :-
    * WAF to find the largest number in an array
    * Time Complexity :- O(n), Space Complexity :- O(1) */
    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE ;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i] ;
            }
        }
        return max ;
    }

    /*
    * Question 3 :-
    * WAF to find the smallest number in an array
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static int smallestElement(int[] arr) {
        int min = Integer.MAX_VALUE ;
        for(int ele : arr) {
            if(ele < min) {
                min = ele ;
            }
        }
        return min ;
    }

    /*
    * Question 4 :-
    * WAF for Binary Search
    * Time Complexity :- O(log n), Space Complexity :- O(1)
    * Note :- for Binary Search to work properly the array should be sorted*/
    public static int binarySearch(int[] arr, int target) {
        int i = 0 ;
        int j = arr.length-1 ;
        while(i <= j) {
            int mid =    (i+j)/2 ;
            if(arr[mid] == target) {
                return mid ;
            } else if(arr[mid] < target) {
                i = mid+1 ;
            } else {
                j = mid-1 ;
            }
        }
        return -1 ;
    }

    /*
    * Question 5 :-
    * WAF to reverse an array
    * Time Complexity :- O(n), Space Complexity :- O(1)*/
    public static void reverseArr(int[] arr) {
        int si = 0 ;
        int ei = arr.length-1 ;
        while(si < ei) {
            int temp = arr[si] ;
            arr[si] = arr[ei] ;
            arr[ei] = temp ;
            si++ ;
            ei-- ;
        }
    }

    /*
    * Question 6 :-
    * WAF to print pairs in an array
    * Time Complexity :- O(n^2), Space Complexity :- O(1)*/
    public static void printPairs(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = (i+1); j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + "),");
            }
            System.out.println();
        }
    }

    /*
    * Question 7 :-
    * WAF to print subarrays of an array
    * Time Complexity :- O(n^3), Space Complexity :- O(1)*/
    public static void printSubarray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    * Question 8 :-
    * WAF to print max sum of all possible subarray of an array
    * Time Complexity :- O(n^3), Space Complexity :- O(1)*/
    public static int max_subArray_sum_bruteforce(int[] arr) {
        int maxSum = Integer.MIN_VALUE ;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int currSum = 0 ;
                for(int k = i; k <= j; k++) {
                    currSum += arr[k] ;
                }
                maxSum = Math.max(maxSum, currSum) ;
            }
        }
        return maxSum;
    }

    /*
    * Question 9 :-
    * WAF to print max sum of all possible subarray of an array
     * Time Complexity :- O(n^2), Space Complexity :- O(n)*/
    public static int max_sumArray_sum_prefixArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE ;

        int n = arr.length ;
        int[] prefixSum = new int[n] ;
        prefixSum[0] = arr[0] ;
        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i] ;
        }

        int currSum = 0 ;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i == 0) {
                    currSum = prefixSum[i] ;
                } else if(i == j) {
                    currSum = arr[i] ;
                } else if(i != j) {
                    currSum = prefixSum[j] - prefixSum[i-1] ;
                }
                maxSum = Math.max(maxSum, currSum) ;
            }
        }
        return maxSum ;
    }

    /*
     * Question 10 :-
     * WAF to print max sum of all possible subarray of an array
     * Time Complexity :- O(n), Space Complexity :- O(1)
     * Note :- This algorithm will not work for negative maxSum*/
    public static int max_sumArray_sum_kadane(int[] arr) {
        int maxSum = Integer.MIN_VALUE ;

        int currSum = 0 ;

        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i] ;
            if(currSum < 0) {
                currSum = 0 ;
            }
            maxSum = Math.max(maxSum, currSum) ;
        }

        return maxSum ;
    }

    /*
    * Question 11 :-
    * WAF to rotate an array about a pivot point
    * Time Complexity :- O(), Space Complexity :- O()*/
    public static void reverseArr(int[] arr, int si, int ei) {
        while(si <= ei) {
            int temp = arr[si] ;
            arr[si] = arr[ei] ;
            arr[ei] = temp ;
            si++ ;
            ei-- ;
        }
    }

    public static void rotateArr(int[] arr, int d) {
        int n = arr.length ;
        d %= n ;
        reverseArr(arr, 0, d-1);
        reverseArr(arr, d, n-1);
        reverseArr(arr, 0, n-1);
    }

    /* 2D Arrays */

    // main function
    public static void main(String[] args) {

        // Test Case for Question 11 :-
//        int[] arr = {1, 2, 3, 4, 5} ;
//        int d = 2 ;
//        System.out.println("Array before rotation :- ");
//        printArr(arr);
//        rotateArr(arr, 2);
//        System.out.println("\nArray after rotation :- ");
//        printArr(arr);

        // Test Case for Questin 10 :-
//        int[] arr = {1, -2, 6, -1, 3} ;
//        System.out.println(max_sumArray_sum_kadane(arr));

        // Test Case for Question 9 :-
//        int[] arr = {-1, -2, -6, -1, -30} ;
//        System.out.println(max_sumArray_sum_prefixArray(arr));

        // Test Case for Question 8 :-
//        int[] arr = {1, -2, 6, -1, 3} ;
//        System.out.println(max_subArray_sum_bruteforce(arr));

        // Test Case for Question 7 :-
//        int[] arr = {2, 4, 6, 8, 10} ;
//        printSubarray(arr);

        // Test Case for Question 6 :-
//        int[] arr = {2, 4, 6, 8, 10} ;
//        printPairs(arr);

        // Test Case for Question 5 :-
//        int[] arr = {234, 876, -76432, -43, 0, 876, 752, 658, 832, -436, -612, -723} ;
//        reverseArr(arr);
//        printArr(arr);


        // Test Case for Question 4 :-
//        int[] arr = {2, 4, 6, 8, 10, 12, 14} ;
//        int target = 10 ;
//        System.out.println(binarySearch(arr, target));

        // Test Case for Question 3 :-
//        int[] arr = {234, 876, -76432, -43, 0, 876, 752, 658, 832, -436, -612, -723} ;
//        System.out.println(smallestElement(arr));

        // Test Case for Question 2 :-
//        int[] arr = {234, 876, -76432, -43, 0, 876, 752, 658, 832, -436, -612, -723} ;
//        System.out.println(largestElement(arr));

        // Test Case for Question 1 :-
//        int[] arr = {234, 876, -76432, -43, 0, 876, 752, 658, 832, -436, -612, -723} ;
//        int target1 = 987 ;
//        int target2 = -436 ;
//        System.out.println(linearSearch(arr, target1));
//        System.out.println(linearSearch(arr, target2));
    }
}
