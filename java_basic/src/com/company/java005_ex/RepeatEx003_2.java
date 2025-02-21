package com.company.java005_ex;

public class RepeatEx003_2 {
	public static void main(String[] args) {
		//변수
		int hap=0;   // hap[0]
		String result="";
		//입력
		//처리  1~10까지의 합을 구하시오.
		// ver-1
		// hap곳에 1누적 / ""  1 출력
		// hap곳에 2누적 / "+" 2 출력
		// hap곳에 3누적 / "+" 3 출력
		// ver-2
		//	hap+=1; System.out.print(""  + 1);  
		//	hap+=2; System.out.print("+" + 2);  
		//	hap+=3; System.out.print("+" + 3);  
		// ver-3   {}   {변수}  for(시작; 종료; 변화)
		for(int i=1; i<=10; i++){  hap+=i; System.out.print( (i==1?"": "+") + i);  }
		//출력
		System.out.println("=" + hap);
	}
} // ctrl + shift + f
/*

연습문제3)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx003
출력내용 :   for 이용
1~10까지의 합을 구하시오.
*/