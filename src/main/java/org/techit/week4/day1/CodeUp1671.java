package org.techit.week4.day1;

import java.util.Scanner;

public class CodeUp1671 {

    public String winnerPlayer(int user,int computer){
        //0바위 1가위 2보
        String answer ="";
        if(user == 0 && computer == 1 ){
            answer = "win";
        }else if (user == 1 && computer == 2){
            answer = "win";
        }else if(user == 2 && computer == 0){
            answer = "win";
        }else if(user == computer){
            answer = "tie";
        }else{
            answer = "lose";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CodeUp1671 codeUp1671 = new CodeUp1671();
        int user = scanner.nextInt();
        int computer = scanner.nextInt();

        System.out.printf("%s",codeUp1671.winnerPlayer(user,computer));
    }
}
