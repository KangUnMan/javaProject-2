package org.techit.codeup;


import java.util.Scanner;

public class CodeUp79 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String qOrRepeatStr;
        char qOrRepeat; //변환해서 넣을 문자열?
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
