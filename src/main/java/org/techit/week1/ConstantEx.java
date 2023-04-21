package org.techit.week1;

public class ConstantEx {
    public static void main(String[] args) {
        final int iVal; // 앞에 final을 붙입니다.
        iVal = 1; // 최초에 한 번만 값을 지정할 수 있습니다.
        System.out.println(iVal);

        final  PrintY printY = new PrintY(); //참조타입에도 안바뀌게 final을 사용가능
        printY.print();
    }
}