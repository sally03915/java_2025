package test;
import java.util.Arrays;
import java.util.Scanner;
//수정할 거 private를 배열 3명잡고 만들기 메인 안으로 넣기` > 완료
//메소드 말고 제어문으로 중복코드 삭제 > if문 사용 만약 input값이 2 or 3 or 4 or 5라면 아디입력 비번입력 나오게하고 
//아디 비번 맞는지 확인은 case 2 3 4 5 안에서 하면 됨 완료!!!
//if(fine)로 로그인 성공시 다음 과정 나오게 그 외는 아디비번 잘못됨으로 나오게
//내가 부족한 점 : 출력문대로 만들라면 만들 수 있으나 여태 코드리뷰하고 메모리관리나 중복된 코드 제거 등 코드 수정을 한 적이 손에 꼽을 정도록 적음.

public class Bank4 {
    public static void main(String[] args) {

        String[] id = new String[3]; // 사용자 id 배열 3칸 선언
        String[] pw = new String[3]; // 사용자 비번 배열 3칸 선언
        int[] age = new int[3]; // 사용자 나이 배열 3칸 선언
        int[] money = new int[3]; // 사용자 잔액 배열 3칸 선언  // Arraylist (#) / HashSet / HashMap
        boolean fine = false; // 로그인 성공 여부 확인

        Scanner sc = new Scanner(System.in);
        String idInput = "";
        String pwInput = "";

        while (true) { // 기본으로 은행서비스 선택하는 창과 입력값 무한반복
        	System.out.println(Arrays.toString(id));
        	System.out.println(Arrays.toString(pw));
        	
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); // 은행서비스를 뭐 쓸꺼냐?

            
            if (input == 2 || input == 3 || input == 4 || input == 5) { // 2, 3, 4, 5일 경우 먼저 아이디와 비밀번호 입력받기
                System.out.println("아이디 입력 : "); // 로그인
                idInput = sc.next();
                System.out.println("비밀번호 입력 : ");
                pwInput = sc.next();

                fine = false; 
                
                for (int i = 0; i < 3; i++) { //if문에 중복된 내용 삭제하기 위해 추가한 내용 아디비번 맞는지 확인
                    if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                        fine = true; 
                        break;
                    }
                }
                if (!fine) {
                    System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    continue; // 로그인 실패 시 다시 메뉴로 돌아감 break쓰니까 안됨
                }
            }

            switch (input) {
                case 1: // 추가: 아이디, 비밀번호, 나이, 잔액 입력
                    System.out.println("아이디 입력 : ");
                    String newId = sc.next();
                    System.out.println("비밀번호 입력 : ");
                    String newPw = sc.next();
                    System.out.println("나이 입력 : ");
                    int newAge = sc.nextInt();
                    System.out.println("잔액 입력 : ");
                    int newMoney = sc.nextInt();

                    for (int i = 0; i < 3; i++) {
                        if (id[i] == null) {
                            id[i] = newId;
                            pw[i] = newPw;
                            age[i] = newAge;
                            money[i] = newMoney;
                            break;
                        }
                    }
                    break;

                case 2: // 조회
                    if (fine) { // 로그인 성공 시에만 조회 가능
                        for (int i = 0; i < 3; i++) { //올바른 인덱스[]안에 값 찾아야하니까 이거 빼면 큰일남 빼서 계속 안돌아갔음
                            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) { //id[i]가 빈값 x id.[i]가 id인풋이랑 같고 비번도 같을시
                                System.out.println("계좌 조회");
                                System.out.println("아이디 : " + id[i]);
                                System.out.println("비밀번호 : " + pw[i]);
                                System.out.println("나이 : " + age[i]);
                                System.out.println("잔액 : " + money[i]);
                                break;
                            }
                        }
                    } else {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 3: // 입금
                    if (fine) { // 로그인 성공 시에만 입금 가ㅇ능
                        for (int i = 0; i < 3; i++) {
                            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                                System.out.println("입금할 금액 : ");
                                int plus = sc.nextInt();
                                money[i] += plus; // 입금 처리
                                System.out.println("입금 완료! 현재 잔액 : " + money[i]);
                                break;
                            }
                        }
                    } else {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 4: // 출금
                    if (fine) { // 로그인 성공 시에만 출금 가능
                        for (int i = 0; i < 3; i++) {
                            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                                System.out.println("출금할 금액 : ");
                                int minus = sc.nextInt();
                                if (minus <= money[i]) {
                                    money[i] -= minus;
                                    System.out.println("출금 완료! 현재 잔액: " + money[i]);
                                } else {
                                    System.out.println("잔액이 부족합니다.");
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 5: // 계좌 삭제
                    if (fine) { // 로그인 성공 시에만 계좌 삭제 가능
                        for (int i = 0; i < 3; i++) {
                            if (id[i] != null && id[i].equals(idInput) && pw[i].equals(pwInput)) {
                                System.out.println("계좌를 삭제하시겠습니까? (Y / N)");
                                String YN = sc.next();
                                if (YN.equals("y") || YN.equals("Y")) {
                                    id[i] = null;
                                    pw[i] = null;
                                    age[i] = 0;
                                    money[i] = 0;
                                    System.out.println("계좌가 삭제되었습니다.");
                                }
                                break;
                            }
                        }
                    } else {
                        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    }
                    break;

                case 9: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return; 

                default: //입력값 잘못
                    System.out.println("제대로 된 입력값을 넣으세요.");
            }
        }
    }
}
