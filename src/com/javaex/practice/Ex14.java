package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();
		int sum=0;
		
		for (int a=1; a<=num; a++) {
			sum+=a;
			if (a<num) {
				System.out.print(a+"+");
			}
			else {
			System.out.println(a);
			}
		}
		System.out.println("결과값: "+sum);
		
		sc.close();
	}
}
