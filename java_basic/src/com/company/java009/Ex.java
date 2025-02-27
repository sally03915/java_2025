package com.company.java009;
 

import java.util.Arrays;

public class Ex {
    public static void upper(char[] ch) {
        for (int i = 0; i < ch.length; i++) { //배열 돌리고
            ch[i] = Character.toUpperCase(ch[i]); //배열안 값 대문자 바꾸고
        }
        System.out.println("메서드. 배열값 : " + Arrays.toString(ch)); //배열값 출력하고
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c'};
        System.out.println("main. 배열값 : " + Arrays.toString(ch)); //원본값 그대로
        upper(ch); //메서드 호출해주고
        System.out.println("main. 배열값 : " + Arrays.toString(ch)); 
        //원본 값 바뀜 얘 call by reference 그거때매 원본값 바뀐 줄 알았는데 
    }   //그냥 배열이 참조형 타입의 경우, 참조값(메모리 주소)이 전달되는거라서 그렇게 보인거라고?
} //c나 다른언어면 몰라도 java에서는 콜 바이 레퍼런스 개념이 없다 그렇게 보인다는거지 라고 하네요?

// 자바에서의 파라미터는 call by value로서만 동작되며(창시자가 그렇다면 그런거지), 원시값이 복사 되느냐 주소값이 복사되느냐 차이가 있을뿐이다.
// 뭐 어찌저찌 call by reference 개념은 알 거 같음
// java : "전달한게 참조주소 값인데, 주소 '값'도 사실 value니까 call by value야"
// 결론은 call by reference처럼 보임 다른 언어면 아마 저 개념 맞을꺼임 근데 자바 창시자가 call by value만 쓴다고 하니 그냥 그러러니 하고 넘어가기
// From the authors of Java: "There is exactly one parameter passing mode in Java - pass by value - and that helps keep things simple." The Java Programming Language, 2nd ed. by Ken Arnold and James Gosling, section 2.6.1, page 40, 3rd paragraph.