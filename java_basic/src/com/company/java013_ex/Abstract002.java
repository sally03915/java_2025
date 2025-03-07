package com.company.java013_ex;

/*
 				Shape002  {   showArea(int w, int h);  showArea(int r) }
 		↑   		↑  		 ↑
 	Rectangle    Circle    Triangle	
 */
abstract class Shape002{
	abstract void showArea(int w, int h);    // {}
	abstract void showArea(int r); // 설계메서드
}
class Rectangle  extends Shape002{
	@Override void showArea(int w, int h) { System.out.println("사각형의 넓이 : " + w*h); }
	@Override void showArea(int r) { }  // 불필요한 Override
}  
class Circle  extends Shape002{
	@Override void showArea(int w, int h) {  } // 불필요한 Override
	@Override void showArea(int r) { System.out.println("원의 넓이 : " + r*r*Math.PI);}
}  
class Triangle  extends Shape002{
	@Override void showArea(int w, int h) {  System.out.println("삼각형의 넓이 : " + w*h*0.5); }
	@Override void showArea(int r) { }  // 불필요한 Override
}  
public class Abstract002 {
	public static void main(String[] args) {
		///// ver-1
		Shape002 shape = null;   // shape = new Shape002();  error
		
		shape = new Rectangle();  // 부모 = 자식
		shape.showArea(10,3);
		
		shape = new Circle();  // 부모 = 자식
		shape.showArea(10);
		
		shape = new Triangle();  // 부모 = 자식
		shape.showArea(10,3);
		
		System.out.println(); System.out.println(); System.out.println();
		
		///// ver-2
		Shape002 shape2 = null; 
		Shape002 []s    = {new Rectangle() , new Circle() , new Triangle()};
		//                   Circle이니?  shape.showArea(10);
		//  instanceof - 객체가 어떤클래스인지 어떤클래스를 상속받았는지 확인
		if(  s[0]  instanceof  Circle ) {  s[0].showArea(10); }
		else { s[0].showArea(10,3);  }
		
		if(  s[1]  instanceof  Circle ) {  s[1].showArea(10); }
		else { s[1].showArea(10,3);  }
		
		if(  s[2]  instanceof  Circle ) {  s[2].showArea(10); }
		else { s[2].showArea(10,3);  }
		
		
	}
}
 













