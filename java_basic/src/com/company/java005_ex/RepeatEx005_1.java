package com.company.java005_ex;

public class RepeatEx005_1 {
	public static void main(String[] args) {
		//변수
		int cnt=0;
		//입력
		//처리
		//출력   소문자 a~z까지 모음의 갯수를 출력하시오. 
		
		//ver-1  대상 어떠하다
		// a가 모음이라면  카운트:갯수증가
		// b가 모음이라면  카운트:갯수증가
		// c가 모음이라면  카운트:갯수증가
		
		//ver-2  구조  a가 a, a가 e, i , o, u
		// if( a=='a' ||   a=='i' || a=='e'  || a=='o' || a=='u'  ){ 카운트:갯수증가   cnt++; }
		// if( b=='a' ||   b=='i' || b=='e'  || b=='o' || b=='u'  ){ 카운트:갯수증가   cnt++; }
		// if( c=='a' ||   c=='i' || c=='e'  || c=='o' || c=='u'  ){ 카운트:갯수증가   cnt++; }
		// {}  {}  f
		for(char ch='a'; ch<='z'; ch++)
		{ if( ch=='a' ||  ch=='i' || ch=='e'  || ch=='o' || ch=='u'  ){  cnt++; }  }
		
		System.out.println("소문자 a~z까지 모음의 갯수 > " + cnt);
	}
}
/*

연습문제5)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx005
출력내용 :   for 이용
소문자 a~z까지 모음의 갯수를 출력하시오. 
*/