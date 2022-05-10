package com.ecpe205;


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
    public String Palindrome(String s){
        String reverse= new StringBuffer(s).reverse().toString();
        if(s.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        return reverse;
    }
    //https://github.com/BrianJavellana/CalculatorUnitTest
}
