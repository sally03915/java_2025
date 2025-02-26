package com.company.java008;

public class Repeat {
	public static void main(String[] args) {
		//Q1  int보다 작은 자료형 - byte, short/char  연산시 int기본형으로변환
		byte b1=1;   byte b2=2;   
		byte result1 = (byte) (b1+b2);  
		int  result2 = b1+b2;  
		
		//Q2 for, while, do while 3가지 버젼으로    100 200 300  
		//System.out.print(100 + "\t");  System.out.print(200 + "\t"); System.out.print(300 + "\t");
		//for
		for(int i=100; i<=300; i+=100){  System.out.print(i + "\t"); }   System.out.println();
		//while
		int i=100; while(i<=300){System.out.print(i + "\t");  i+=100;}   System.out.println();
		//do while
		i=100; do{System.out.print(i + "\t");  i+=100;}while(i<=300);    System.out.println();	
		
		
		
		//Q3  1차원배열
		// 10,20,30
		int [] arr = new int[3];
		int    data=10;
		//		arr[0] = data;  data+=10;
		//		arr[1] = data;  data+=10;
		//		arr[2] = data;  data+=10;    
		for(int i3=0; i3<arr.length; i3++) { arr[i3] = data;  data+=10;        }
		for(int i3=0; i3<arr.length; i3++) { System.out.print(arr[i3] + "\t"); }
		
		
		
		//Q4. 다차원배열  {10,20,30}, {50,60,70}
		int[][] arr2 = new int[2][3];  //00 01 02
									   //10 11 12
		//ver-1 
		//		arr2[0][0] = 10;
		//		arr2[0][1] = 20;
		//		arr2[0][2] = 30;
		//		
		//		arr2[1][0] = 50;
		//		arr2[1][1] = 60;
		//		arr2[1][2] = 70;		
	
		//ver-2
		//		int data2=10;
		//		arr2[0][0] = data2;  data2+=10; //data2+=10; 20
		//		arr2[0][1] = data2;  data2+=10; //data2+=10; 30
		//		arr2[0][2] = data2;  data2+=10; //data2+=10; 40
		//		
		//		data2=50;  // 한층이 끝나고나면 해야할일
		//
		//		arr2[1][0] = data2;  data2+=10; //60
		//		arr2[1][1] = data2;  data2+=10; //70
		//		arr2[1][2] = data2;  data2+=10; //80
		
		//ver-3
		//		int data2=10;
		//		
		//		for(int kan=0; kan<3; kan++){ arr2[0][kan] = data2;  data2+=10;  }
		//		data2=50; 
		//		
		//		for(int kan=0; kan<3; kan++){ arr2[1][kan] = data2;  data2+=10;  }
		//		data2=50; 
		int data2=10;
		
		for(int ch=0;ch<2; ch++){  //         ch<2  - arr2.length
			for(int kan=0; kan<3; kan++) // kan <3  - arr2[ch].length
			{ arr2[ch][kan] = data2;  data2+=10;  }
			data2=50; 
		}
		
		System.out.println();
		System.out.println();
		for(int ch=0; ch<arr2.length; ch++) { //#1. 층의 정보
			for(int kan=0; kan<arr2[ch].length; kan++) { //#2. 칸의 정보
				System.out.print(arr2[ch][kan] +"\t");
			}
			//#3. 한층이 끝나고 나면 해야할일
			System.out.println();
		}
		
			
		
		
	}
}
/*
1) 클래스명 : Repeat001
다음 오류를 해결하시오.  오류가 나는 이유는?
byte b1=1;   byte b2=2;   byte result = b1+b2;

2) 클래스명 : Repeat002
for, while, do while 3가지 버젼으로    100 200 300  출력

3) 클래스명 : Repeat003
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : 10,20,30
3. for + length 를 이용하여  배열안의 10,20,30을 출력하시오.

4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {10,20,30}, {50,60,70}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.

5) 다음에 알맞은 코드를 작성하시오. 
- two   버튼을 클릭하면 본인이름 알림창 띄우기
 <button  class="btn btn-warning my-3"  > TWO </button> 
*/