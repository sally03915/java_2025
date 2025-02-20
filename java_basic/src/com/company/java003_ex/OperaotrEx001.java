package com.company.java003_ex;

public class OperaotrEx001 {
	public static void main(String[] args) {
		
		//먼저() 값(+) (비)교(조)건 (대)입  (비조대)

		int a=3, b=10;
	    System.out.println(  b+=10 - a-- );    //17
	    //1) a--     3
	    //2) 10-a    10-3=7
	    //3) b+= 2)까지 연산된거     b+=7    10+=7  b=17
	    //4) ); 후 --    a=2
	    
	    System.out.println(  a+=5 );  //7
	    //1) a+=5   2+=5   7
	    
	    System.out.println(  a>=10 || a<0 && a>3); //false
	    //() 값 비교(>.<) 조건(&&)대입
	    //	     츄(>.<)    &&,||
	    //1) a>=10            a<0   a>3
	    //   7>=10            7<0   7>3
	    //   false            false && true  && 우선순위 높음
	    //   false     ||     false
	    //2) false
	} // end main
} // end class
/*
연습문제1)
클래스명 : OperatorEx001
    int a=3, b=10;
    System.out.println(  b+=10 - a-- );   
    System.out.println(  a+=5 );
    System.out.println(  a>=10 || a<0 && a>3);
*/