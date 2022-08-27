import java.lang.*;
import java.util.*;
/* 
Problem Description

Given an integer A, you have to tell whether it is a prime number or not.

A prime number is a natural number greater than 1 which is divisible only by 1 and itself.


Problem Constraints

1 <= A <= 10 power 6



Input Format

First and only line of the input contains a single integer A.



Output Format

Print YES if A is a prime, else print NO.



Example Input

Input 1:

 3 
Input 2:

 4 
*/
public class IsItPrime {
    //prime means any positve number have exactly 2 factors
    // 0 has no factors and 1 has one factor.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =  sc.nextInt();
        sc.close();
        //store how many factors 
        int c=0;
        // if i is a factor then n/i also a factor 
        for (int i=1; i*i<=n; i++){
            if (n%i==0){
                if (i==(n/i)){
                    c++;
                }
                else{
                    c=c+2;
                }
                //exit if has more than two factors
                if (c>2){
                    System.out.println("NO");
                    System.exit(0);;
                }
            }

        }
        //check only it has two factors
        if(c==2){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }

    }
}