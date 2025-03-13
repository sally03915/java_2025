package com.company.java018;

class Milk{
	private  String name;
	private  int    price;
	
	public Milk() {  this.name = "white"; this.price = 1300;  }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } 
	public void setPrice(int price) { this.price = price; }
}
class MilkPrint{
	void   show( Milk []milks ) {  // milks = [1번지, 2번지, 3번지]  
	  for(int i=0; i<milks.length; i++) {	
		System.out.println( milks[i].getName() + "/" + milks[i].getPrice()  );
	  }
	}
}
public class Repeat001 {
	public static void main(String[] args) {
		//Q3. 클래스
		 	Milk m1 = new Milk("choco" , 1200);
		 	System.out.println( m1 );  // 출력된 결과 : choco / 1200
		 	Milk m2 = new Milk();
		 	System.out.println( m2 );  // 출력된 결과 : white / 1300
		//Q4.  클래스 배열
			Milk []milks = new Milk[3];         // milks = [null, null, null]
			milks[0] = new Milk("white",1000);  // milks[0] = 1번지  {"white" , 1000}
			milks[1] = new Milk("choco",1200);
			milks[2] = new Milk("banana",1500);
			
			MilkPrint  print = new MilkPrint();   
			print.show(  milks     );	
			// 리턴값  메서드명   파라미터
			// void   show( Milk []milks );   // milks = [1번지, 2번지, 3번지]
			
		//Q5. 다형성
		/*
		 	Object
		 	  ↑
		 	TestA2   {a = 10 / toString}
		 	  ↑
		 	TestB2   {b = 20 / toString}
		 */
			TestA2   ta = new TestA2();  //5-1 ta {a = 10 / toString} = 1번지 {a = 10 / toString}
			//TestB2   tb = (TestB2) ta;    
			// 5-2         {b = 20 / toString}-{a = 10 / toString} tb = 1번지 {a = 10 / toString}
			//			   {b = 20 / toString} 부분을 사용할수 없음! 
			// 				자식   = 부모 / 다운캐스팅 / 타입캐스팅
			
			//5-3      해결방안  					              TestB2() → TestA2()  → Object{} 
			ta = new TestB2();//ta {a=10/toString}= 2번지{b = 20 / toString}-{a = 10 / toString} 
			TestB2   tb = (TestB2) ta;  
			// 				자식   = 부모 / 다운캐스팅 / 타입캐스팅O - 부모는 자식생성자를 호출한 적이 있어야 한다.
			
	}
}

