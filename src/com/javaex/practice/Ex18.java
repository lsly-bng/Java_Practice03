package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();

		for (int x=num; x>=1; x--) {
			for(int y=0; y<x; y++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int x=2; x<=num; x++) {
			for(int y=0; y<x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
