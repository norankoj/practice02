package com.javaex.practice02;
//주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
//char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
public class problem03 {

	public static void main(String[] args) {
		int i;
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		System.out.println(c);
		for(i=0;i<c.length;i++) {
			if(c[i]==' ') {
				c[i]=',';
			}
			System.out.print(c[i]);
		}

	}

}
