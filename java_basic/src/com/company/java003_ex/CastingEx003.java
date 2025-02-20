package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main(String[] args) {
		//변수
		char ch = ' ';  // ch='\u0000'
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("대문자를 입력하시오.");
		ch = scanner.next().charAt(0);
		//	 "A(0)B(1)C(2)"
		
		//처리(1) 
		//  a(97) = A(65) + 32  
		//ch += 32;   // 1) + 더하기 (ch + 32)  2) = 대입  ch = (ch+32)
		
		//처리(2)
		ch = (char) (ch+32);   //ch(char:2byte) + 32(int:4byte)
		
		//출력
		System.out.println(ch);
		
		//Q 실수에 정수대입시 실수로
		float fl = 1+1.0f;
		System.out.println(fl);
		
	}
}



