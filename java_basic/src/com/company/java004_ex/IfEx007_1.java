package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007_1 {
	public static void main(String[] args) {
		//변수
		int num1, num2; char op=' '; 
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("1. 정수를 하나 입력해주세요 >");
		num1 = scanner.nextInt();
		System.out.print("2. 정수를 하나 입력해주세요 >");
		num2 = scanner.nextInt();
		System.out.print("3. 연산자를 입력해주세요(+,-,*,/) >");
		op   = scanner.next().charAt(0);
		
		//처리
		//ver-1
		     if(op == '+') {  System.out.printf("%d%c%d = %d\n"   , num1 , op,num2, num1+num2);        }
		else if(op == '-') {  System.out.printf("%d%c%d = %d\n"   , num1 , op,num2, num1-num2);        }
		else if(op == '*') {  System.out.printf("%d%c%d = %d\n"   , num1 , op,num2, num1*num2);        }
		else if(op == '/') {  System.out.printf("%d%c%d = %.2f\n" , num1 , op,num2, num1/(float)num2); }
		//ver-2									int(정수:4)   + char(정수:2) + int(정수:4)
		     if(op == '+') {  System.out.println("" + num1 + op + num2 + " = " + (num1+num2));             }
		else if(op == '-') {  System.out.println("" + num1 + op + num2 + " = " + (num1-num2));             }
		else if(op == '*') {  System.out.println("" + num1 + op + num2 + " = " +  num1*num2);              }
		else if(op == '/') {  System.out.println("" + num1 + op + num2 + " = " + 
														String.format("%.2f", (num1/(float)num2)));        }
		//출력

	}
}

/*
연습문제7)  ※ 숙제
패키지명 : com.company.java004_ex
클래스명 :  IfEx007
출력내용 :  계산기

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > -
10-3=7 
*/