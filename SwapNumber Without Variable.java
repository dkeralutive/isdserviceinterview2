package com.example.changenumberwithoutswap;


public class HelloApplication  {

    public void twoVariableWithoutTemp(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Result After swapping:"
                + " x = " + x + ", y = " + y);

    }
    public static void main(String[] args) {

        HelloApplication helloApplication=new HelloApplication();
        int x=6;
        int y=5;
        helloApplication.twoVariableWithoutTemp(6,5);
    }
}