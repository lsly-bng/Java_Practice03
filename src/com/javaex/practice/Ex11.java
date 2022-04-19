package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num=sc.nextInt();
		int sum=0;
		
		if (num%2==0) {
			for (int a=0; a<=num; a+=2) {
				sum+=a;
			}
		}
		else if (num%2==1) {
			for (int a=1; a<=num; a+=2) {
				sum+=a;
			}
		}
		System.out.println("결과값: "+sum+" 입니다.");
		sc.close();
	}
}
