package org.techit.week4.day3.inter;

public class ConsolePrinter implements Printer2 { //인터페이스 구현체

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
