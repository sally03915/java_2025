package com.company.java009;

import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1  if
		//		문자를 한개 입력받아
		//		if ver - 가   'j'이면  java,  'h'이면   html,   'c'이면 css
		/*
		System.out.print("Q1. 문자 한개 입력>");
		char test1 = scanner.next().charAt(0);
		if(test1=='j') { System.out.println("java"); }
		else if(test1=='h') { System.out.println("html"); }
		else if(test1=='c') { System.out.println("css"); }
		
		// 2  switch
		System.out.print("Q2.문자 한개 입력>");
		char test2 = scanner.next().charAt(0);

		switch(test2) { // sc b
		case 'j' : System.out.println("java"); break; 
		case 'h' : System.out.println("html"); break;  
		case 'c' : System.out.println("css"); break;    
		}
		*/

		// 3  for, while, do while 
		//for, while, do while 3가지 버젼으로    100 200 300
		System.out.println("Q3");
		for(int i=100; i<=300; i+=100) {  System.out.print(i +"\t"); }  System.out.println();
		int i=100; while(i<=300) {  System.out.print(i +"\t"); i+=100;}  System.out.println();
		i=100; do{  System.out.print(i +"\t"); i+=100;}while(i<=300);  System.out.println();
		
		
		// 4   1차원배열 a  b   c   char  저장시 숫자로 출력시 문자로
		System.out.println("Q4");   
		char[]  arr = new char[3];
		char data = 'a';
		//arr[0] = data++;  arr[1] = data++;  arr[2] = data++;
		for(int i4=0; i4<arr.length; i4++) {  arr[i4] = data++;                 }
		for(int i4=0; i4<arr.length; i4++) {  System.out.print(arr[i4] + "\t"); }
		
	
		
		// 5   2차원배열  {a,b,c}, {d,e,f}   char  저장시 숫자로 출력시 문자로
		System.out.println("\nQ5");   
		char[][] arr2 = new char[2][3];   
		char data2='a';
		for(int ch=0; ch<arr2.length; ch++) { //#1 층의 정보
			for(int kan=0; kan<arr2[ch].length; kan++) { //#2 칸의 정보
				arr2[ch][kan]=data2++;
				System.out.print( arr2[ch][kan] + "\t");
			}
			//#2. 한층이 끝나면 정보
			System.out.println();
		}
		
		//6 html + css +js
		/* <button  class="btn btn-warning my-3" onclick="alert('홍길동')" > ONE </button>
		   <button  class="btn btn-warning my-3" id="two" > TWO </button> 
		   <script>
		   	document.getElementById("two").onclick=function(){ alert('홍길동');};
		   </script>
		 */
		
		// 7
		System.out.println("\nQ7");  
		// public static  리턴값 메서드명(재료){ 해야할일 }
		// public static  void      hi(){ System.out.println("hi"); }   // 1단계) 구조
	    hi();   // hi 출력   

		// public static  void hi(1){ hi 1 님! 출력 }  //2단계) 파라미터-재료
		// public static  void hi(int a){System.out.println("hi" + a);   }
	    hi(1);  // hi 1 님! 출력
	    
		// public static  "hi sally" hi("sally"){ return "hi sally" }  //3단계) return
		// public static  String hi( String str){ return "hi "+str; } 
	    System.out.println( hi("sally") );   // hi sally 출력
	}
	public static  void      hi()           { System.out.println("hi");       }
	public static  void      hi(int a)      { System.out.println("hi" + a);   }
	public static  String    hi( String str){ return "hi "+str;               } 
}
/*
1) 클래스명 : Repeat001
문자를 한개 입력받아
if ver - 가   'j'이면  java,  'h'이면   html,   'c'이면 css


2) 클래스명 : Repeat002
문자를 한개입력받아
switfh ver-   'j'이면  java,  'h'이면   html,   'c'이면 css


3) 클래스명 : Repeat003
for, while, do while 3가지 버젼으로    100 200 300  출력


4) 클래스명 : Repeat004
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : a  b   c
3. for + length 를 이용하여  배열안의 a,b,c을 출력하시오.


5) 클래스명 : Repeat005
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr2
2. 값     :  {a,b,c}, {d,e,f}
3. for + length 를 이용하여  배열안의 값을을 출력하시오.


6) 다음에 알맞은 코드를 작성하시오. 
-1) ONE   버튼을 클릭하면 본인이름 알림창 띄우기   (onclick 이용!)
 <button  class="btn btn-warning my-3"  > ONE </button>
 
-2) TWO   버튼을 클릭하면 본인이름 알림창 띄우기   (document.getElementById 이용!)
 <button  class="btn btn-warning my-3" id="two" > TWO </button>
 
 7) 다음의 메서드를 정의 하시오.
 
public static void main(String[] args){
    hi();   // hi 출력
    hi(1);   // hi 1 님! 출력
    System.out.println( hi("sally") );   // hi sally 출력
    
}
출처: https://hi-sally03915.tistory.com/1604 [:DB:DBIG:티스토리]

*/