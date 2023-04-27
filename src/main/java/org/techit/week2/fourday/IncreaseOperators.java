package org.techit.week2.fourday;

public class IncreaseOperators {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i++ : "+i++); //출력결과 : 10 , 쓰고 나서 증가시킵니다.
        System.out.println(i); // 출력결과 : 11 ,
        System.out.println();
        int j = 10;
        System.out.println("++i : "+ ++i); //출력결과 : 11 , 증가시키고 사용합니다..
        System.out.println(i); // 출력결과 : 11 ,
        System.out.println();
        int k = 10;
        System.out.println("i-- : "+i--); //출력결과 : 9 , 쓰고 나서 감소시킵니다.
        System.out.println(i); // 출력결과 : 10 ,
        System.out.println();
        int l = 10;
        System.out.println("--i : "+--i); //출력결과 : 9 , 감소시키고 사용합니다..
        System.out.println(i); // 출력결과 : 9 ,
    }
}
