package com.javaex.practice02;

import java.util.Scanner;

//키보드에서 정수로 된 돈의 액수를 입력받아 
//오만원권, 만원권, 오천원권, 천원권, 
//500원동전, 100원동전, 50원동전, 1원동전 
//각 몇 개로 변환 되는지 작성 하세요.

//미완성

public class problem04 {

	public static void main(String[] args) {

		int i;
		int n = 0;
		// int num;
		int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액:");
		int input = sc.nextInt();

			
				for (i = 0; i < won.length; i++) {
					if (input - won[i] > 0) {
				input = input - won[i];
				n++;
				System.out.println(won[i] + "원: " + n + "개");
			}
			n = 0;
		}
		sc.close();
	}

}
