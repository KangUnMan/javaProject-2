package org.techit.week1;

public class PointTest {
    public static void main(String[] args) {
        //0,0의 점 만들기
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n" ,p1.x,p1.y);
        System.out.println("x와 y가 같은 좌표인가?:"+p1.isSamePoint());
        //또 다른 점 찍기

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n" ,p2.x,p2.y);
        System.out.println("x와 y가 같은 좌표인가?:"+p2.isSamePoint());
    }
}