class TestA2{
	int  a = 10;
	public TestA2() { super();  }
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}
class TestB2 extends  TestA2{ 
	int b=20;
	public TestB2() { super();  }
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }
}
/*
Q1. JVM 영역

	---------------------------------------------------------------------
	[JAVA파일 ]   A.java    (1)
	      |  [JAVA 컴파일러(javac.exe) ] javac    A.java      (2)
	[CLASS파일]   A.class  (3)  
	---------------------------------------------------------------------
	(4) [ Class Loader]    (5)[Execution Engine]  (6) [Garbage Collector]
		        ↕	                   ↕		         ↕
	    ==========================================================================
	     (7) [ Runtime Data Area]
	     [  Method (8) | Heap(9)      | Stack (10) | PC register(11)| Native Method Stack(12)] 
	    ==========================================================================
	---------------------------------------------------------------------	   
	Q1) JVM의 영역을 구분하시오.  [ Class Loader , Execution Engine , Garbage Collector , Runtime Data Area]
	Q2) [Class Loader]  JVM이 운영체제로부터 할당받은 메모리영역인 Runtime Data Area로 적재하는 역할 
	Q3) [Execution Engine]  Class Loader에 의해 메모리에 적재된 클래스(바이트 코드)들을 
	                        기계어로 변경해 명령어 단위로 실행하는 역할
	Q4) [Garbage Collector]   Heap 메모리 영역에 생성(적재)된 객체들 중에 참조되지 않는 객체들을 탐색 후 제거하는 역할 
  	Q5) [Runtime Data Area]   JVM의 메모리 영역으로 자바 애플리케이션을 실행할 때 사용되는 데이터들을 적재하는 영역 

	Q6) Runtime Data Area을 구분하시오.
		[  Method , Heap , Stack  ]
	Q7) Runtime Data Area 영역중 클래스데이터가   저장되는 영역  [Method ]  ###
	Q8) Runtime Data Area 영역중 인스턴스데이터가 저장되는 영역  [Heap ]  ### 
	Q9) Runtime Data Area 영역중 지역변수데이터가 저장되는 영역  [Stack ]  ### 
	
	

Q2.  인스턴스변수, 클래스변수를 구분하시오.


2-1. 인스턴스변수, 클래스변수를 구분
class Test{
	static int cv = 1;  // 클래스변수   , runtime-Method , new X, 공유   Test.cv
	int iv = 1;         // 인스턴스변수  , runtime-Heap  , new O , 각각 (this)    
	static {cv=2;}
	{iv=2;}
	Test(){  iv=3; }
}
public class EX015 {
	public static void main(String []args) {
		System.out.println(" 다음 중 인스턴스변수의 초기화 순서를 적으시오.  ");   ####
		Test t1 = new Test();  System.out.println(t1.iv);
		//1. new 메모리빌리기, 객체생성  2.생성자호출 - 초기화  3. t1 번지줌.
	   
	} // end main
} // end class

2-2. runtime-메모리
------------------------------------------------------
[Method  class들의 정보, static, final ] Test.class, Ex015.class  (클래스:설계도) / cv[1]
------------------------------------------------------
[Heap    실체화]                       | [Stack 지역변수데이터  ]
1번지 Test{iv}                       ←  t1(1번지)
------------------------------------------------------

2-3. 
runtime area [  method  | heap | stack | pc register | navtive method stack]
ㅁ 클래스변수 :   static int cv
	       기본값 	| 명시적 초기화  = | 클래스 초기화블럭  { } |        생성자
 int cv [  cv=0            cv = 1;      cv=2;              cv=2;   X       ]
ㅁ 인스턴스 변수 : int iv 
		   기본값	    | 명시적 초기화  =  | 인스턴스 초기화 블록 | 		  생성자
		[  0		   iv = 1;            iv=2;			  iv=3;    O       ] 
 

 



Q3.  class(1) 필요한 자료의 묶음.
 		 1. 메인은 다음과 같다.
 		 	Milk m1 = new Milk("choco" , 1200);
 		 	System.out.println( m1 );  // 출력된 결과 : choco / 1200
 		 	Milk m2 = new Milk();
 		 	System.out.println( m2 );  // 출력된 결과 : white / 1300
 		 	
		 2.	Milk 클래스를 구현하시오 
			  	클래스의 기능 : 데이터를 받아서 전달하는 기능  (DTO)
				1) 멤버변수    private  name이름 ,  private  price가격      
				2) 생성자      기본생성자 : 
						   필드생성자 : 이름,  , 가격을 입력받아 처리해주는 생성자	
				3) 멤버함수  ---		  



Q4.  class(2) 클래스 배열
 		 1. 메인은 다음과 같다.
			Milk []milks = new Milk[3];   
			milks[0] = new Milk("white",1000);
			milks[1] = new Milk("choco",1200);
			milks[2] = new Milk("banana",1500);
			
			MilkPrint  print = new MilkPrint();   
			print.show(  milks     );	
			// 출력된 결과 : 
			 * white  / 1000
			 * choco  / 1200
			 * banana / 1500 
			 
		 2.	MilkPrint 클래스를 구현하시오 


Q5.   다형성
		class TestA2{
			int  a = 10;
			public TestA2() { super();  }
			@Override public String toString() { return "TestA2 [a=" + a + "]"; }
		}
		class TestB2 extends  TestA2{ 
			int b=20;
			public TestB2() { super();  }
			@Override public String toString() { return "TestB2 [b=" + b + "]"; }
		}
		public class ExtendsBasic009_2_Polymorphism2_short {
			public static void main(String[] args) {        
				TestA2   ta = new TestA2();    // [ ta   [a]  ]
				TestB2   tb = ta;                   // [ tb   [b]-[a]  ]
				// 오류나는 이유는? 
			}
		 }


Q6.    1. 콜렉션프레임워크의 종류 (필기)   > 배열의 단점개선 >  동적배열
		 List   :    순서 [O] , 중복허용 [O]   기차
				=>  사용가능메서드: [추가][삭제][갯수][데이터꺼내기]
								 add   remove  size  get(순서)    contains(포함)
		 Set    :    순서 [X] , 중복허용 [X]   주머니
				=>  사용가능메서드: [추가][삭제][갯수][데이터꺼내기] 
								 add   remove  size  ,향for/Iterator,  contains(포함)
		 Map    :    순서가아닌 [키, 값]의 쌍(ENTRY)으로 이루어짐
		        =>  사용가능메서드: [추가][삭제][갯수][데이터꺼내기]  
		        		put   remove  size  get(키) ,향for/Iterator,  contains(포함) 

Q7.  ArrayList
 		 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기  

Q8.   HashSet
		 *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기  

Q9.   HashMap
		 *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기  
		 
		 ㅁ 출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain	120
		 
		 나이총합 : 203
		 나이평균 : 67.67

Q10.  다음과 같이 폴더와 파일을 만들어주세요!
	1. folder 만들기   - 금일 패키지  com.company.java018
	2. 파일만들기      - 위의폴더에   JavaIO002.txt

*/