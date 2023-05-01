package org.techit.codeup;

import java.util.Scanner;

public class CodeUp99 {
    public static void main(String[] args) {
        //개미집은 반드시 (2,2)에 존재한다.
        //먹이가 2로 주어진다.
        //성실한 개미가 이동한 경로를 9로 표시해 출력한다.
        // 개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[10][10];
        int line=1;
        int row=1;
        for(int j=0; j< maze.length; j++){ //입력받는곳
            String mazeWide = sc.nextLine();
            String[] mazeWideArr = mazeWide.split(" ");
            int[] mazeWideNum = new int[mazeWideArr.length];
            for(int i=0; i<mazeWideArr.length; i++){
                mazeWideNum[i] = Integer.parseInt(mazeWideArr[i]);
                maze[j][i] = mazeWideNum[i];
            }
        }


        while (true){ //항상 반복되도록
            if(maze[line][row]==0){ //0일 경우 9로 바꾸고 길을 찾는다.
                maze[line][row]=9;
                if(maze[line][row+1]==0){
                    row++;
                }else if(maze[line][row+1]==1&&maze[line+1][row]==0){
                    line++;
                }
            }else if(maze[line][row]==2){ //바로 먹이가 있을경우 9로 바꾸고 멈춘다.
                maze[line][row] = 9;
                break;
            }else if(maze[line][row+1]==2){ //먹이가 어느방향에 있는지 찾는다.
                maze[line][row+1] = 9;
                break;
            }else if(maze[line+1][row]==2){ //먹이가 어느방향에 있는지 찾는다.
                maze[line+1][row] = 9;
                break;
            }
            else { //오른쪽으로 갈 수 없을시 멈춘다.
                break;
            }
        }


        for(int i=0; i< maze.length; i++){ //출력
            for(int j=0; j< maze.length; j++){
                System.out.printf("%d ",maze[i][j]);
            }
            System.out.println();
        }
    }
}
