package test; 
import java.util.Scanner;
// valueOf 메소드는 boolean, char, int  같은 다양한 타입의 값을 문자열로 변환해주는 메소드
// parseInt()의 기능은 String타입의 숫자를 int타입으로 변환해주는 녀석
// parseInt()는 인티저 클래스의 static 함수
///////////////  Wrapper - Test 참고
// 기존 입력받은 회원정보를 저장하는 id, pw, age, money 변수 삭제
// bank6인가 5에 클래스 명이랑 중복되서 뒤에 1붙임
// bank6는 각 기능에 따라 클래스를 따로 만든 후 메소드 호출방식으로 함 
// 상속으로 할려 했지만 헷갈려서 koreaAir프로젝트 때 하던 것처럼 함
///////////////   
// main에서 id[] 배열을 만든 후, 그 배열을 join(id)로 넘겨주면,
// join 메소드에서는 넘겨받은 id[] 배열을 그대로 사용해서 아이디를 출력하거나 처리할 수 있습니다.
// 그래서 join 메소드의 매개변수 id는 main에서 넘겨준 id[] 배열의 값을 그대로 받게 됩니다.
// 매개변수를 사용하지 않고 같은 동작을 구현하려면, 메소드 내에서 데이터를 직접 생성하거나 전역 변수를 사용해야 합니다.
///////////////  
// 공부할 거 동적배열, dto ? 개념, 컨트롤파트 예시문제들
// sc.close 안해서 거슬리던 경고창 뜬거였음

// 회원가입 클래스
class MemberJoin1 { //얘 자주쓸꺼임 2차원 배열로 바꿔 원래 저장하던 id,pw 변수들 삭제함 이제부터 입력받고 바로 저장할 수 있음
    public void join(String[][] userData) { // 2차원 배열을 사용 층에는 유저정보, 칸에는 id,pw등을 담아서 매개변수가 저거 뿐임
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디 입력 : ");
        String newId = sc.next();
        System.out.println("비밀번호 입력 : ");
        String newPw = sc.next();
        System.out.println("나이 입력 : ");
        int newAge = sc.nextInt();
        System.out.println("잔액 입력 : ");
        int newMoney = sc.nextInt();

        // 1. 빈 자리에 새로운 계좌 정보를 추가 (기능1)
        // 2. 입력받기
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] == null) { //유저데이터[순서 그냥 인덱스번호],[id]가 null(비어있다면)
                userData[i][0] = newId;
                userData[i][1] = newPw;
                userData[i][2] = String.valueOf(newAge);
                userData[i][3] = String.valueOf(newMoney);
                System.out.println("회원가입이 완료되었습니다.");
                break;
            }
        }
        sc.close();
    } //end public void join 메소드
} //end class memberjoin1

// 로그인 기능 클래스 안쓰는거 어거지로 쓰게 만들었
class Login1 {
    public boolean login(String[][] userData, String idInput, String pwInput) {
        boolean fine = false;
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                fine = true;
                break;
            }
        }
        return fine;
    } //end login 메소드
} //end login1 class

// 계좌 조회 클래스
class AccountView1 {
    public void view(String[][] userData, String idInput, String pwInput) {
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                System.out.println("계좌 조회");
                System.out.println("아이디 : " + userData[i][0]);
                System.out.println("비밀번호 : " + userData[i][1]);
                System.out.println("나이 : " + userData[i][2]);
                System.out.println("잔액 : " + userData[i][3]);
                break;
            }
        }
    } //end view 메소드
} //end AccountView1 class

// 입금 클래스
class Deposit1 {
    public void deposit(String[][] userData, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                System.out.println("입금할 금액 : ");
                int plus = sc.nextInt();
                int currentMoney = Integer.parseInt(userData[i][3]);
                currentMoney += plus; // 입금 처리
                userData[i][3] = String.valueOf(currentMoney);
                System.out.println("입금 완료! 현재 잔액 : " + userData[i][3]);
                break;
            }
        }
        sc.close();
    } //end 메소드
} //end class

