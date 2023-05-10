package org.techit.calculator;

public class Main {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        ByPassNumberMaker byPassNumberMaker = new ByPassNumberMaker();
        Calculator calculator = new Calculator(byPassNumberMaker);

        calculator.plus(20);

    }
}
