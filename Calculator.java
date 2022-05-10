package com.ecpe205;

import static java.lang.Math.pow;

public class Calculator {
    public double power( double x, double y){return Math.pow(x,y);}
    public int factorial(int x){
        if (x<=0){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }

    }
}
