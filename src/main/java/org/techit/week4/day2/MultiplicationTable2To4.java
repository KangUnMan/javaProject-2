package org.techit.week4.day2;

public class MultiplicationTable2To4 {

    void printMultip(int num){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
        System.out.printf("-----------\n");
    }
    public static void main(String[] args) {
        MultiplicationTable2To4 mu = new MultiplicationTable2To4();
        mu.printMultip(2);
        mu.printMultip(3);
        mu.printMultip(4);
        mu.printMultip(6);

    }
}
