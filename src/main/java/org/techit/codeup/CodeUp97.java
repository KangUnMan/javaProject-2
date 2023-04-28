package org.techit.codeup;

import java.util.Scanner;

public class CodeUp97 { //나중에.. 다시 보자..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String badukPoint;
        String[] badukPointArr;
        int[][] badukpan = new int[19][19]; // 여길바꿔야할같다.
        for (int i=0; i<19; i++){ //바둑판 상황 입력받기. 이건 문제없는듯
            badukPoint = sc.nextLine();
            badukPointArr = badukPoint.split(" ");
            for(int j=0; j<19; j++){
                badukpan[i][j] = Integer.parseInt(badukPointArr[j]);
            }
        }

        int point = sc.nextInt();

        for (int k=0; k<point; k++){
            int pointX = sc.nextInt()-1;
            int pointY = sc.nextInt()-1;

            for(int y=0; y<19; y++){
                if(badukpan[y][pointX] == 0){
                    badukpan[y][pointX] = 1;
                }else {
                    badukpan[y][pointX] = 0;
                }
            }
            for(int x=0; x<19; x++){
                if(badukpan[pointY][x] == 0){
                    badukpan[pointY][x] = 1;
                }else {
                    badukpan[pointY][x] = 0;
                }
            }
        }


        for(int i=0; i<19; i++){ //바둑판 출력
            for (int j=0; j<19; j++){
                System.out.printf("%d ",badukpan[i][j]);
            }
            System.out.println();
        }


    }

}
