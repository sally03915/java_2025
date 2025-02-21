package com.company.java005_ex;

public class RepeatEx003_1 {
	public static void main(String[] args) {
		//변수
		int hap=0;   // hap[0]
		//입력
		//처리
		// 현재 합을구하는 곳에 1을 더하고    
		// 현재 합을구하는 곳에 2을 더하고    
		//hap = hap + 1;  // 2) hap[1]  =    1) 0+1
		//hap = hap + 2;  // 2) hap[3]  =    1) 1+2
		//hap = hap + 3;
		for(int i=1; i<=10; i++) { 	hap = hap + i; }
		//출력
		System.out.println("1~10까지의 합 : " + hap);
	}
} // ctrl + shift + f
/*

연습문제3)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx003
출력내용 :   for 이용
1~10까지의 합을 구하시오.
*/