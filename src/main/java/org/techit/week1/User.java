package org.techit.week1;

public class User {
    //이름 , 전화번호 , 나이
    String name;
    String phoneNumber;
    int age;

    boolean isAdult(){
        return  age >= 18; //멤버변수와 상호작용
    }
}
