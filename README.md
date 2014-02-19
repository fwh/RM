RM
==

Calculator programming language generated by sablecc

Example program:
```
   LET d         = 7;
   LET fac(n)    = IF n=0 THEN 1 ELSE n*fac(n-1);
   fac(d)?
   LET abs(r)    = IF r<0.0 THEN 0.0-r ELSE r;
   LET eps       = 1.0/1000000.0;
   LET sqrt(r,x) = IF abs(x*x-r)<eps THEN x ELSE sqrt(r,(x+r/x)/2.0);
   sqrt(2.0,2.0)?
   .
```
It calculates the factorial of 7 and the square root of 2.
