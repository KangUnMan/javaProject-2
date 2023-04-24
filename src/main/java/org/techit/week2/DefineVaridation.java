package org.techit.week2;

public class DefineVaridation {
    int num = 10; //num이라는 변수에 10을 넣어 초기화해라.
    String name = "김경록"; //stirng 네임 문자열에 김경록을 넣어 초기화를해라 // primitive 타입을 쓰듯이 초기화?
    //원래는 이렇게쓴다
    String name2 = new String("강운영");

    public static void main(String[] args) {
        String sOne = "1";
        int iOne = 1;
        float fOne = 1.0f;
        System.out.printf("String:%s Number:%d Float:%f", sOne, iOne, fOne);
    }


}
