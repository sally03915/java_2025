package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String[] args) {
		char [][] ch = new char[2][3];  //00 01 02    10 11 12
		//ver-1
//		ch[0][0] = 'A';  ch[0][1] = 'B';  ch[0][2] = 'C';
//		ch[1][0] = 'B';  ch[1][1] = 'C';  ch[1][2] = 'D';
		
		
		//ver-2
//		char data= 'A';
//		ch[0][0] = data++;  ch[0][1] = data++;  ch[0][2] = data++;
//		
//		data='B';  //한층이 끝나고 해야할일.
// 		ch[1][0] = data++;  ch[1][1] = data++;  ch[1][2] = data++;
		
		//ver-3
//		char data= 'A';
//		for(int kan=0; kan<ch[0].length; kan++){ ch[0][kan] = data++; }
//		data='B';  //한층이 끝나고 해야할일.
//		
//		for(int kan=0; kan<ch[1].length; kan++){ ch[1][kan] = data++; }
//		data='B';  //한층이 끝나고 해야할일.
		
		char data= 'A';
		for(int c=0; c<ch.length; c++){//#1. 층의정보
			for(int kan=0; kan<ch[c].length; kan++){ ch[c][kan] = data++; }//#2. 칸의정보
	 		data='B';  //한층이 끝나고 해야할일.
		}
		for(int c=0; c<ch.length; c++) { //#1. 층의정보
			for(int kan=0; kan<ch[c].length; kan++) { //#2. 칸의정보
				System.out.print(ch[c][kan] + "\t");
			}
			//#3. 한층이 끝나면 해야할일
			System.out.println();
		} //end for
	}
}
/*
 
연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
	A	B	C
	B	C	D
 
*/