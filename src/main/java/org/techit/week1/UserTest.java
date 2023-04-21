package org.techit.week1;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김경록";
        user.phoneNumber = "010-1111-1212";
        user.age = 37;

        User jaesung = new User();
        jaesung.name = "재성 매니저님";
        jaesung.phoneNumber = "010-0000-1235";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s",user.name,user.isAdult());
    }
}
