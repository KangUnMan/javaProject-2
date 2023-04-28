package org.techit.week2.lastday;

public class IfLogicalOperatorEx {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > 0 && y > 0){
            System.out.println("둘다 양수입니다.");
        }
        if (x > 0 || y > 0){
            System.out.println("둘중 하나는 양수입니다.");
        }
        if (!(x > 0)){
            System.out.println("x는 음수 또는 0입니다.");
        }
    }
}
