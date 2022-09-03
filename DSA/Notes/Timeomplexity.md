**Keys to Remember**
- Loops Increase by i*i<=N or i=/2 , sqrt n complexity.
- if /n  mostly log base log base3 N
- Tow independent functions of Time omplexity Functions f(x),g(x) then Tc is max(f(x),g(x)). f(x)+g(x) and we ignore lowest order. so we ll consider highest order, thats the reason max()
- Always check increments of loop( possiblity of infine or constant loops)
- Arithmetic Progression:
``` a_{n}=a_{1}+(n-1)d
a_n	=	the nᵗʰ term in the sequence
a_1	=	the first term in the sequence
d	=	the common difference between terms
```

- Finite Geometric Progression
The terms of a finite G.P. can be written as a, ar, ar2, ar3,……arn-1

a, ar, ar2, ar3,……arn-1 is called finite geometric series.

The sum of finite Geometric series is given by:

```
Sn = a[(rn – 1)/(r – 1)] if r ≠ 1 and r > 1
```



**complex examples**
Example 1:

```
for(int i=; i<Math.pow(2,N);i++){
    int j=i;
    while(j>0){
        j-=1;
    }
}

```
Solution :
The outer loops runs from 1 to 2^ N.
The inner loop runs from i to 0.
So, worst case TC will be O((2^N)^2) = O(4^N).