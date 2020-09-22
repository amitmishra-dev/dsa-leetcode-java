package com.java.competetive;

public class stanley1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nodec(2);
	}

	private static void nodec(int i) {
		// TODO Auto-generated method stub
		if(i >= 0) {
			
			nodec(i-1);
		}
		System.out.println("num : "+i);
	}
}
