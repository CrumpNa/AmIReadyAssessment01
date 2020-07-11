package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder sb=new StringBuilder(str.length()); //this helps us to concatenate the strings 
        //(SB makes the code more efficient than "+ /concatenate")
        String [] words=str.split(" ");//splits the input string by separating the individual words 
        //into their own indexes in an array 

        for(int i=0; i<words.length-1;i++){
            //taking each word in the array at a time...
            sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" "); 
            //1st append- appends only the first letter of the word in upper case form 
            //2nd append- appends the rest of the word as is(does not include first letter )
            //last append-appends a space at the end of the word to make the new Camel Case sentence 
            // readable and not bunched together
        }
        for(int i=words.length-1; i<words.length;i++){
            sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
            //this is the same as the first for loop, but minus the extra space at the end, 
            //bc the unit test won't accept an extra space 
        }
        String camelCase=sb.toString(); //convert the StringBuilder to a regular String 
        
        return camelCase; 

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String [] words=str.split(" ");//splits the input string by separating the individual words 
        //into their own indexes in an array 
        String reversedString="";
        
        for (int i=0;i<words.length;i++){
            //this loop goes through the array (except the last word)to get each indiv word 
            String word=words[i]; //word=indiv word in array 
            String reversedWord="";//variable for reversed indiv word 
            for (int j=word.length()-1;j>-1;j--){
                //this loop starts at the end of an indiv word (last index)
                reversedWord=reversedWord+word.charAt(j); 
                //then concatenates the last char at the end of the word to the front of reversedWord 
            }
            reversedString=reversedString+reversedWord+" ";//add the reversed indiv word to the overall 
            //reversed String plus a space 
        }
        
        return reversedString; 
        }
        
    

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }

}
