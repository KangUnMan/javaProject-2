package org.techit.week3.day1;

public class MultiplicationTableEx2 {
    public void Multiplication(int a) {
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTableEx2 multiplication = new MultiplicationTableEx2();
        multiplication.Multiplication(2);
    }
}
