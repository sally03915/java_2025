package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx002 {
	public static void main(String[] args) {
		//변수
		int a;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("좋아하는 계절을 입력해주세요 3,6,9,12 >");
		a = scanner.nextInt();
		//처리  a==3 / a==6 / a==9/ a==12
		// sc - b
		switch(a) {
		case 3 : case 4 : case 5:   System.out.println("봄이다");break;
		case 6 : case 7 : case 8:   System.out.println("여름이다");break;
		case 9 : case 10: case 11:  System.out.println("가을이다");break;
		case 12: case 1:  case 2:   System.out.println("겨울이다");break;
		}
		//출력
	}
}

/*
연습문제2)  
패키지명 : com.company.java004_ex
클래스명 :  SwitchEx002
출력내용 :   switch 이용
     숫자한개 입력받아
     3,4,5이면 봄
     6,7,8이면 여름
     9,10,11이면 가을
     12,1,2이면 겨울

*/