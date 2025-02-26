package com.company.java008_ex;

public class Method002_ex {
	public static void  test1(int a)    {  System.out.println(a);}
	public static void  test2(double a) {  System.out.println(a);}
	public static void  hap(int a,int b) {
		int box=0;//누적박스  box+=3   box+=4  box+=5   {반복} {변수} 패턴
		for(int i=a; i<=b; i++){box+=i;}
		System.out.println(box);
	}
	public static void disp( int a, char b) {  
	// *이  7번
	//	for(int i=0; i<=7; i++){System.out.print('*'); }
		for(int i=0; i<=a; i++){System.out.print(b); }
	}
	////////////////////////////////////////////
	public static void main(String[] args) {
	 	hap(3,5);      // 3+4+5한값  12 출력
	 	//public static void  hap(3,5){3+4+5한값  12 출력}
	 	//public static void  hap(int a,int b){3+4+5한값  12 출력}
	 	
	 	disp(7, '*');  // *******출력
	 	//public static void  disp(7, '*'){  *이  7번   }
	 	//public static void  disp(int a, char b){*이  7번 }
	 	
	 	
		//public static 리턴값 메서드명(파라미터){}
		test1(10);     //10 출력
		//public static void test1(10){}
		//public static void test1(int a){10출력}
		
	 	test2(1.2);    // 1.2 출력 
	 	//public static void  test2(1.2){}
	 	//public static void  test2(double a){}
	 	
	/**/
	}
	////////////////////////////////////////////
}
/*
연습문제2)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx001
다음과 같이 test1(), test2(), hap(), disp()메서드를 정의하시오.

public static void main(String[] args) {
	 // public static  리턴값 메서드명(파라미터)
	 test1(10);    //10 출력
 	 test2(1.2);   // 1.2 출력
 	 hap(3,5);     // 3+4+5한값  12 출력
 	 disp(7, '*');  // *******출력
}

*/