package org.techit.week4.day2;

public class MultiplicationTable2To4 {
    public MultiplicationTable2To4(String multipleSym) {
        this.multipleSym = multipleSym;
    }

    private String multipleSym = "*";
    void printMultip(int num){
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", num,multipleSym, i, num * i);
        }
        System.out.printf("-----------\n");
    }
    public static void main(String[] args) {
        MultiplicationTable2To4 mu = new MultiplicationTable2To4("x");
        MultiplicationTable2To4 mt2 = new MultiplicationTable2To4("*");
        mu.printMultip(2);
        mt2.printMultip(3);
        mu.printMultip(4);
        mt2.printMultip(6);

    }
}
