package com.company.java008_ex;

public class Method003_ex {
	public static int  return_num(){  return  1;  }
	public static double return_float(){ return 3.3333;   }
	public static String  mycolor()  { return  "PURPLE";  }
	public static String    jangsu()   { return "★★★★★";  }
	/////////////////////////////////////////////////
	public static void main(String[] args) {
	
		System.out.println("1. 내가 좋아하는 숫자    :" + return_num());    // 1을 결과값으로 줌
		//public static 리턴값 메서드명(재료){   }
		//public static 1    return_num(){  return  1을 결과값으로 줌   }
		//public static int  return_num(){  return  1;  }
 		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  // 3.3333을 결과값으로 줌
 		//public static 리턴값   메서드명(재료){   }
 		//public static 3.3333 return_float(){ return 3.3333을 결과값으로    }
 		//public static double return_float(){ return 3.3333;   }
 		
 		System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
 		//public static 리턴값   메서드명(재료){   }
 		//public static PURPLE  mycolor()  { return  PURPLE을 결과값;  }
 		//public static String  mycolor()  { return  "PURPLE";  }
 		
 		System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
 		//public static 리턴값     메서드명(재료){   }
 		//public static ★★★★★   jangsu()   { return ★★★★★  }
 		//public static String    jangsu()   { return "★★★★★";  }
 		
 		System.out.println("5. 10+20= " + myadd(10,20));       // 두숫자를 더한값을 결과값으로 줌  
 		//public static 리턴값     메서드명(재료){   }
 		//public static 30        myadd(10,20){  두숫자를 더한값을 결과값 } 
 		//public static int       myadd(int a,int b){  return a+b; } 
 		
 		
 		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
 		//public static 리턴값     메서드명(재료){   }
 		//public static 노랑조    myban('B'){  A이면 노랑조 ,  B이면 주황조  }
 		//public static String   myban(char a){  if(A이면){ 노랑조} else if(B이면){ 주황조}  }
 		
 		
 		System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
 		//public static 리턴값     메서드명(재료){   }
 		//public static G1111     stdId(1111 ){   return "G"+1111; }
 		//public static String    stdId(int a){   return "G"+a; }
 		
 		System.out.println("8. 당신의 평균은?" + stdAvg(88));   // 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D
 		//public static 리턴값 메서드명(재료){   }
 		//public static A     stdAvg(88){90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D} 
		//public static char  stdAvg(int a){ if(90점이상이면){A} else if(80점이상이면){B}else if( 70점이상이면){ C }else{D}} 

	}
	/////////////////////////////////////////////////
	public static char  stdAvg(int a){ 
		//ver-1
		/*
		if(a>=90){ return 'A'; } 
		else if(a>=80){return 'B';}
		else if( a>=70){return 'C'; }
		else{ return 'D';}  */
		//ver-2
		return   a>=90? 'A': ( a>=80? 'B' : (a>=70? 'C':'D'));
	} 
	public static String    stdId(int a){   return "G"+a; }
	public static int      myadd(int a,int b){  return a+b; } 
	public static String   myban(char a){ 
		//ver-1  if
		/*
		     if(a=='A'){return "노랑조"; } 
		else if(a=='B'){return "주황조"; }  
		else           {return  "";    } */
		return (a=='A')?"노랑조":   (a=='B')?"주황조":"";
	}
}
/*
연습문제3)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx003

System.out.println("1. 내가 좋아하는 숫자    :" + return_num());    // 1을 결과값으로 줌
System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  // 3.3333을 결과값으로 줌
System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
System.out.println("5. 10+20= " + myadd(10,20));       // 두숫자를 더한값을 결과값으로 줌  
System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
System.out.println("8.당신의 평균은?" + stdAvg(88));    
// 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D
*/