package org.techit.week2.fourday;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 1; // x에 1을 더하고 대입함 x=x+1
        System.out.printf("+=1 %d\n", x);
        x -= 5; // x에 5을 빼고 대입함 x=x-5
        System.out.printf("-=5 %d\n", x);
        x *= 2; // x에 2을 곱하고 대입함 x=x*2
        System.out.printf("*=2 %d\n", x);
        x /= 3; // x에 3을 나누고 대입함 x=x/2
        System.out.printf("/=3 %d\n", x);
        x %= 8;  // x에 8을 나누고 나머지를 대입함 x=x/2
        System.out.printf("%%=8 %d\n", x);
    }
}
