package com.campusdual.classroom;

public class Exercise30 {


    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int result = 0;
        try{
            result=divisionWithCustomException(20, 0);
        }catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Result: " + result);
    }


}
