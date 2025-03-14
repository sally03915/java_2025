package test; 

import java.util.Scanner;

public class Bank_재원 {
	public static void main(String[] args) {
			//변수
			int num; char id =' ',  pass=' '; int balance= 0;
			
			Scanner sc = new  Scanner(System.in);
			// 입력 + 입력 + 처리 + 출력
			// Step1. 메뉴판 무한반복
			for(;;) { System.out.println("\n\n=====BANK=====\r\n" + "1.추가\r\n" + "2.조회\r\n" + "3.입금\r\n"
			+"4.출금\r\n" + "5.삭제\r\n"+ "9.종료\r\n" + "입력>>>");
			num= sc.nextInt();
			if(num==9) {System.out.println("종료기능"); break;}
			// Step2.기능
			switch(num) {
				case 1: System.out.println("추가기능");
					// 변수 입력 처리 출력
					System.out.print("ID:"); id=sc.next().charAt(0);
					System.out.print("PASS:"); pass=sc.next().charAt(0);
					System.out.print("BALANCE:"); balance=sc.nextInt();
					//  *ID :   _입력받기 first
					//  *PASS :   _입력받기 1111 
					//  *BALANCE : _입력받기 10000
				break; // end case1
				
				case 2: case 3: case 4: case 5: 
					char temp_id=' ' ,temp_pass= ' '; 
					System.out.print("ID:"); temp_id=sc.next().charAt(0);
					System.out.print("PASS:"); temp_pass=sc.next().charAt(0); 
					if(!(temp_id==id && temp_pass==pass)){System.out.println("정보를 확인해주세요"); break;}
					
					if(num==2) { 
						System.out.println("조회기능");
						System.out.println("ID:" + id + "\nPASS:" + pass + "\nBALANCE:" + balance );
					}else if(num==3) {
						System.out.println("입금기능");
						int add=0;
						System.out.print("입금 금액: "); add=sc.nextInt();
						balance = balance + add;
						System.out.println("==입금완료" + "\n" + balance);
					}else if(num==4) {
						System.out.println("출금기능");
				        System.out.print("출금 금액: "); 
				        int sub = 0;
				        sub = sc.nextInt();	        
				        balance -= sub;
				        System.out.println("== 출금 완료 ==" + "\n현재 잔액: " + balance);
					}else if(num==5) {
						System.out.println("삭제기능");
				    	System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
				    	char delete = sc.next().charAt(0);
				    	if(delete == 'y') {
				    		id = ' ';
				    		pass = ' ';
				    		balance = 0;
				    		System.out.println("계좌가 정상 삭제되었습니다");
				    	}
					} 
				break; // end case2
				 
			}
		}
	}
}
/* 
Step3. 추가

//  *ID :   _입력받기 first
//  *PASS :   _입력받기 1111 
//  *BALANCE : _입력받기 10000

변수
입력
처리
출력


Step4. 조회

*ID : first
*PASS : 1234
조회가 실패했습니다. 

*ID : first
*PASS : 1111
======조회결과======
아이디 : first 
잔액 : 10000
암호 : 1111
조회가 성공했습니다. 
 */