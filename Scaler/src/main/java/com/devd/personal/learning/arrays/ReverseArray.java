package com.devd.personal.learning.arrays;

public class ReverseArray {    
    public int[] solve(final int[] A) {
        int temp;
        int []B = new int[A.length];
        int j=A.length-1;
        int i=0;
        while(j>=0){
            B[j]=A[i];
            i++;
            j--;
        }
        return B;
    }
}
