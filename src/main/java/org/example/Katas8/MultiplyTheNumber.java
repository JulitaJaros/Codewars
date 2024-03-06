package org.example.Katas8;

public class MultiplyTheNumber {
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
