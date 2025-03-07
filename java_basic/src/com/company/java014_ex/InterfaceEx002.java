package com.company.java014_ex;
 
/*  1. interface 설계    2. 상수 + abstract method  3. can do this - 서비스는 구현객체(자손) 약속
 		    Board    -   exec()
 	↑	   		↑     	↑     	 	↑
BoardInsert	BoardSelect	BoardUpdate	BoardDelete

 */
interface Board{ void exec(); }   //public abstract 
class BoardInsert implements Board{ @Override public void exec(){System.out.println("글쓰기");}}
class BoardSelect implements Board{ @Override public void exec(){System.out.println("글읽기");}}
class BoardUpdate implements Board{ @Override public void exec(){System.out.println("글수정");}}
class BoardDelete implements Board{ @Override public void exec(){System.out.println("글삭제");}}

 public class InterfaceEx002{
	 public static void main(String[] args) {
		 Board controller = null;  //new Board();
		 controller = new BoardInsert();  controller.exec();
		 controller = new BoardSelect();  controller.exec();
		 controller = new BoardUpdate();  controller.exec();
		 controller = new BoardDelete();  controller.exec();
		 //  인터페이스? 개발코드 변경없이 객체를 바꿔낄수 있도록 하는 역할
	}
 }

  
 
 
 