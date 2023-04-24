package org.techit.week2;

public class FloatParsing {
    public static void main(String[] args) {
        String val1 = "1.11111111"; // 소수점 여덟 자리가 넘어감
        String val2 = "2.11111111"; // 소수점 여덟 자리기 넘어감
        float result = Float.parseFloat(val1) + Float.parseFloat(val2); // float은 소수점 7자리까지 정확하지만 8자리라서 뒤에숫자가 올림처림 되어 부정확하다
        System.out.println(result);
        //소수점이 8자리가 넘어갈시 double 형을 쓰도록하자.
        String val3 = "1.11111111"; //정확함
        String val4 = "2.11111111";
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);
    }

}
