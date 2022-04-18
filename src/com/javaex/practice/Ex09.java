package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for (int a=1; a<=10; a++) {
			for (int b=a; b<=10+a; b++) {
				System.out.print (b+"\t");
			}
			System.out.println();
		}
	}
}
