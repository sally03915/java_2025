package test;

import java.util.Scanner;

public class Bank_v1_경미 {
	public static void main(String[] args) {
		// 변수
		int num, balance = 0, in = 0, out = 0, cash = 0;
		char id = ' ', pass = ' ', del = ' ';
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		// Step1. 메뉴판 무한반복
		for (;;) {
			System.out.print("===== BANK =====\n" +
					   "*  1. 추가\n" +
					   "*  2. 조회\n" + 
					   "*  3. 입금\n" + 
					   "*  4. 출금\n" + 
					   "*  5. 삭제\n" + 
					   "*  9. 종료\n" +
					   "입력 >>> ");
			
			num = scanner.nextInt();
			if(num == 9) {System.out.println("종료기능입니다."); break;}
			// Step2. 기능
			switch(num) {
				case 1 : System.out.println("추가기능입니다.");
					// Step3
					// *ID :   _입력받기 first
					System.out.println("id : ");
					id = scanner.next().charAt(0);
					
					// *PASS :   _입력받기 1111 
					System.out.println("password : ");
					pass = scanner.next().charAt(0);
					
					// *BALANCE : _입력받기 10000
					System.out.println("balance : ");
					balance = scanner.nextInt();
				break; // end case1
				/////////////////////////////////////////////////////
				case 2 :  case 3:  case 4: case 5:  
					char temp_id = ' ', temp_pass = ' '; 
					System.out.println("id : ");
					temp_id = scanner.next().charAt(0);
					
					System.out.println("password : ");
					temp_pass = scanner.next().charAt(0); 
					if (  !(id == temp_id && pass == temp_pass) )   {
						System.out.println("정보를 확인해주세요!");
						break;
					}
					
					if(num==2) {
						System.out.println("조회기능입니다.");
						System.out.println("id : " + id + "\npass : " + pass + "\nbalance : " + balance);
						System.out.println("== 계좌 조회");
						System.out.println("balance : " + balance); 
					}else if(num==3) {
						System.out.println("입금기능입니다."); 
						System.out.println("id : " + id + "\npass : " + pass + "\nbalance : " + balance);
						System.out.println("입금 : ");
						in += scanner.nextInt();
						System.out.println("== 입금");
						System.out.println("balance : " + balance);
						System.out.println("잔액 : " + (int) (cash + in));
					}else if(num==4) {
						System.out.println("출금기능입니다.");
						System.out.println("id : " + id + "\npass : " + pass + "\nbalance : " + balance);
						System.out.println("출금 : ");
						out -= scanner.nextInt();
						System.out.println("== 출금");
						System.out.println("balance : " + balance);
						System.out.println("잔액 : " + cash);
					}else if(num==5) {
						System.out.println("삭제기능입니다.");
						System.out.println("id : " + id + "\npass : " + pass + "\nbalance : " + balance);
						System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
						del = scanner.next().charAt(0);
						if (del == 'y' || del == 'Y') { 
							id = ' '; pass = ' ';   balance = 0;
						}  
					} 
				break;  
			} 
			/////////////////////////////////////////////////////
		}
	}
}
/*
Step1.  메뉴판 무한반복
for(){  //1-1무한반복
  //1-2 빠져나올조건 9일때
}

Step2. 
for(){  
  
  // 해당번호 입력
  // 번호가 if  or  switch 
  1을 입력하면 추가기능입니다. 출력구문까지만
  2를 입력하면 조회기능입니다. 출력구문까지만
  3을 입력하면 추가기능입니다. 출력구문까지만
  4를 입력하면 조회기능입니다. 출력구문까지만
  5를 입력하면 삭제기능입니다. 출력구문까지만
}
....................................

Step3. 추가
Step4. 조회
Step5. 입금

Step3. 추가

*ID :   _입력받기 first
*PASS :   _입력받기 1111 
*BALANCE : _입력받기 10000


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