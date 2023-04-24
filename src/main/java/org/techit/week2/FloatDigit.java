package org.techit.week2;

public class FloatDigit {
    public static void main(String[] args) {
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f;
        double df10 = 1.23e10;

        System.out.printf("f5:%f\n",f5);
        System.out.printf("f6:%f\n",f6);
        System.out.printf("f7:%f\n",f7);
        System.out.printf("f8:%f\n",f8);
        System.out.println(f9);
        System.out.println(f10+" float 으로 했을시"); //부터 숫자가 이상해짐 10f부터는 double로
        System.out.println(df10+" double로 했을시");

        float f11 = 3.141592653589793f; //f를 붙여 실행하면 뒤에 f 안붙이면 에러남.
        System.out.println(f11); //자릿수가 짤린다. 반올림됨.
        double d1 = 3.141592653589793; // 더블형으로 실행할시
        System.out.println(d1); // 3.14159265358979 출력된다 자릿수가 안찔린다.


    }
}
