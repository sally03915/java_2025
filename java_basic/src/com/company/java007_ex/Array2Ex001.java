package com.company.java007_ex;

public class Array2Ex001 {
	public static void main(String[] args) {
		   int[][] arr2={{100,200,300},{400,500,600}};
		   
		   System.out.println("층의 갯수: " +    arr2.length);   //2층
		   System.out.println("칸의 갯수: " + arr2[0].length);   //3칸 
		  
		   
		   for(int ch=0; ch<arr2.length; ch++) {   //1. 몇층?  int ch=0; ch<2; ch++
			   for(int kan=0; kan<arr2[ch].length; kan++) {   //2. 몇칸
				   System.out.print(arr2[ch][kan] + "\t");
			   } 
			   System.out.println();  //3. 한층이 끝나고 나면 해야할일
		   }// end ch
		   
	}
}
/*
연습문제9)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex001
배열을 이용하여 다음의 프로그램을 작성하시오.   
  
   int[][] arr2={{100,200,300},{400,500,600}};

   이중for 이용해서 출력하기

*/