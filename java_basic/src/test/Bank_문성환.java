package test;

import java.util.Scanner;

public class Bank_문성환 {
	public static void main (String [] args) {
	//변수
	String temp_id = null , id = null;
	int num,pw = 0,temp_pw,bal = 0, depo = 0, with= 0;
	char ch = ' ';
	Scanner scan = new Scanner(System.in);
	
	
	for (;;) { //무한 반복
		System.out.print("\n\n==="
				+ "=====KBANK========\r\n"+"1.추가\r\n"+"2.조회\r\n"+"3.입금\r\n"
	                     +"4.출금\r\n"+"5.삭제\r\n"+"9.종료\r\n"+"메뉴를 선택하세요 >>  ");
		num = scan.nextInt();
		scan.nextLine();
		if (num==9) {System.out.println("종료합니다."); break;}
		switch(num) {
			case 1 : System.out.println("추가 기능입니다.");
			
					 System.out.println("아이디를 입력하세요");
					 id = scan.nextLine();
					 
					 System.out.println("비밀번호를 입력하세요");
					 pw = scan.nextInt();
					 scan.nextLine();
					 
					 System.out.println("잔액을 입력하세요");
					 bal = scan.nextInt();
					 scan.nextLine();
				// step3
				// id _입력받기 first
				// pw _입력받기 1111
				// balance : _입력받기 10000
			    break; //end case 1
			case 2 : 
				     System.out.println("아이디를 입력하세요.");
				     temp_id = scan.nextLine();
				     
				     System.out.println("비밀번호를 입력하세요.");
				     temp_pw = scan.nextInt();
				     
				     if (  !(temp_id.equals(id)   &&  temp_pw==pw ) ) { 
				    	 System.out.println("아이디와 비밀번호를 확인해주세요!");  
				    	 break;
				     }
					 System.out.println("조회 기능입니다.");
				     System.out.println("아이디 : "+id);
				     System.out.println("비밀번호 : "+pw);
				     System.out.println("잔액  : "+bal);
				break; //end case 2			

			
			case 3 :  
				
					System.out.println("입금 기능입니다. 입금하실 금액을 입력해주세요.");
			  		 depo = scan.nextInt();
			  	     scan.nextLine();
			  		 bal += depo;
			  		 System.out.println("현재 잔액은  " + bal );
			  		 
				break; //end case 3
			case 4 : System.out.println("출금 기능입니다. 출금하실 금액을 입력해주세요.");
					 with = scan.nextInt();
					 scan.nextLine();
					 bal -= with;
					 System.out.println("현재 잔액은  " + bal);
				break; //end case 4
			case 5 : System.out.println("계좌 정보를 삭제합니다. 삭제하시겠습니까? y/n");
			         ch = scan.next().charAt(0);
			         scan.nextLine();
			         if (ch=='y') { id = null;  bal= 0; };
			         break; //end case 5
				
				     }
	
	
				     
		
			}
	      scan.close();	

		}		
}
	
	
	

