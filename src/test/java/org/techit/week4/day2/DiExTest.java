package org.techit.week4.day2;

import static org.junit.jupiter.api.Assertions.*;

class DiExTest {
    public static void main(String[] args) {
        ParallelogramShapeDrawer parallelogramShapeDrawer = new ParallelogramShapeDrawer();
        DiEx diEx = new DiEx(parallelogramShapeDrawer);
        diEx.doSth();
    }

}