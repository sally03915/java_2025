package com.company.java006_ex;

public class ForEx007 {
	public static void main(String[] args) {
		//1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
		for(int i=1; i<=5; i++) {  System.out.print(i + "\t");   }   System.out.println();
		int i=1;  while(i<=5) {  System.out.print(i + "\t"); i++;}   System.out.println();
		i=1; do{  System.out.print(i + "\t"); i++;}while(i<=5);      System.out.println();
		
		//2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
		for(int i2=5; i2>=1; i2--) { System.out.print(i2+"\t");   }   System.out.println();
		int i2=5; while(i2>=1) { System.out.print(i2+"\t");  i2--;}   System.out.println();
		i2=5; do{ System.out.print(i2+"\t");  i2--;}while(i2>=1);     System.out.println();
		
		//3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
		//System.out.print("JAVA" + 1);  System.out.print("JAVA" + 2); System.out.print("JAVA" + 3);
		for(int i3=1; i3<=3; i3++){ System.out.print("JAVA" + i3);   }   System.out.println();
		int i3=1;  while(i3<=3){ System.out.print("JAVA" + i3); i3++;}   System.out.println();
		i3=1;  do{ System.out.print("JAVA" + i3); i3++;}while(i3<=3);    System.out.println();
	}
}
//1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
//2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
//3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3