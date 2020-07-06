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
        int largest=0; 
        if(intArray.length==1){
            largest=intArray[0]; 
        }else{
            for (int i=1;i<intArray.length-1;i++){
                int num=intArray[i];
                int prevNum=intArray[i-1];

                if(num>prevNum){
                    largest=num; 
                    i++; 
                }else{
                    largest=num;
                }
            }

        }
        return largest;
    }
}
