package test;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_지윤 {
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
				int find = -1;
				
				//기능1-빈칸찾기 if(id[0] == null){find=0;}
				for(int i = 0; i < id.length; i++) {
					if(id[i] == null){find=i;break;}
				}
				if(find==-1) {System.out.println("자리없음");continue;}
				//기능2-입력받기
				id[find]=scanner.next();
				pass[find]=scanner.next();
				balance[find]=scanner.nextInt();
			}else {
				// 기능1 - 유저인증
				// 사용자에게 임시아이디 임시비번 입력받기
				// 임시아이디와 id[0] 비교  임시비번과 pass[0] 비교 맞으면 찾았다
				String temp_id="", temp_pass = ""; int find = -1;
				System.out.println("아이디 입력 : ");
				temp_id = scanner.next();
				System.out.println("비번 입력 : ");
				temp_pass = scanner.next();
				for(int i = 0; i < id.length; i++) {
				if(id[i] != null && temp_id.equals(id[i]) && temp_pass.equals(pass[i])) { find = i; break; }}
				
				// 기능2 - 각각의 번호 기능
				System.out.println(find);
			}
		}
		
	}
}
