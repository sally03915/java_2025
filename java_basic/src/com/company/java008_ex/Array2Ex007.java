package com.company.java008_ex;

public class Array2Ex007 {
	public static void main(String[] args) {
		//변수
		int[][] arr = new int[5][5];
		//입력
		//ver-1		int data=1;
		//			arr[0][0] = 1;  
		//			arr[0][1] = 2;
		
		//ver-2
		int data=1;
		for(int ch=0; ch<arr.length; ch++) {  // 층
			for(int kan=0; kan<arr[ch].length; kan++) {  //칸
				 arr[ch][kan] = data++;   //data 1개씩증가
			} // 층이끝나면 해야할일
		}
		//처리
		//출력
		for(int ch=0; ch<arr.length; ch++) {
			for(int kan=0; kan<arr[ch].length; kan++) {
				System.out.print(arr[ch][kan] + "\t");
			}System.out.println();
		}
	}
}
/*
연습문제15)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex007
> 2차원배열 
1.  new 로 만들고   5*5
2.  데이터 넣기  for+length
3.  데이터 출력  for+length

1	2	3	4	5
6	7	8	9	10
11	12	13	14	15
16	17	18	19	20
21	22	23	24	25
*/