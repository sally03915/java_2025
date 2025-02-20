package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		//변수
		String  stdid="";
		int     kor, eng, math, total;   float avg=0.0f;
		String  pass="불합격", jang="", level="가";
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("학번>");  stdid = scanner.next();
		System.out.print("국어>");    kor = scanner.nextInt();
		System.out.print("영어>");    eng = scanner.nextInt();
		System.out.print("수학>");    math= scanner.nextInt();
		
		//처리
		total = kor + eng + math;  //		1. 총점 구하기
		avg   = total/3.0f;        //		2. 평균 구하기
		
	    if(avg>=60 && kor>=40  && eng>=40  && math>=40) {  pass="합격";  }
		if(avg>=95) { jang="장학생"; }
		
/*		level= (avg>=90)?  "수" :  
						   (avg>=80)?"우":
							          (avg>=70)?"미":
							        	     (avg>=60)?"양":"가";   */
		
		     if(avg>=90) {  level="수";}
		else if(avg>=80) {  level="우";}
		else if(avg>=70) {  level="미";}
		else if(avg>=60) {  level="양";}
		
		//출력
		System.out.println("=================================================================================== \r\n"
				+ "학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\r\n"
				+ "===================================================================================");
		System.out.println(stdid + "\t" + kor + "\t" + eng  + "\t" + math + "\t" + total + "\t" 
				+  String.format("%.2f", avg) + "\t" + pass + "\t" + level + "\t" + jang);
		
	}
}



