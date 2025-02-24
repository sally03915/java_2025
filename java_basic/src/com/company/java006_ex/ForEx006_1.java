package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_1 {
	public static void main(String[] args) {
		// 변수
		int num1, num2;  char op=' '; double result = ' ';
		Scanner scanner = new Scanner(System.in);
		// 입력
		for(;;) {  //무한반복
			System.out.print("숫자1 입력>"); num1 = scanner.nextInt();
			// 잘썼으면 나와!  if(num1이 0~100사이라면 ){ break}
			if(num1>=0 && num1<=100) { break; }   
		}
		for(;;) {  //무한반복
			System.out.print("숫자2 입력>"); num2 = scanner.nextInt();
			// 잘썼으면 나와!  if(num2이 0~100사이라면 ){ break}
			if(num2>=0 && num2<=100) { break; }   
		}
		for(;;) {  //무한반복
			System.out.print("연산자 입력>");   op = scanner.next().charAt(0);
			// 잘썼으면 나와!  if(op가 + 또는 - 또는 * 또는 /){ break}
			if(op=='+' || op == '-' || op =='*' || op=='/') { break; }   
		}
		
		// 처리  만약 +  더하기연산/ -라면 빼기연산 / *라면 곱하기연산 /   /라면 나누기연산
		// 처리  if(만약 +){더하기연산} else if(-라면){ 빼기연산} else if(*라면){ 곱하기연산}
		     if(op == '+') { result = num1 + num2;        }
		else if(op == '-') { result = num1 - num2;        }
		else if(op == '*') { result = num1 * num2;        }
		else if(op == '/') { result = num1 / (double)num2;}
		
		// 출력				""+  정수   문자(저장시 숫자)   정수 
		//                       10+3=13       ,   10/3=3.33
		//					     13.0 -> 13         3.33 -> 소수점둘째자리
		//	        			(int)result        String.format("%.2f",result)
		//				(op!='/'?   ""+(int)result :    String.format("%.2f",result))
		System.out.println( ""+ num1 + op + num2 +"=" +   
		     (op!='/'  ?  ""+ (int)result :  String.format("%.2f",result))  
		); 
		
//	2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
//	3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
	}// end main
}// end class


/*

연습문제6)  for 무한반복
패키지명 : com.company.java006_ex
클래스명 :  ForEx006
출력내용 :  계산기

1)  각 연산자에 맞게 계산처리
2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
     

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13

*/