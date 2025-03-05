package com.company.java012_ex;
//1. 클래스는 부품객체
//2. 상태(멤버변수)와 행위(멤버함수)
/*											 27번째:	Green  g = new Green();
Object										  Object(){#3     }#4
 ↑
Color    name(private)						  Color(){#2      }#5  name 인스턴스변수 사용가능
 ↑
Green    num (private)    / void show(){}     Green(){#1      }#6  num 인스턴스변수 사용가능
*/
class  Color extends Object{
	private String name;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
class  Green extends Color {
	private int num;
	
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public void show() { System.out.println( super.getName() + "/" + this.num); }
}

public class Extends002_color {
	public static void main(String[] args) {
		Green  g = new Green();
		g.setName("LIGHT_GREEN");  g.setNum(5);  g.show();
		//g.name = "LIGHT_GREEN";  g.num=5;  g.show();
	}
}
