package org.techit.week4.day1;

import java.util.Scanner;
import java.util.Random;

public class repeatRPC {

    public boolean winnerPlayer(int user,int computer){
        //0바위 1가위 2보
        boolean answer;
        if(user == 0 && computer == 1 ){
            answer = true;
        }else if (user == 1 && computer == 2){
            answer = true;
        }else if(user == 2 && computer == 0){
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }


    public static void main(String[] args) {

        repeatRPC rock = new repeatRPC();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int player = 0;
        String rps;
        int computer =0;
        do {
            System.out.println("가위 바위 보 게임을 시작하겠습니다. 이길때까지 반복합니다.");
            rps = sc.nextLine();
            switch (rps){
                case "바위"-> player = 0;
                case "가위"-> player = 1;
                case "보"-> player = 2;
            }
            computer = random.nextInt(3);
            if(rock.winnerPlayer(player,computer)){
                System.out.printf("승리하였습니다.\n",player,computer);
            }else{
                System.out.printf("승리하지못했습니다.\n",player,computer);
            }
        }while (!rock.winnerPlayer(player,computer));


    }
}
