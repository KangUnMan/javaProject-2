package org.techit.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp94 {
    public static void main(String[] args) {
        //공백을 포함해서 입력하니까 먼저 값을 입력받고 배열에 넣은 다음에, 배열 길이만큼, 다시 집어넣으면 될거같음..
        Scanner sc = new Scanner(System.in);
        int randomTry = sc.nextInt(); // 출석번호를 무작위로 부르는 횟수.
        int[] student = new int[randomTry]; // 출석을 부른 횟수에 맞춰 배열길이를 설정한다.
        sc.nextLine(); // 아니.. 이걸 넣어야하네..
        String rn = sc.nextLine(); // 출석번호를 입력받을 스트링
        String[] rnArr;
        rnArr= rn.split(" "); //공백으로 구분지어 배열에 넣어준다.
        for(int i=0; i<student.length; i++){ //구분한 출석번호를 int배열에 다시넣어준다.
            if(!rnArr[i].equals("")) { // 빈 문자열이 아닌 경우에만 정수로 변환
                student[i] = Integer.parseInt(rnArr[i]);
            }
        }
        for (int i=student.length-1; i>=0; i--){
            System.out.printf("%d ",student[i]);
        }

    }
}