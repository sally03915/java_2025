package com.company.java008_ex;

import java.util.Scanner;

public class Method004_ex {
	//1
	public static int process_total(int kor, int eng, int math){  return kor+eng+math; }
	
	//2
	public static float process_avg(int total){  return total/3f; }
	
	//3
	public static String process_pass(float avg, int kor,int  eng,int  math){  
		//합격 평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 
		/*
		String result="불합격";
		if(avg>=60 && kor>=40 && eng>=40 && math>=40 ) {  result="합격";}
		else if(kor<40 || eng<40 || math<40 ) {result="재시험";}
		return result;
		*/
		return  avg<60? "불합격" : kor<40 || eng<40 || math<40? "재시험" : "합격"; 
	} 
	 
	//4
	public static String process_scholar(float avg){  return avg>=95?"장학생":""; }
	
	//5
	public static String process_star(float avg){  
		String result="";
		//70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		// 92/10 = 9   100/10 = 10  83/10=8
		for(int i=0; i< (int)avg/10;i++){result +="★"; }
		return result;   // repeat
	}
	
	//6
	public static void process_show(String name,int kor,int eng,int math,int total, 
			float avg, String pass, String jang, String star){  
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: \r\n"
				+ "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\r\n"
				+ "--------------------------------------------------------------------------------------------\r\n");  
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s\t"
						,name, kor, eng, math, total, avg, pass, jang, star);
	}
	
	
	
	public static void main(String[] args) {
/////////////////////(1)  변수
		String name = "";
		int kor, eng, math, total;
		float avg = 0.0f;
		String pass = "";
		String jang = "";
		String star = "";
		Scanner scanner = new Scanner(System.in);
/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
		System.out.print("이름을 입력하세요>"); name  = scanner.next();
		System.out.print("국어를 입력하세요>"); kor   = scanner.nextInt();
		System.out.print("영어를 입력하세요>"); eng   = scanner.nextInt();
		System.out.print("수학을 입력하세요>"); math  = scanner.nextInt();
		
/////////////////////(3) 처리 : 
		// public static 리턴값 메서드명(파라미터){  해야할일 }
		// public static int process_total(int kor, int eng, int math){  return 총점; }
		total = process_total(kor, eng, math); // 1. 총점처리

		// public static 리턴값 메서드명(파라미터){  해야할일 }
		// public static float process_avg(int total){  평균 }
		avg = process_avg(total); // 2. 평균처리

////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 
		// public static 리턴값 메서드명(파라미터){  해야할일 } 
		// public static String process_pass(avg, kor, eng, math){  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 } 
		pass = process_pass(avg, kor, eng, math);

//////// 4. 평균이 95점이상이면 장학생
		// public static 리턴값 메서드명(파라미터){  해야할일 } 
		// public static String process_scholar(float avg){  95점이상이면 장학생 }
		jang = process_scholar(avg);

//////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		// public static 리턴값 메서드명(파라미터){  해야할일 } 
		// public static String process_star(float avg){  70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 }
		star = process_star(avg);

/////////////////////(4) 출력
		// public static 리턴값 메서드명(파라미터){  해야할일 }
		// public static void process_show(name, kor, eng, math, total, avg, pass, jang, star{  해야할일 }
		process_show(name, kor, eng, math, total, avg, pass, jang, star);

	}
}
/*
연습문제4)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx004

public class MethodEx004{ 
	public static void main(String[] args) {
	/////////////////////(1)  변수
		String name  = ""; 
		int kor, eng, math, total ;
		float avg = 0.0f; 
		String pass = "";
		String jang = "";
		String star= "";  
		Scanner scanner = new Scanner(System.in);
		
		/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	
		/////////////////////(3) 처리 : 
		total = process_total(kor , eng, math);    // 1. 총점처리
		
		avg = process_avg(total);    //2.  평균처리
		
		////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
		pass = process_pass(avg , kor, eng, math);  
		
		//////// 4. 평균이 95점이상이면 장학생
		jang = process_scholar(  avg  ); 
		
		//////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		star = process_star(avg);  
		
	   
		/////////////////////(4) 출력
		process_show(name, kor, eng, math, total, avg, pass, jang, star);
	 
		
	}// end main
 
	
}// end class

 
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
		이름		국어	영어	수학	총점  평균	 합격여부	장학생	랭킹
		--------------------------------------------------------------------------------------------
		아이언맨	100	100	100	300    100.0	 합격		장학생	**********
		--------------------------------------------------------------------------------------------
*/