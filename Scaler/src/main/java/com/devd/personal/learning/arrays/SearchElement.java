package com.devd.personal.learning.arrays;

import java.util.Scanner;

/*
 * Problem Description
You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 105

1 <= A[i], B <= 109



Input Format
First line of the input contains a single integer T.

Next, each of the test case consists of 2 lines:

First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
Second line contains a single integer B


Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input
Input 1:

 1 
 5 4 1 5 9 1
 5
Input 2:

 1
 3 7 7 2
 1 


Example Output
Output 1:

 1 
Output 2:

 0 


Example Explanation
Explanation 1:

  B = 5  is present at position 3 in A 
Explanation 2:

  B = 1  is not present in A. 
 */
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int [] tcResult= new int[tc];
        for(int i=0;i<tc;i++){
        int find=0;
        int size = sc.nextInt();
        int[]nums=new int[size];
        for(int j=0;j<size;j++){
            nums[j]=sc.nextInt(); 
        }
        int searchElement=sc.nextInt();

        for(int j=0;j<size;j++){
            if(searchElement==nums[j]){
                find=1;   
                break;             
            }  
        }
        tcResult[i]=find;
        }
        for(int i=0;i<tc;i++){
            System.out.println(tcResult[i]);
        }
        sc.close();
    } 
}
