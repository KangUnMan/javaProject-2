package org.techit.week2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2]; // 배열의 초기화
        students[0] = new Student(); // Student 클래스의 초기화
        students[0].name = "김경록"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 37;
        students[1] = new Student();
        students[1].name = "김지유";
        students[1].phoneNumber = "010-2468-1357";
        students[1].age = 2;

        System.out.printf("%s님 안녕하십니까 나이%d 전화번호 %s",students[0].name,students[0].age,students[0].phoneNumber);
    }
}