package org.techit.week2;

public class DivideIntoTwo {
    public static void main(String[] args) {
        float fOne = 1.0f;
        float fTwo = 2;
        System.out.printf("%f\n", fOne+fOne/fTwo);

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne+iOne/iTwo);


        System.out.printf("%d\n", 9/2);
        // 인트형으로 계산했을때
        System.out.printf("%f\n", 9/2.0f);
        // float형으로 계산했을때
        //같은 수의 계산이지만 타입따라 결과가 다르다.
        // int 의 경우 소수를 버린다. 반올림x
    }
}
