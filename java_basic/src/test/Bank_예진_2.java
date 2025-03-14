package test;
 
//입금/출금의 금액 누적 완료 못함. 따로 계산됨
 
// 1. bank 동영상 

import java.util.Scanner;

public class Bank_예진_2 {
	public static void main(String[] args) {
		// 변수
		int num;  char id=' ', pass=' ', delete=' '; int age, balance=0;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 입력 + 처리 + 출력
		// Step1.  메뉴판 무한반복
		/*  
		   for(;;) { 
		   	 //9번이라면 종료
		   	 //1번이라면 추가
		   	 //2,3,4,5  
		   	 //- 조회기능
		   	 //      2번일때
		   	 //      3번일때
		   	 //      4번일때
		   	 //      5번일때
		   }
		 */
		
		for(;;) {  //# 무한반복
			System.out.print("\n\n======BANK======\r\n" + "1.추가\r\n" + "2.조회\r\n" + "3.입금\r\n" 
					+ "4.출금\r\n" + "5.삭제\r\n" + "9.종료\r\n" + "입력>>>"); 
			num = scanner.nextInt();
			if(num==9) {System.out.println("종료기능입니다. ");  break;}
			else if(num==1) {
				System.out.println("추가기능입니다."); 
					//... Step3
					//	*ID :   _입력받기 first
					//	*PASS :   _입력받기 1111 
					//	*BALANCE : _입력받기 10000
					System.out.print("*ID : ");           id=scanner.next().charAt(0);
					System.out.print("*PASS : ");      	  pass=scanner.next().charAt(0);
					System.out.print("*BALANCE : "); 	  balance=scanner.nextInt();
					System.out.print("*AGE : "); 	  	  age=scanner.nextInt(); 
			}else {
				char temp_id=' ' ,temp_pass=' ';
				System.out.print("*ID : ");           temp_id=scanner.next().charAt(0);
				System.out.print("*PASS : ");         temp_pass=scanner.next().charAt(0);
				if( !(temp_id == id  &&  temp_pass == pass) ){ 
					System.out.println("정보를 확인해주세요!");
					continue;
				}		
				// Step2. 기능
				switch(num) { 
					case 2: 
						System.out.println("조회기능입니다."); 
						System.out.println("ID: " + id + "\nPASS:" + pass + "\nBALANCE:" + balance);
							
					break; // end case2
					
					case 3: System.out.println("입금기능입니다.");
						int balance1=0;    
						System.out.print("입금: " );		  balance1=scanner.nextInt();
						balance+=balance1;
						System.out.println("잔액:" + balance);
						 
					break; // end case3
					
					case 4: System.out.println("출금기능입니다.");
							int balance2=0;    
							System.out.print("출금: " ); 		  balance2=scanner.nextInt();
							System.out.println("잔액:" + (balance-=balance2)); 
					break; // end case4
					
					case 5: 
						System.out.println("삭제기능입니다."); 
						System.out.println("계좌를 삭제하시겠습니까? (Y/N) "); delete=scanner.next().charAt(0);
						if( delete=='Y' || delete=='y' ) {
							  id=' '; pass=' ';   age= balance=0;
						} 
					break; // end case5
				}
			}
		} // end for
	} // end main
}// end class

/*
Step1.  메뉴판 무한반복
for(){  //1-1무한반복
//1-2 빠져나올조건 9일때
}

Step2.
//변수
char id='x' , pass= 'x';

//입력 + 처리 + 출력
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
{
*ID :   _입력받기 first
*PASS :   _입력받기 1111 
*BALANCE : _입력받기 10000

//변수
//입력
//처리
//출력
}

Step4. 조회
{
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

}
Step5. 입금

*/