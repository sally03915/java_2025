package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_2 {
	public static void main(String[] args) {
		//변수
		int num;
		Scanner scanner = new Scanner(System.in);
		String result = "여자";
		//입력
		System.out.print("홀수, 짝수 좋아하는 숫자를 입력하시오. ");
		num = scanner.nextInt();
		//처리
		//출력  if(홀수면){ 남자 } else if(짝수면} {여자}   -  num%2==0  짝수
		//출력  if(홀수면){ 남자 } else {여자}             -  num%2==0  짝수
		 if(num%2==1) { result="남자";  } 
		  
		 System.out.println(result); 	 
	}
}

/*
연습문제6)
패키지명 : com.company.java004_ex
클래스명 :  IfEx006
출력내용 : 숫자를입력을받아
	홀수면 남자, 짝수면 여자를 출력하는 프로그램을 작성하시오.
	※  num%2==0  짝수

*/