package org.techit.codeUp3week;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int answer = 0;
        do {
            answer=0;
            while (inputNum>0){

                answer += inputNum%10;
                inputNum = inputNum/10;
            }
            if(answer>=10&&inputNum<10){
                inputNum = answer;
            }
        } while (answer>=10);
        System.out.println(answer);
    }
}
