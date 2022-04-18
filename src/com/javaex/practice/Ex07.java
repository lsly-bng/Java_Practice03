	package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a=sc.nextInt();
		
		for(int b=1; b<=a; b++) {
			for(int c=1; c<=b; c++) {
				System.out.print(b);
			}
			System.out.println();
		}
		sc.close();
	}
}
