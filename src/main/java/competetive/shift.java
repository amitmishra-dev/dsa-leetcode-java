package com.java.competetive;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


	public class shift {

    /*
     * Complete the 'getShiftedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER leftShifts
     *  3. INTEGER rightShifts
     */
    public static void main(String args[]) 
    {  
            System.out.println(getShiftedString("amitMishra", 2,3)); 

    } 

    public static String getShiftedString(String s, int leftShifts, int rightShifts) {
    	  
    	if(leftShifts > 0 && rightShifts >0){

              s=leftShift(s, leftShifts);
              s=rightShift(s, rightShifts);
              return s;
         
         }
    	else return "";
    }

    static String leftShift(String str, int d) 
    { String ans = "";
		if(str!=null && str.length()!=0) {
			System.out.println(str.substring(d) + " :::: "+ str.substring(0,d));
             ans = str.substring(d) + str.substring(0, d); 
             
            
    } 
		return ans; }
  
    // function that rotates s towards right by d  
    static String rightShift(String str, int d) 
    { 
            return leftShift(str, str.length() - d); 
    } 

}