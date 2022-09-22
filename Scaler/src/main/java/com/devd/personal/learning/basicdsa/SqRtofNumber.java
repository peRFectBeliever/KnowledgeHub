package com.devd.personal.learning.basicdsa;

import java.util.Scanner;

public class SqRtofNumber {
    /*
     * Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.



Problem Constraints

1 <= A <= 108



Input Format

First argument is an integer A.



Output Format

Return an integer which is the square root of A if A is perfect square otherwise return -1.



Example Input

Input 1:

A = 4
Input 2:

A = 1001


Example Output

Output 1:

2
Output 2:

-1


Example Explanation

Explanation 1:

sqrt(4) = 2
Explanation 2:

1001 is not a perfect square.
     */
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(new SqRtofNumber().solve(a));
    }
    public int solve(int A) {
        Integer left =0;
        Integer right = A;
        for(int i=left;left<=right;i++){
        long midNumber = (left+right)/2;
        if(midNumber * midNumber == A){
        return (int) midNumber;
        }else {
        if (midNumber * midNumber > A) {
        right = (int)midNumber -1;
        } else {
        left = (int)midNumber + 1;
        }
        }
        }
        return -1;
        }
    
}
