package com.stayready.assessment1.part2;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int counter=0;//keeps track of the objectToCount

        int arraySize=objectArray.length; //size of the inputted array
        for (int i=0;i<arraySize;i++){ //go through the array
            if(objectArray[i]==objectToCount){
                counter+=1; //add to the counter
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //Integer valueToRemove = 7;
        //Object[] expected = {1, 2, 8, 4, 5, 0, 9, 8};
        //objectArray={1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};
        int indexToRemove=0; //this index is where the objectToRemove is postioned in the array
        int arraySize=objectArray.length; //size of the inputted array
        int size=arraySize-1;
        int newArray []=new int [size-1]; //new array without objectToRemove
        for (int i=0;i<arraySize;i++){ //identify position of objecttoRemove
            if (objectArray[i]==objectToRemove) {
                indexToRemove+=i;

            }
        }
        for(int i=0;i<arraySize;i++){
            if(i!=indexToRemove){
                newArray[i]= (int) objectArray[i];
            }
        }

        return null;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        return null;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
