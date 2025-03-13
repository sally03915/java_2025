package com.company.java018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class UserInfo{
	private int no;
	private String name;
	private int age;
	
	public UserInfo() { super();  }
	public UserInfo(int no, String name, int age) { super(); this.no = no; this.name = name; this.age = age; }
	@Override public String toString() { return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
}

public class Repeat002 {
	public static void main(String[] args) {
//Q7.  ArrayList  
//		 * 	 dto 를 이용하여 ArrayList + Iterator  이용해서 만들기  
		ArrayList<UserInfo>  list = new ArrayList<>();
		list.add(new UserInfo(1	,"iron",		45));
		list.add(new UserInfo(2	,"hulk",		38));
		list.add(new UserInfo(3	,"captain",		120)); 
		
		Iterator <UserInfo> iter1=  list.iterator();// 1.모으기
		int total = 0;
		while(iter1.hasNext()) { //2. 처리대상확인
			UserInfo  temp=iter1.next();
			total += temp.getAge();   //총나이 누적
			System.out.println(temp.getName() +"/" + temp.getAge());
		}
		System.out.println("총나이 : "  + total);
		System.out.println("평균나이 : " + total/list.size());
		
//Q8.   HashSet
//		 *   dto 를 이용하여 HashSet   + Iterator  이용해서 만들기   
		HashSet<UserInfo>  set = new HashSet<>();
		set.add(new UserInfo(1	,"iron",		45));
		set.add(new UserInfo(2	,"hulk",		38));
		set.add(new UserInfo(3	,"captain",		120)); 
		
		Iterator <UserInfo> iter2=  set.iterator();// 1.모으기
		     total = 0;
		while(iter2.hasNext()) { //2. 처리대상확인
			UserInfo  temp=iter2.next();
			total += temp.getAge();   //총나이 누적
			System.out.println(temp.getName() +"/" + temp.getAge());
		}
		System.out.println("총나이 : "  + total);
		System.out.println("평균나이 : " + total/set.size());
		
//Q9.   HashMap
//		 *   dto 를 이용하여 HashMap   + Iterator  이용해서 만들기  
		HashMap< Integer, UserInfo>  map = new HashMap<>();
		map.put(1,new UserInfo(1	,"iron",		45));
		map.put(2,new UserInfo(2	,"hulk",		38));
		map.put(3,new UserInfo(3	,"captain",		120)); 
		
		System.out.println(map.entrySet());  //[1=UserInfo [no=1, name=iron, age=45], 2=UserInfo [no=2, name=hulk, age=38], 3=UserInfo [no=3, name=captain, age=120]]
		total=0;
		Iterator <Entry <Integer, UserInfo>> iter3=map.entrySet().iterator(); //1. key=value
		while(iter3.hasNext()) { //2. 처리대상확인.
			UserInfo temp = iter3.next().getValue();  //3. 꺼내와서 값
			total += temp.getAge();   //총나이 누적
			System.out.println(temp.getName() +"/" + temp.getAge());
		}

		System.out.println("총나이 : "  + total);
		System.out.println("평균나이 : " + total/map.size());
		 
/*		
		 ㅁ 출력된결과
		 ======================
		 NO	NAME	AGE
		 ======================
		 1	iron		45
		 2	hulk		38
		 3	captain	120
		 
		 나이총합 : 203
		 나이평균 : 67.67
*/		 
	}
}

/*
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
*/