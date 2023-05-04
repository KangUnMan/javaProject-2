package org.techit.Programmas;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 253;
        int cnt = 0;

        // 자릿수 만큼 반복하기
        while (num > 0){
            num /= 10;
            cnt++;
            System.out.printf("num:%d cnt:%d\n",num,cnt);
        }
    }
}
