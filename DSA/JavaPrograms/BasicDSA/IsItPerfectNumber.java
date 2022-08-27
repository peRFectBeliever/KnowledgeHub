import java.lang.*;
import java.util.*;

/*
 * Problem Description

You are given N positive integers.

For each given integer A, you have to tell whether it is a perfect number or not.

A perfect number is a positive integer which is equal to the sum of its proper positive divisors.



* Problem Constraints

1 <= N <= 10

1 <= A <= 106



* Input Format

The first line of the input contains a single integer N.

Each of the next N lines contains a single integer A.



* Output Format

In a separate line, print YES if a given integer is perfect, else print NO.



* Example Input

Input 1:

 2
 4
 6 
Input 2:

 1
 3 


* Example Output

Output 1:

 NO
 YES 
Output 2:

 NO 


* Example Explanation

Explanation 1:

 For A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4. 
 For A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6. 
Explanation 2:

 For A = 3, the answer is "NO" as sum of its proper divisors = 1, is not equal to 3. 
 */

public class IsItPerfectNumber {
    public static void main(String[] args) {
        //A perfect number is a positive integer which is equal to the sum of its proper positive divisors
        /*
         * ALGORITHM:
=> Initialize a variable to store sum of proper positive divisors, say sum = 0.
=> Run a loop from 1 to A-1, increment 1 in each iteration. The loop structure should look like while(i<A).
=> Inside the loop if current number i.e. i is proper positive divisor of A (A % i == 0), then add it to sum.

Bonus : We can iterate from 1 to A/2 instead of till A? Because a number does not have any proper positive divisor greater than A/2.
         */
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] a= new int[n];
        for (int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        for (int i=0; i<n; i++){
            checkPerfectNum(a[i]);
            
        }
        
    }
    private static void checkPerfectNum(int a){
        // restrivt loop to sqrt of n;
        //since 1 is not perfectnumber ignore it.
        int sum =1;
        //find all divisors and add them
        for (int i=2; i*i<a; i++){
            if ((a%i) == 0){
                if(i*i ==a){
                // if divisor is same , add only one divisor
                sum=sum+i;  
                }
                else{
                    //if divisor is different, add both
                    sum=sum+i+(a/i);
                }
            }
            
        }
        if (sum == a && a!=1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        

    }
}