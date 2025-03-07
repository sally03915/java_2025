package com.company.java014;

import java.util.ArrayList;

/*  1. 클래스는 부품객체 
 *  2. 멤버변수 / 멤버함수
 *  Q2 상속도
 	Object						        Object(){#3  }#4
 	  ↑	
 	Papa     money=10		/--------   Papa(){#2    }#5
 	  ↑	
 	Son      money=150,car=2/toString   Son() {#1    }#6   @Override
 */

public class Repeat002_oop {
	public static void main(String[] args) {
		//Step1  Q3
		Papa p1 = new Papa();  //[money=1 ,toString] = 1번지 Papa(){money=10 / toString }
		System.out.println(p1);//Papa [money=10]
		
		//Step2 Q4
		Son s2 = new Son(); // Son s2 [money=150,car=2/toString]-[money=10/toString  ]
		// s2 = 2번지 {money=150,car=2/toString}-{money=10/------}
		System.out.println(s2);  //Son [money=150, car=2]
		
		//Step3  Q5
		//Son s3 = (Son) new Papa(); //Son s3 [money=150,car=2/toString]-[money=10/toString  ]
		//  s3	= 3번지                                            Papa(){money=10 / toString }	
		// error - Type mismatch: cannot convert from Papa to Son
		
		//Step4 Q6
		Papa p4 = new Son();                               //[money=10 ,toString]  
		//  s2 = 4번지 Son(){money=150,car=2/toString}- Papa(){money=10/------}  @Override
		System.out.println(p4);  //Son [money=150, car=2]
		System.out.println(p4.money); // money10
		
		//Step5  Q7
		Papa p5 = new Son();  //1. 부모 = 자식   / 업캐스팅 / 타입캐스팅필요 X
		Son  s5 = (Son) p5;   //2. 자식 = 부모   / 다운캐스팅/ 타입캐스팅필요 O / 부모는 자식생성자를 호출한적이 있어야 한다.
		//Son              s5 [money=150,car=2/toString]-[money=10/toString  ]
		//    p5 =  5번지 Son(){money=150,car=2/ toString}- Papa(){money=10 /------}
		System.out.println(          s5.money       );  //150
		System.out.println(  ((Papa)s5).money       );  //10
		System.out.println(  ((Papa)s5).toString()  );  //Son [money=150, car=2]
		
		ArrayList<String> list = new ArrayList<>();  //다음주진행  ctrl + shift + o (import)
		
		// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
	}
}
// Q8 오버로딩/오버라이딩
// 오버로딩   : 메서드의 이름을 같게, 알규먼트 자료형과 갯수를 다르게해 구분 / 비슷한기능
// 오버라이딩 :  상속시 부모의 메서드를 자식에게 맞게 수정해서 사용 

class Papa{
	int money=10;

	public Papa() { super(); }
	public Papa(int money) { super(); this.money = money; }
	@Override public String toString() { return "Papa [money=" + money + "]"; }
}
class Son extends Papa{
	int money=150;
	int car=2;
	
	public Son() { super(); }
	public Son(int money) { super(money); }
	public Son(int money, int car) { super(); this.money = money; this.car = car; }
	@Override public String toString() { return "Son [money=" + money + ", car=" + car + "]"; }
}
