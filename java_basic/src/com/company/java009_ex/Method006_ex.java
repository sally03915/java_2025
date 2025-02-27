package com.company.java009_ex;

import java.util.Arrays;

public class Method006_ex {
	public static void  upper(char[] ch){ // 주소값 → 참조해서 값을 변경
	    System.out.println("2. upper. 배열의 주소 : "  +   System.identityHashCode(ch));
		//	대문자로변경 [A,B,C]   A65 = a97-32  
	    for(int i=0; i<ch.length; i++) {ch[i]-=32; }
	}
	
	////////////////////////////////////////////
	public static void main(String[] args) {
	    char[] ch = {'a','b','c'};
	    System.out.println("1. main. 배열의 주소 : "  +   System.identityHashCode(ch));
	    upper(ch);  
	    //public static 리턴값 메서드명(파라미터){ 해야할일 }
	    //public static void  upper(char[] ch){ 대문자로변경 [A,B,C]  }
	    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          ); 
	}
}
/*
연습문제6)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx006

public class MethodEx006{ 
    char[] ch = {'a','b','c'};
    upper(ch);     
    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
}

*/