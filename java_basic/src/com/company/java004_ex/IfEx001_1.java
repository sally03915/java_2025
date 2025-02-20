package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001_1 {
	public static void main(String[] args) {
	   //평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오.
	   //GIGO
	   //변수
		int avg;
		Scanner scanner = new Scanner(System.in);
		
	   //입력
		System.out.print("평균을 입력하세요>");
		avg = scanner.nextInt();
		
	   //처리  - if( 60점이상이면){ 합격} else{  불합격여부 }
	   //     - if( 60점이상이면){ 합격} else if(60점미만){  불합격여부}
	   //     - if( 60점이상이면){ 합격}
	   // ver-1
		if(avg>=60) {  System.out.println("합격");  }
		else        {  System.out.println("불합격"); }

	   // ver-2	
		if(avg>=60) {  System.out.println("합격");  }
		else if(avg<60){  System.out.println("불합격"); }
		
	   //출력
	}// end main
}// end class

/*
연습문제1)
패키지명 : com.company.java004_ex
클래스명 :  IfEx001
출력내용 : 평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오.
 
*/