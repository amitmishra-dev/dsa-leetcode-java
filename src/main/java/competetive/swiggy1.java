package competetive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class swiggy1 {



	public static <string> void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader reader = new BufferedReader(
//				new InputStreamReader(System.in));
//
//		// Reading data using readLine
//		String name = reader.readLine();
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		String strArr = scan.next();
		//String[] strArr= k.split(" ");
		// Printing the read line
		calculateSteps(i , j ,strArr);
		//System.out.println(i+"::"+j+"::"+strArr);



	}

	private static void calculateSteps(int i, int j, String  k) {
		int x=0;
		int y=0;
		int  steps=1;
		String s= String.valueOf(k.charAt(0));
		for (int m = 0; m < j/2-2; m++) {
			x=Integer.parseInt(String.valueOf(k.charAt(m)))- Integer.parseInt(String.valueOf(k.charAt(m+2)));
			y=Integer.parseInt(String.valueOf(k.charAt(m+1)))- Integer.parseInt(String.valueOf(k.charAt(m+3)));
			if(x!=y){

				steps++;
			}

		}
		System.out.println(steps);
	}

}
