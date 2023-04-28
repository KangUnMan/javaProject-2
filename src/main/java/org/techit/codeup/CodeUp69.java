package org.techit.codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp69 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        char grade = (char) is.read();
        //스위치 문 활용
        switch (grade){
            case 'A':
                System.out.printf("best!!!");
                break;
            case 'B':
                System.out.printf("good!!");
                break;
            case  'C':
                System.out.printf("run!");
                break;
            case 'D':
                System.out.printf("slowly~");
                break;
            default:
                System.out.printf("what?");

        }
    }
}
