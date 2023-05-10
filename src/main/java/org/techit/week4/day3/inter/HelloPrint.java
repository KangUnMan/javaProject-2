package org.techit.week4.day3.inter;


import java.io.IOException;

public class HelloPrint {

    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다.
    Printer2 printer;
    public HelloPrint(Printer2 printer) {
        this.printer = printer;
    }


    public void repeatMessage(int n, String message) throws IOException { // 반복 출력하는 기능 추가
        for(int i=0; i<n; i++){
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrint hp = new HelloPrint(new FilePrinter()); //파일 프런터 연결
        hp.repeatMessage(1,"hello"); //프린터 실행
    }
}
