package com.spartagloabal.Array_Data_Loops_And_Control;

public class RecursionExample {

    public int fibonacciEx(int i){
        if (i <= 1) {
            return i;
        }
        return fibonacciEx(i-1) + fibonacciEx(i-2);
    }
}
