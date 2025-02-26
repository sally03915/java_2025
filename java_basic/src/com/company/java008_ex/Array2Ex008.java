package com.company.java008_ex;

public class Array2Ex008 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int data=1;
		
		for(int ch=0; ch<arr.length; ch++) {  //#1 층정보
			for(int kan=0; kan<arr[ch].length; kan++) {  //#2 칸정보
				arr[ch][kan] = data++;
				System.out.print(arr[ch][kan] + "\t");
			}// end for
			//#3 층끝나면해야할일
			data=1;
			System.out.println();
		} // end for
		
	}// end main
}// end class
/*

연습문제16)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex008
> 2차원배열   4*4
1.  new 로 만들고 
2.  데이터 넣기  for+length
3.  데이터 출력  for+length
1	2	3	4
1	2	3	4
1	2	3	4
1	2	3	4
*/