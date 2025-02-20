package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005_1 {
	public static void main(String[] args) {
		//변수
		char    ch = ' ';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("문자한개입력 > ");
		ch = scanner.next().charAt(0);
		
		//처리 if( 대문자인지이면 ){ 소문자로 a=A+32} else if(소문자){대문자로 }
		if(  ch>='A' && ch<='Z')      { System.out.println(  (char)(ch+32));   }
		else if(  ch>='a' && ch<='z') { System.out.println( (char)(ch-32));    }
		else                          { System.out.println("알파벳입력해주세요!"); }
		//1.  97 = ch + 32   (char:2byte) + (int:4byte)
		//출력
	}// end main
}// end class
/*
연습문제5)
패키지명 : com.company.java004_ex
클래스명 :  IfEx005
출력내용 : 문자한개를 입력받아 
	대문자인지 이면 소문자로,  소문자이면 대문자로 변경하는 프로그램을 작성하시오.
	※  a = 'A' + 32    
   
*/