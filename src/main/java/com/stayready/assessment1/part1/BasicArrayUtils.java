package com.stayready.assessment1.part1;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firstElem; //make variable for first elem 
        firstElem=stringArray[0]; //makes the string at the 0 index-> the variable, firstElem
        
        return firstElem;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String secondElem; 
        secondElem=stringArray[1]; //makes the string at the 1 index->the variable,secondElem
        return secondElem;
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
       
        for(int i=0; i<stringArray.length/2; i++){ 
            String temp = stringArray[i]; //when i=0,"the" is stored in temp . when i=1, "quick"
            stringArray[i] = stringArray[stringArray.length -i -1]; //"brown" replaces "the" in the 1st index  
            stringArray[stringArray.length -i -1] = temp; //"the" replaces "brown"
            //swaps like this take place, until i reaches the midpoint index 1.5 aka rounds to 1, so the swap only happens once w/ an array a length of 3
         }
        
        return stringArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        //in each element, pull out the first index of the substrg 
        //(str.substring(15));
         
        String str; //string elem of the array
        String firstLetter; //the first letter of each elem in the array 
        String firstString=""; //string of first letters; 
    
        for(int i=0;i<stringArray.length;i++){
            str=stringArray[i]; //str is the elem at index i 
            firstLetter=str.substring(0,1); //this pulls out the first letter of the elem and puts it in the firstLetter variable 
            firstString=firstString+firstLetter;//the substring is concatenated to a new string, which will put all the firstLetters together 
         }
        return firstString;
        }
}
