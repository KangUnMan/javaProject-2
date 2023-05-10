package org.techit.week4.day3;

public class practice {
    public static void main(String[] args) {
        int height = 7;
        int pivet = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= pivet) {
                for (int j = 0; j <= pivet - i; j++) { // 3 2 1 0 으로 공백출력 pivet의 값과 동일함
                    System.out.printf("0");
                }
                for (int j = 0; j < 2 * i + 1; j++) { // 1 3 5 7 로 출력
                    System.out.printf("*");
                }
            } else {
                for (int j = 0; j < i - (pivet-1); j++) { // 공백의 개수가 1, 2, 3 으로 점차 증가
                    System.out.printf("0");
                }
                for (int j = 0; j < 2 * (height - i) - 1; j++) //5 3 1  ( 3 *2 -1 = 5)
                {
                    System.out.printf("*");
                }
            }
            System.out.println();


        }
    }
}



