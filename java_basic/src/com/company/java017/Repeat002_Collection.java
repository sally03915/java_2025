package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Milk {
	   private int no; private String name; private int price;
	   public Milk() { super(); }
	   public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	   @Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	   public int getNo() { return no; }  public void setNo(int no) { this.no = no; }
	   public String getName() { return name; }  public void setName(String name) { this.name = name; }
	   public int getPrice() { return price; }  public void setPrice(int price) { this.price = price; }
	
	   @Override public int hashCode() { return Objects.hash(name, no, price); }
	
	   @Override public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Milk other = (Milk) obj;
			return Objects.equals(name, other.name) && no == other.no && price == other.price;
		}   

	   

}
public class Repeat002_Collection {
	public static void main(String[] args) {
//		2. dto 를 이용하여 ArrayList + Iterator  이용해서 만들기     >>> ArrayList<Milk> 
		// List : index O, 중복허용O / add, get, size, remove, contains
		List<Milk> list = new ArrayList<Milk>();
		list.add(new Milk(1 ,	"white",	1000));
		list.add(new Milk(2 ,	"choco",	1200));
		list.add(new Milk(3 ,	"banana",	1300));
		
		System.out.println(" ======================\r\n" + " NO	NAME	PRICE\r\n" + " ======================");
		Iterator <Milk> iter1=list.iterator();  //1.  모으기 
		while(iter1.hasNext()) {//2. 처리대상 확인
			Milk temp =	iter1.next(); //3. 꺼내오기
			System.out.println(temp.getNo()+ "\t" + temp.getName() + "\t" + temp.getPrice());
		}
		 		 
//		3. dto 를 이용하여 HashSet   + Iterator  이용해서 만들기     >>> HashSet<Milk> 
		// Set : index x, 중복허용x / add, get(X), size, remove, contains
		Set<Milk> set = new HashSet<Milk>();
		set.add(new Milk(1 ,	"white",	1000));  // new Milk - heap area
		set.add(new Milk(2 ,	"choco",	1200));  // add(주소값)
		set.add(new Milk(3 ,	"banana",	1300));  // 1) hashCode (Milk) 2) equals
		set.add(new Milk(3 ,	"banana",	1300)); //3개
		//System.out.println( set.size() );  //4개  → 3개 1) hashCode (Milk) 2) equals
		
		Iterator <Milk> iter2=set.iterator();  //1.  모으기 
		while(iter2.hasNext()) {//2. 처리대상 확인
			Milk temp =	iter2.next(); //3. 꺼내오기
			System.out.println(temp.getNo()+ "\t" + temp.getName() + "\t" + temp.getPrice());
		}
		
//		4. dto 를 이용하여 HashMap   + Iterator  이용해서 만들기     >>> HashMap<Integer, Milk> 
		Map<Integer, Milk> map = new HashMap<>(); 
		// Map : Map<Key:Integer:객체, Value:Milk:객체> /put, get(key), size, remove, contains
		map.put(1, new Milk(1 ,	"white",	1000));   
		//key  : Integer i    = 1;     - Wrapper - boxing
		//value: Milk    milk = new Milk(1 ,	"white",	1000);     - Wrapper - boxing
		map.put(2, new Milk(2 ,	"choco",	1200));  // add(주소값)
		map.put(3, new Milk(3 ,	"banana",	1300));
		
		System.out.println(  map.entrySet());
		//[1=Milk [no=1, name=white, price=1000], 2=Milk [no=2, name=choco, price=1200], 3=Milk [no=3, name=banana, price=1300]]
		Iterator <Entry <Integer, Milk>> iter3=map.entrySet().iterator(); //1. 모으기
		while(iter3.hasNext()) { //2. 처리대상확인
			Entry <Integer, Milk> key_value = iter3.next();
			//                   1=Milk [no=1, name=white, price=1000]
			System.out.println(key_value.getKey()); //1
			System.out.println(key_value.getValue()); //Milk [no=1, name=white, price=1000]
			Milk temp = key_value.getValue();
			//Milk temp = map.get(key_value.getKey());   map에서 key를 넣으면 값이 나옴.
			System.out.println(temp.getNo()+ "\t" + temp.getName() + "\t" + temp.getPrice());
		}
		
	}
}
/*
1. dto
  class Milk{
  	private int no;  private String name;  private int price;
  }          
2. dto 를 이용하여 ArrayList + Iterator  이용해서 만들기     >>> ArrayList<Milk> 
3. dto 를 이용하여 HashSet   + Iterator  이용해서 만들기     >>> HashSet<Milk>  
4. dto 를 이용하여 HashMap   + Iterator  이용해서 만들기     >>> HashMap<Integer, Milk>    

ㅁ 출력된결과   (3번이 나와야함)
 ======================
 NO	NAME	PRICE
 ======================
 1	white	1000
 2	choco	1200
 3	banana	1300 
*/