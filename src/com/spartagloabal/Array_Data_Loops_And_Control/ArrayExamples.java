package com.spartagloabal.Array_Data_Loops_And_Control;

import java.util.Arrays;

public class ArrayExamples {
//    store any kind of data
    private int[] short_fib = new int[5];
    private int[] long_fib = {0,1,1,2,3,5,8,13};
    private String[] names = {"Vegeta", "Naruto", "Luffy"};

    private int[][] twoDArray = new int[5][5];
    private int[] oddNum = {1,3,5,7,9};
    private int[] evenNum = {2,4,6,8,10};
//    constructor
    public ArrayExamples(){
        setShort_fib();
        setTwoDArray();
    }

    private void setTwoDArray(){
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[0][2] = 2;
        twoDArray[1][0] = 2;
        twoDArray[1][1] = 1;
        twoDArray[1][2] = 0;
    }
// this is a hard code array
    public void getTwoDArray(int arrayRef, int arrayObjectRef){
        System.out.println(twoDArray[arrayRef][arrayObjectRef]);
    }

    private void setShort_fib(){
        short_fib[0] = 0;
        short_fib[1] = 1;
        short_fib[2] = 1;
        short_fib[3] = 2;
        short_fib[4] = 3;
    }

    public void arrayCopy(){
        int[] combArray = Arrays.copyOf(evenNum,10);
        System.arraycopy(oddNum,0,combArray, 5,5);
        for (int value : combArray) {
            System.out.println(value);

        }
    }

    public void getShort_fib(int arrayRef){
        System.out.println(short_fib[arrayRef]);
    }

    public void getLong_fib(int arrayIndex) {
        System.out.println(long_fib[arrayIndex]);
    }

    public void getNames(int arrayName){
        System.out.println(names[arrayName]);
    }
}