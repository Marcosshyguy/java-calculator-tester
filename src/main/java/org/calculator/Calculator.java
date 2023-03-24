package org.calculator;

public class Calculator {
    private Calculator(){};

    public static float add(float num1, float num2) throws  RuntimeException{
        if(num1 < 0 || num2 < 0){
            throw new RuntimeException();
        }
        if (num1 == 0.3){
            throw new RuntimeException("non giusto");
        }
        return num1+num2;
    }
    public static float subtract(float num1, float num2){
        if(num1 < 0 || num2 < 0){
            throw new RuntimeException();
        }
        if(num1 < num2){
            throw new RuntimeException();
        }
        return num1 - num2;
    }
    public static float divide(float num1, float num2){
//        if(num1 < 0 || num2 < 0){
//            throw new RuntimeException();
//        }
       return num1/num2;
    }
    public static float multiply(float num1, float num2){
        if(num1 < 0 || num2 < 0){
            throw new RuntimeException();
        }
        return num1*num2;
    }
}
