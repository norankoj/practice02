package com.javaex.practice02;

import java.util.Scanner;

//5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요
public class problem02 {

	public static void main(String[] args) {
        int i;
        int sum=0;
		int num []= new int [5];
		Scanner sc = new Scanner (System.in);
		for(i =0;i<num.length;i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		} 
		System.out.println("평균은"+sum/5+"입니다.");
		sc.close();
	}

}
