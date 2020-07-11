package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum=0; 
        sum=n+n;
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reversed = 0;


        while(val != 0) {
            int digit = val % 10;//if have 12345, 5 is left 
            reversed = reversed * 10 + digit; //0*10+5,5*10+4,54*10+3
            val /= 10;//12345/10=1234, then 123 until gets to zero 
        }
     
        return reversed;

    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        Boolean ifEven=false; 
        if (val % 2==0){
            ifEven=true;
        }else{
            ifEven=false; 
        }
        return ifEven;
    }
}

