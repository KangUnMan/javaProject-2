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

        int player;
        int computer;
        do {
            System.out.println("가위 바위 보 게임을 시작하겠습니다. 이길때까지 반복합니다. 0 바위 1 가위 2보");
            player = sc.nextInt();
            computer = random.nextInt(3);
            if(rock.winnerPlayer(player,computer)){
                System.out.printf("승리하였습니다. 플레이어 :%d 컴퓨터: %d\n",player,computer);
            }else{
                System.out.printf("승리하지못했습니다. 플레이어 :%d 컴퓨터: %d\n",player,computer);
            }
        }while (!rock.winnerPlayer(player,computer));


    }
}
