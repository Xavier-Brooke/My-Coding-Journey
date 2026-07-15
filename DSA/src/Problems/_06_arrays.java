package Problems;

public class _06_arrays {

    /*
    * Problem 1 :-
    * WAF to merge two sorted arrays*/
    public static int[] mergeArr(int[] a, int[] b) {
        int m = a.length ;
        int n = b.length ;
        int[] ans = new int[m+n] ;

        int p = 0 ;
        int q = 0;
        int r = 0 ;
        while((p < m) || (q < n)) {
            if((p < m) && (q < n)) {
                if(a[p] <= b[q]) {
                    ans[r] = a[p] ;
                    p++ ;
                } else {
                    ans[r] = b[q] ;
                    q++ ;
                }
            } else if(p < m) {
                ans[r] = a[p] ;
                p++ ;
            } else if(q < n) {
                ans[r] = b[q] ;
                q++ ;
            }
            r++ ;
        }

        return ans ;
    }

    // main function
    public static void main(String[] args) {

        // Test Case for Question 1 :-
//        int[] a = {1, 3, 5, 7, 9} ;
//        int[] b = {2, 4, 6, 8, 10} ;
//        int[] c = mergeArr(a, b) ;
//        for(int ele : c) {
//            System.out.print(ele + " ");
//        }
    }
}
