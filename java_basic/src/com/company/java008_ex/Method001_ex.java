package com.company.java008_ex;

public class Method001_ex {
	//public static 리턴값  메서드명(파라미터) {}
	public static   void  dog()  {  System.out.println("멍멍");}
	public static   void  cat()  {  System.out.println("야옹");}
	public static   void  line() {  System.out.println("=========");}
	
	/////////////////////////////////////////////
	public static void main(String[] args) {
		  line(); //========= 출력 
		  dog();  // 멍멍 출력
		  line(); //========= 출력 
		  cat();  // 야옹 출력
		  line(); //========= 출력
	}

}
