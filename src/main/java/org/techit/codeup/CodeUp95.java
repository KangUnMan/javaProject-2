package org.techit.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomTry = sc.nextInt(); // 출석번호를 무작위로 부르는 횟수.
        int[] student = new int[randomTry]; // 출석을 부른 횟수에 맞춰 배열길이를 설정한다.
        int minValue = Integer.MAX_VALUE; // 최소값이기때문에 일단 int 형에서 제일 높은값
        sc.nextLine(); // 안 넣을시 오류가 난다.
        String rn = sc.nextLine();
        String[] rnArr;
        rnArr= rn.split(" "); //공백으로 구분지어 배열에 넣어준다.
        for(int i=0; i<student.length; i++){ //배열에 숫자 넣는 부분
            if(!rnArr[i].equals("")) {
                student[i] = Integer.parseInt(rnArr[i]);
            }
        }
        for (int i= 0; i<student.length; i++){ //최소값 찾기
            if(minValue>student[i]){
                minValue = student[i];
            }
        }
        System.out.printf("%d",minValue);
    }
}
