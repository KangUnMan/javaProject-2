package org.techit.week4.day4;

import java.util.*;

public class ListUser {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("김미미","010-1234-45567",37);
        userList.add(user1);
        User user2 = new User("나나가","010-124-45567",12);
        userList.add(user2);

        for(User user: userList){
            System.out.printf("%s, %s",user.getName(), user.phoneNumber);
        }
    }
}
