package test;

import java.util.Arrays;
import java.util.Scanner;
//교수번호 (년도 - 4자리수)로 나오게 구현 아직 안함, 아이디 비번찾기 기능 구현안함, case 5: 캘린더
//02.20.13:15 아이디 비밀번호 찾기 구현완료
//02.20.14:20 교수번호 (년도-4자리) 구현완료 (구글링)
//캘린더는 날 좋을 때 시도해보겠습니다!

public class YR_University4 {
    public static void main(String[] args) {
        //--------교수---------  
        String[] Tnum = new String[3]; // 교수 번호
        String[] name = new String[3]; // 교수 이름
        String[] id = new String[3]; // 교수 아이디
        String[] pw = new String[3]; // 교수 비밀번호
        String[] major = new String[3]; // 소속학과
        String[] subject = new String[3]; // 교과목

        //--------학생---------  
        int[] number = new int[3];// 학번
        String[] stuname = new String[3]; // 학생 이름
        String[] marjor2 = new String[3]; // 학생 전공
        int[] maj1 = new int[3]; // 전공1
        int[] maj2 = new int[3]; // 전공2
        int[] maj3 = new int[3]; // 전공3
        String[] oort = new String[3]; // 학기
        int[] aver = new int[3]; // 평균
        String[] gr = new String[3]; // 학점

        //--------입력---------  
        String inputid = ""; // 입력받을 아디  
        String inputpw = ""; // 입력받을 비번  
        int inputN = 0; // 학번 입력  
        String inputstun = ""; // 학생 이름  

        Scanner sc = new Scanner(System.in);

        while (true) { // 무한 반복  
        	System.out.println(Arrays.toString(Tnum));
        	System.out.println(Arrays.toString(number));
        	
            System.out.println("==============================");  
            System.out.println("      YR University 관리자");  
            System.out.println("------------------------------");  
            System.out.println("1> 교수등록\n2> 교수로그인\n3> 종합정보시스템 \n9> 종료");  
            System.out.println("==============================");

            int input = sc.nextInt();

            switch (input) {
                case 1: // 교수 등록  
                    System.out.println("교수 번호 입력 : ");  // 교수번호  
                    String newTnum = sc.next();  
                    
                    while (!newTnum.matches("\\d{2}-\\d{4}")) {
                        System.out.println("올바른 교수 번호 형식이 아닙니다. 다시 입력해주세요 (예: 21-1234): ");
                        newTnum = sc.next();
                    }
                    
                    System.out.println("이름 입력 : ");  
                    String newname = sc.next();  
                    System.out.println("id 입력 : ");  
                    String newid = sc.next();  
                    System.out.println("pw 입력 : ");  
                    String newpw = sc.next();  
                    System.out.println("소속학과 입력 : ");  
                    String newmajor = sc.next();  
                    System.out.println("교과목 입력 : ");  
                    String newsubject = sc.next();  

                    for (int i = 0; i < 3; i++) {
                        if (id[i] == null) {
                            Tnum[i] = newTnum;
                            name[i] = newname;
                            id[i] = newid;
                            pw[i] = newpw;
                            major[i] = newmajor;
                            subject[i] = newsubject;
                            break; // 첫 번째 빈 자리에 등록하고 종료
                        }
                    }
                    break;

                case 2: // 로그인  
                    System.out.println("::::: 교수 로그인 :::::");  
                    System.out.println("id : "); // 아디 비번 입력받기 (로그인)  
                    inputid = sc.next();  
                    System.out.println("pw : ");  
                    inputpw = sc.next();

                    boolean loginSuccess = false; // 로그인 성공 여부를 추적할 변수  
                    for (int i = 0; i < 3; i++) {
                        if (id[i] != null && id[i].equals(inputid) && pw[i].equals(inputpw)) {
                            System.out.printf("◆◆◆◆ 환영합니다 %s 교수님 ◆◆◆◆ \n", name[i]);
                            loginSuccess = true;
                            break; // 로그인 성공 시 반복문 종료  
                        }
                    }

                    if (!loginSuccess) {
                        System.out.println("아이디 또는 비밀번호가 틀립니다. 다시 시도해 주세요.");
                        System.out.println("아이디와 비밀번호를 찾으시겠습니까? Y/N\n");
                        String input2 = sc.next();
                        if(input2.equals("Y") || input2.equals("y")) {
                           for(int i=0;i<3; i++) {
                           System.out.println("교수 번호 > ");
                           String professorId = sc.next();
                           System.out.println("이름 > ");
                           String professorName = sc.next();
                           System.out.println("소속학과 > ");
                           String department = sc.next();
                           
                           if(professorId.equals(Tnum[i]) && professorName.equals(name[i]) && department.equals(major[i])) {
                              System.out.println("-----조회결과-----");
                              System.out.printf("아이디: %s \n비밀번호: %s \n", id[i],pw[i]);
                              break;
                           }
                           else {
                              System.out.println("입력된 정보가 일치하지 않습니다. 다시 시도해 주세요.");
                              break;
                           }
                        
                        }
                        }
                        else if(input2.equals("N") || input2.equals("n")) {
                           break;
                        }
                        else {
                           System.out.println("올바른 값을 입력하세요");
                           break;
                        }
                    }
                    break;

                case 3: // 종합정보시스템  
                    for (int i = 0; i < 3; i++) {
                        if (inputid.equals(id[i]) && inputpw.equals(pw[i])) {
                            System.out.println("==============================");
                            System.out.println("1> 성적등록\n2> 전체성적조회\n3> 성적수정\n4> 삭제\n5> 학사일정 \n9> 관리시스템 종료");
                            System.out.println("==============================");

                            int input2 = sc.nextInt();

                            switch (input2) {
                                case 1: // 성적등록
                                    System.out.println("::::::: 학생 성적등록 ::::::");
                                    for (int j = 0; j < 3; j++) {
                                        if (number[j] == 0) { // 학번이 0인 자리만 채움  
                                            System.out.println("학 번  > ");
                                            number[j] = sc.nextInt();

                                            System.out.println("학생이름  > ");
                                            stuname[j] = sc.next();

                                            System.out.println("전공  > ");
                                            marjor2[j] = sc.next();

                                            System.out.println("컴퓨터이해1  > ");
                                            maj1[j] = sc.nextInt();

                                            System.out.println("컴퓨터이해2  > ");
                                            maj2[j] = sc.nextInt();

                                            System.out.println("컴퓨터이해3  > ");
                                            maj3[j] = sc.nextInt();

                                            System.out.println("(1학기 / 2학기)  > ");
                                            oort[j] = sc.next();

                                            aver[j] = (maj1[j] + maj2[j] + maj3[j]) / 3; // 평균 계산

                                            if (aver[j] >= 90) {
                                                gr[j] = "A학점";
                                            } else if (aver[j] >= 80) {
                                                gr[j] = "B학점";
                                            } else if (aver[j] >= 70) {
                                                gr[j] = "C학점";
                                            } else if (aver[j] >= 60) {
                                                gr[j] = "D학점";
                                            } else {
                                                gr[j] = "F학점";
                                            }

                                            break; // 첫 번째 비어있는 자리에 등록 후 종료
                                        }
                                    }
                                    break;

                                case 2: // 전체성적조회
                                    System.out.println("=============================전체 성적조회===============================");
                                    System.out.println("학번 이름 전공 컴퓨터이해A 컴퓨터이해B 컴퓨터이해C 총점 평균 학점 학기 졸업여부 석차");
                                    System.out.println("======================================================================");

                                    for (int j = 0; j < 3; j++) {
                                        if (number[j] != 0 && stuname[j] != null && marjor2[j] != null) {
                                            int totalScore = maj1[j] + maj2[j] + maj3[j];
                                            String grade = gr[j];
                                            String semester = oort[j];
                                            System.out.printf("%d   %s  %s    %d     %d    %d     %d  %d  %s  %s  졸업예정  석차정보\n", 
                                                    number[j], stuname[j], marjor2[j], maj1[j], maj2[j], maj3[j],
                                                    totalScore, (totalScore) / 3, grade, semester);
                                        }
                                    }
                                    break;

                                case 3: // 성적수정
                                    System.out.println(":::::성적수정:::::");
                                    System.out.println("학번 >");
                                    inputN = sc.nextInt();
                                    System.out.println("학생이름 >");
                                    inputstun = sc.next();

                                    boolean found = false;
                                    for (int j = 0; j < 3; j++) {
                                        if (inputN == number[j] && inputstun.equals(stuname[j])) {
                                            System.out.println("◆◆◆조회결과◆◆◆");
                                            System.out.printf("%d %s %s \n", number[j], stuname[j], marjor2[j]);
                                            System.out.println("학생 정보를 수정하시겠습니까? (Y / N)");
                                            String YN = sc.next();
                                            if (YN.equals("y") || YN.equals("Y")) {
                                                System.out.println("컴퓨터이해A > ");
                                                maj1[j] = sc.nextInt();
                                                System.out.println("컴퓨터이해B > ");
                                                maj2[j] = sc.nextInt();
                                                System.out.println("컴퓨터이해C > ");
                                                maj3[j] = sc.nextInt();
                                                System.out.println("(1학기 / 2학기) ");
                                                oort[j] = sc.next();

                                                int total = maj1[j] + maj2[j] + maj3[j];
                                                aver[j] = total / 3; // 평균 다시 계산

                                                if (aver[j] >= 90) {
                                                    gr[j] = "A학점";
                                                } else if (aver[j] >= 80) {
                                                    gr[j] = "B학점";
                                                } else if (aver[j] >= 70) {
                                                    gr[j] = "C학점";
                                                } else if (aver[j] >= 60) {
                                                    gr[j] = "D학점";
                                                } else {
                                                    gr[j] = "F학점";
                                                }
                                                System.out.println("성적 수정완료!!!!!!!");
                                            }
                                            found = true;
                                            break; // 수정한 후 종료
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("해당 학번과 이름을 찾을 수 없습니다.");
                                    }
                                    break;

                                case 4: // 삭제
                                    System.out.println(":::::학생정보 삭제:::::");
                                    System.out.println("학번 >");
                                    inputN = sc.nextInt();
                                    System.out.println("학생이름 >");
                                    inputstun = sc.next();

                                    found = false;
                                    for (int j = 0; j < 3; j++) {
                                        if (inputN == number[j] && inputstun.equals(stuname[j])) {
                                            System.out.println("◆◆◆조회결과◆◆◆");
                                            System.out.printf("%d %s %s \n", number[j], stuname[j], marjor2[j]);
                                            System.out.println("학생 정보를 삭제하시겠습니까? (Y / N)");
                                            String YN = sc.next();
                                            if (YN.equals("y") || YN.equals("Y")) {
                                                number[j] = 0;
                                                marjor2[j] = null;
                                                maj1[j] = 0;
                                                maj2[j] = 0;
                                                maj3[j] = 0;
                                                oort[j] = null;
                                                aver[j] = 0;
                                                gr[j] = null;
                                                System.out.println("학생 정보 삭제 완료!");
                                            }
                                            found = true;
                                            break; // 삭제 후 종료
                                        }
                                    }
                                    if (!found) {
                                        System.out.println("해당 학번과 이름을 찾을 수 없습니다.");
                                    }
                                    break;

                                case 9: // 관리시스템 종료
                                    System.out.println("프로그램을 종료합니다.");
                                    return;

                                default: // 입력값 이상하면
                                    System.out.println("제대로 된 입력값을 넣으세요.");
                            }
                        }
                    }
                    break;
                case 5: //학사일정
                   
                
                case 9: // 관리자 시스템 종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default: // 입력값 이상하면
                    System.out.println("제대로 된 입력값을 넣으세요.");
            }// end switch
        }// end while
    }// end main
}// end class


//1. bank        -  처리화면 콘솔창출력(동영상)  - youtube 올리기  - 링크
//2. university  -  처리화면 콘솔창출력(동영상)  - youtube 올리기  - 링크  