// 출금 클래스
class Withdraw1 {
    public void withdraw(String[][] userData, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                System.out.println("출금할 금액 : ");
                int minus = sc.nextInt();
                int currentMoney = Integer.parseInt(userData[i][3]);
                if (minus <= currentMoney) {
                    currentMoney -= minus;
                    userData[i][3] = String.valueOf(currentMoney);
                    System.out.println("출금 완료! 현재 잔액: " + userData[i][3]);
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
                break;
            }
        }
        sc.close();
    } //end 메소드
} //end class

// 계좌 삭제 클래스
class AccountDelete1 {
    public void delete(String[][] userData, String idInput, String pwInput) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < userData.length; i++) {
            if (userData[i][0] != null && userData[i][0].equals(idInput) && userData[i][1].equals(pwInput)) {
                System.out.println("계좌를 삭제하시겠습니까? (Y / N)");
                String YN = sc.next();
                if (YN.equals("y") || YN.equals("Y")) {
                    userData[i][0] = null;
                    userData[i][1] = null;
                    userData[i][2] = null;
                    userData[i][3] = null;
                    System.out.println("계좌가 삭제되었습니다.");
                }
                break;
            }
        }
        sc.close();
    } //end 메소드
} //end class

// 은행 psvm 클래스
public class Bank_KG {  // 여기서 클래스 이름을 Bank7로 변경
    public static void main(String[] args) {

        // 2차원 배열로 사용자 정보 저장 (3명의 사용자, 각 사용자마다 4개의 정보)
        String[][] userData = new String[3][4]; // 3명의 사용자, 각 사용자에 대해 4개의 정보 (아이디, 비밀번호, 나이, 잔액)
        boolean fine = false; // 로그인 성공 여부 확인

        Scanner sc = new Scanner(System.in);
        String idInput = "";
        String pwInput = "";

        // 각 기능에 해당하는 클래스들 호출할꺼임 헷갈리니까 호출명은 클래스명과 동일
        MemberJoin1 memberJoin1 = new MemberJoin1();
        Login1 login1 = new Login1();
        AccountView1 accountView1 = new AccountView1();
        Deposit1 deposit1 = new Deposit1();
        Withdraw1 withdraw1 = new Withdraw1();
        AccountDelete1 accountDelete1 = new AccountDelete1();

        while (true) { // 기본으로 은행서비스 선택하는 창과 입력값 무한반복
            System.out.println("======BANK======");
            System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

            int input = sc.nextInt(); // 은행서비스를 뭐 쓸꺼냐?

            // 로그인 기능
            if (input == 2 || input == 3 || input == 4 || input == 5) { 
                // 아이디와 비밀번호 입력 받기
                System.out.println("아이디 입력 : ");
                idInput = sc.next();
                System.out.println("비밀번호 입력 : ");
                pwInput = sc.next();

                fine = login1.login(userData, idInput, pwInput); //추가
                if (!fine) {
                    System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
                    continue; // 로그인 실패 시 다시 메뉴로 돌아감
                }
            }

            switch (input) {
                case 1: // 추가: 아이디, 비밀번호, 나이, 잔액 입력
                    memberJoin1.join(userData); //스캐너로 입력받고 메소드 매개변수에 넣음 그리고 메소드 안에 있는 for문으로 인덱스 번호 붙여줌
                    break;

                case 2: // 조회
                    if (fine) {
                        accountView1.view(userData, idInput, pwInput);
                    }
                    break;

                case 3: // 입금
                    if (fine) {
                        deposit1.deposit(userData, idInput, pwInput);
                    }
                    break;

                case 4: // 출금
                    if (fine) {
                        withdraw1.withdraw(userData, idInput, pwInput);
                    }
                    break;

                case 5: // 계좌 삭제
                    if (fine) {
                        accountDelete1.delete(userData, idInput, pwInput);
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
    }//end psvm
}//END CLASS 
