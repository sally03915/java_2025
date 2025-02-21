package com.company.java005_ex;

public class RepeatEx001 {
	public static void main(String[] args) {
		System.out.println("\nq1 : 1 2 3 4 5 ");
		for(int i=1; i<=5; i++) {  System.out.print(i+ "\t"); }
		

		System.out.println("\nq2 : 5 4 3 2 1  ");
		for(int i=5; i>=1; i--) {  System.out.print(i+ "\t"); }
		

		System.out.println("\nq3 : JAVA1   JAVA2  JAVA3   "); 
		System.out.print(" JAVA" + 1 );
		System.out.print(" JAVA" + 2 );
		System.out.print(" JAVA" + 3 );   //  sample....
		System.out.println();
		//           1<=3
		for(int i=1; i<=3; i++)
		{System.out.print(" JAVA" + i );  }  //{}  {변수}  for()
		

		System.out.println("\nq4 : HAPPY3   HAPPY2  HAPPY1   "); 
		System.out.print(" HAPPY"+3);
		System.out.print(" HAPPY"+2);
		System.out.print(" HAPPY"+1);
		//			 3>=1 	   { 반복 }  {변수}  for(시작;종료;변화)
		for(int i=3; i>=1; i--){ System.out.print(" HAPPY"+i);  }
		

		System.out.println("\nq5 : 0,1,2    "); 		
		//		System.out.print(" " + 0);
		//		System.out.print("," + 1);
		//		System.out.print("," + 2);
		// for(3패턴){  1 2변수 }
		for(int i=0; i<=2; i++) {  System.out.print(  (i==0 ?" ": "," ) + i);  }

		System.out.println("\nq6 : 0,1,2, ,,,중간생략 ,,, 99      "); 
		for(int i=0; i<=99; i++) {  System.out.print(  (i==0 ?" ": "," ) + i);  }

	    System.out.println("\nq7 :  ()10 ,9,,,,중간생략 ,,, , 1      "); 
		//		System.out.println( " "   +  10 );  //10
		//		System.out.println( ","   +  9 );   //9
		//		System.out.println( ","   +  8 );   //변화 1
		for(int i=10; i>=1; i--) {  System.out.print( (i==10 ?" ": ",") +  i );   }

	    System.out.println("\nq8 :   ()0  ,2 ,4 ,6 ,8      "); 
		//		System.out.println( " "   +  0 );   
		//		System.out.println( ","   +  2 );   
		//		System.out.println( ","   +  4 );    
		  
		for(int i=0; i<9; i+=2){System.out.print( ( (i==0)? "":",")   + i); } 
	    
	    
		
	}
}
/*
클래스명 :  ForEx001
출력내용 :   for 이용
q1  for문을 이용해서 다음과 같이 출력하시오 :   1 2 3 4 5 
q2  for문을 이용해서 다음과 같이 출력하시오 :   5 4 3 2 1 

q3  for문을 이용해서 다음과 같이 출력하시오 :   JAVA1   JAVA2  JAVA3  
q4  for문을 이용해서 다음과 같이 출력하시오 :   HAPPY3   HAPPY2  HAPPY1  

q5  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2  
q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99  
q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1 
q8  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 
q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
*/