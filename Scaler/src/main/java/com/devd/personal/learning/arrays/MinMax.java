package com.devd.personal.learning.arrays;

import java.util.Scanner;

/*
 * Problem Description

Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and other N elements as input from the user.



Problem Constraints

1 <= N <= 1000

1 <= A <= 1000



Input Format

A single line representing N followed by N integers of the array A



Output Format

A single line containing two space separated integers representing maximum and minimum elements of the input array.



Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output

Output 1:

5 1
Output 2:

80 10


 */
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int min=1000;
        int max=0;
        int num=0;
        for (int i=0; i<length;i++){
            num=sc.nextInt();
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }
        System.out.print(max);
        System.out.print(" ");
        System.out.print(min);

    }    
}


