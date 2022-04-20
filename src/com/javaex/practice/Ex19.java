package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opt, amt;
		int bal = 0;

		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			opt = sc.nextInt();

			if (opt == 1) {
				System.out.print("예금액>");
				amt = sc.nextInt();
				bal += amt;
			} else if (opt == 2) {
				System.out.print("출금액>");
				amt = sc.nextInt();
				bal -= amt;
			} else if (opt == 3) {
				System.out.println("잔고액>" + bal);
			} else if (opt == 4) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.print("프로그램 종료");
		sc.close();
	}
}
