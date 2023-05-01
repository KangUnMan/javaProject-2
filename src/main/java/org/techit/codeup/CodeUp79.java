package org.techit.codeup;


import java.util.Scanner;

public class CodeUp79 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        //q가 입력될때까지 무한 반복.
        String qOrRepeatStr;
        char qOrRepeat; //79번
        String[] qOrRepeatStrArr;
        boolean onOff= true;
        while (onOff==true){
             qOrRepeatStr = sc.nextLine(); // String형
             qOrRepeatStrArr = qOrRepeatStr.split(" ");
             for (int i=0; i<qOrRepeatStrArr.length; i++){
                 if(qOrRepeatStrArr[i].substring(0).equals("q")){
                     System.out.printf("%s\n",qOrRepeatStrArr[i]);
                     onOff=false;
                     break;
                 }else{
                     System.out.printf("%s\n",qOrRepeatStrArr[i]);
                 }
             }
        }

    }
}
