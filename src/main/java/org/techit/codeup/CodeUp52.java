package org.techit.codeup;

import java.util.Scanner;

public class CodeUp52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 객체 생성

        String calNumStr = scan.nextLine(); // 입력받을 String 형 변수 생성후 스캐너로 입력 받은 값 대입

        String[] calNumStrArr = calNumStr.split(" "); // 공백으로 구분하여 배열에 넣기.

        //조건 a는 0보다 같거나 크고 b는 0이아니다.
        int[] calNumArr = new int[calNumStrArr.length]; //b가 음수를 입력했을 경우 체크하여 바꿔준다.
        for (int i = 0; i < calNumStrArr.length; i++) {
            if (calNumStrArr[i].substring(0) == "-") {
                calNumArr[i] = Integer.parseInt(calNumStrArr[i]);
                calNumArr[i] = -calNumArr[i];
            } else {
                calNumArr[i] = Integer.parseInt(calNumStrArr[i]);
            }
        }
        boolean comNum = calNumArr[0]!=calNumArr[1]; // 여기서 비교하고 printf에서 트루면 1 아닐시 0을 출력하게 만듬
        System.out.printf("%d\n", comNum ? 1 : 0); // printf에서도 삼항연산자 사용가능

    }
}