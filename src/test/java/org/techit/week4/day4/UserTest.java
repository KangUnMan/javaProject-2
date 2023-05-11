package org.techit.week4.day4;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        User user = new User("KANG","010-8673-9590",24);

        System.out.printf("%s의 전화번호 %s이고 그는 성인인가? : %b",user.getName(),user.getPhoneNumber(),user.isAdult());
    }

}