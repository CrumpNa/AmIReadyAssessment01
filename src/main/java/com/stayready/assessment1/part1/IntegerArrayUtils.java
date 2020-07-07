package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum=0;
        for (int i=0;i<intArray.length;i++){
            sum+=intArray[i]; 
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product=1;
        for (int i=0;i<intArray.length;i++){
            product*=intArray[i]; 
        }
        return product;
    
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double average=0;
        double sum=0;
        double n=intArray.length;
        for (int i=0;i<intArray.length;i++){
            sum+=intArray[i]; 
        }
        average=sum/n; 
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        
        int largest=intArray[0];  //start largest value at first index of array 
        for (int i = 1; i < intArray.length; i++) {
        //loop starts at second elem in array 
           if (intArray[i] > largest) {
           //if next elem is greater, make it the new largest value 
               largest = intArray[i]; }
           //runs thru the array to see which is greater 
          
    }
           
        return largest;
    }
}
