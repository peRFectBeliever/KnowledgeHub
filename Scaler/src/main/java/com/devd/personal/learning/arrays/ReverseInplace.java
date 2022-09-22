package com.devd.personal.learning.arrays;

/*
 * Problem Description
You are provided with an integer array A. Reverse A inplace with O(1) extra memory.


Problem Constraints
1 <= |A| <= 106
1 <= A[i] <= 106


Input Format
The first and only argument is an integer array A.


Output Format
Reverse inplace array A. Don't return anything.


Example Input
Input 1 :
A=[2, 6, 8, 1]
Input 2 :
A=[5]


Example Output
Output 1 :
[1, 8, 6, 2]
Output 2 :
[5]


Example Explanation
Example 1 : Reverse of array [2, 6, 8, 1] is [1, 8, 6, 2]
Example 2 : Reverse of array [5] is [5]

 */
public class ReverseInplace {
    public static void main(String[] args) {
        int [] list = new int[]{1,2,3,4,5};
        reverse(list);
        
    }
    public static void reverse(int[] A){
        int temp;
        for(int i=0;i<A.length-i;i++){
            temp=A[i];
            A[i]=A[A.length-i-1];            
            A[A.length-i-1]=temp;            
        }
    }
    
}
