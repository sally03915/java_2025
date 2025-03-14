package test;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_Arr___hint {

	public static void main(String[] args) {
		// 변수
		int num=-1;
		char delete = ' ';
		String[]id      = new String[3];   // 
		String[]pass    = new String[3];
		int   []balance = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		for(;num!=9;) {
			System.out.println(Arrays.toString(id));   // [null, null, null]
			System.out.println(Arrays.toString(pass));
			System.out.println(Arrays.toString(balance));
			System.out.print("======BANK======\n* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
			num = scanner.nextInt();
			
			if(num==9) {System.out.println("종료");}
			else if(num==1) {
				System.out.println("입력");
				//변수 
				int find=-1;
				//입력
				//처리1 - 빈칸인지 확인
				// 만약 0번째가 null이라면 번호는 0
				// 만약 1번째가 null이라면 번호는 1
				// 만약 2번째가 null이라면 번호는 2
				for(int i=0; i<3; i++) {if(id[i]==null) {find=i;break;}}
				//처리2 - 해당칸에 입력
				id[find]=scanner.next();
				pass[find]=scanner.next();
				balance[find]=scanner.nextInt();
			}
		}

	}

}
