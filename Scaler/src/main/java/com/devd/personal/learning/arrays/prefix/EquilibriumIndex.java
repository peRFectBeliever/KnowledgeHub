package com.devd.personal.learning.arrays.prefix;

public class EquilibriumIndex {
    public static void main(String[] args) {
        solve(new int[]{1,2,3,45});
        
    }
    public static int solve(int[] A) {
        int n = A.length;
        for(int i = 1; i < n; i++) {
            A[i] = A[i - 1] + A[i];     // Prefix sum array, modification
        }

        if((A[n-1] - A[0]) == 0) {         // Check corner case, sum, 1->n-1 == 0
            return 0;
        }

        for(int k = 1; k < n; k++) {
            if(A[k-1] == A[n-1] - A[k]) {      // Sum before k == Sum after k
                return k;
            }
        }
    return -1;
    }
    
}
