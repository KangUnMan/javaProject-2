package org.techit.week4.day1;

public class SpaceInvadersTest {

    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();

        si.moveLeft();
        System.out.println(si.locaton);
        si.moveLeft();
        System.out.println(si.locaton);
        si.moveRight();
        System.out.println(si.locaton);
    }
}
