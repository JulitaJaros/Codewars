package org.example.Katas8;

public class MultiplyTheNumber {
/*    Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:

            3 -->    15  (  3 * 5¹)
            10 -->   250  ( 10 * 5²)
            200 --> 25000  (200 * 5³)
            0 -->     0  (  0 * 5¹)
            -3 -->   -15  ( -3 * 5¹)*/

    public static int multiply(int number) {
        if(number<0){
            String n = number+"";
            int n1=n.length()-1;
            int a = (int) Math.pow(5,n1);
            return number*a;
        }else {
            String n = number+"";
            int n1=n.length();
            int a = (int) Math.pow(5,n1);
            return number*a;
        }
    }


}
