package org.techit.codeup;

import java.util.Scanner;

public class CodeUp97 { //나중에.. 다시 보자..
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String badukPoint;
        String[] badukPointArr;
        int[][] badukpan = new int[20][20]; // 여길바꿔야할같다.
        for (int i=1; i<=19; i++){ //바둑판 상황 입력받기. 이건 문제없는듯
            badukPoint = sc.nextLine();
            badukPointArr = badukPoint.split(" ");
            for(int j=1; j<=19; j++){
                badukpan[i][j] = Integer.parseInt(badukPointArr[j-1]);
            }
        }

        int point = sc.nextInt();

        for (int k=1; k<=point; k++){
            int pointX = sc.nextInt();
            int pointY = sc.nextInt();

            for(int i=1; i<=19; i++){
                if(badukpan[pointX][i]==0){
                    badukpan[pointX][i]=1;
                }else{
                    badukpan[pointX][i]=0;
                }
            }
            for(int i=1; i<=19; i++){
                if(badukpan[i][pointY]==0){
                    badukpan[i][pointY]=1;
                }else{
                    badukpan[i][pointY]=0;
                }
            }

        }


        for(int i=1; i<=19; i++){ //바둑판 출력
            for (int j=1; j<=19; j++){
                System.out.printf("%d ",badukpan[i][j]);
            }
            System.out.println();
        }


    }

}
