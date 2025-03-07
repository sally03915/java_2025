package com.company.java012;

/*		   Object
 		      ↑
 		     Calc (exec)
     ↑	 ↑	 	↑	     ↑	   
  	Plus Minus	Multiply Divide
  	(exec)(exec) (exec) (exec)
*/
class Calc extends Object {
	void exec(double d1, double d2) { System.out.println(); }
}

class  Plus     extends Calc  {void exec( double d1, double d2) { System.out.println(d1+d2);} }
class  Minus    extends Calc  {void exec( double d1, double d2) { System.out.println(d1-d2);}}
class  Multiply extends Calc  {void exec( double d1, double d2) { System.out.println(d1*d2);}}
class  Divide   extends Calc  {void exec( double d1, double d2) { System.out.println(d1/d2);}}

public class Poly005_arr {
	public static void main(String[] args) {
		//  부모    =  자식    / 업캐스팅 / 타입캐스팅 필요 X
		Calc controller=null;
		Calc [] my = { new Plus(), new  Minus(),  new Multiply(), new Divide()  };
		controller = my[0]; controller.exec(10,3);  // 더하기
		controller = my[1]; controller.exec(10,3); // 빼기
		controller = my[2]; controller.exec(10,3); // 곱하기
		controller = my[3]; controller.exec(10,3); // 나누기
	}
}




