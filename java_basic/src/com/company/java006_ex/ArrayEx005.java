package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		char [] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int  upper=0, lower=0;
		
		//ver0 - ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트
		//ver1 - 'B' 대문자의 갯수카운트, 'B' 소문자의 갯수 카운트
		//ver1 - 'a' 대문자의 갯수카운트, 'a' 소문자의 갯수 카운트
		//ver2 - if('B' 대문자의 ){갯수카운트} else if('B' 소문자의){갯수 카운트}
		//ver2 - if('a' 대문자의 ){갯수카운트} else if('a' 소문자의){갯수 카운트}
		//ver3
		//		if(ch[0]>= 'A'  && ch[0]<='Z' ){upper++;} 
		//		else if(ch[0]>= 'a'  && ch[0]<='z' ){lower++;}
		//		if(ch[1]>= 'A'  && ch[1]<='Z' ){upper++;} 
		//		else if(ch[1]>= 'a'  && ch[1]<='z' ){lower++;}
		for(int i=0; i<ch.length; i++){
			if(ch[i]>= 'A'  && ch[i]<='Z' ){upper++;} 
			else if(ch[i]>= 'a'  && ch[i]<='z' ){lower++;}
		}
		System.out.println("대문자 갯수 : " + upper + " , 소문자의 갯수 : " +lower);
	}
}
/*
연습문제5)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx005
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

*/