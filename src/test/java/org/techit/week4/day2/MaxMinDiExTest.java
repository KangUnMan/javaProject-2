package org.techit.week4.day2;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinDiExTest {
    public static void main(String[] args) {

        MaxValueDrawer maxValueDrawer = new MaxValueDrawer();

        MaxMinDiEx maxMinDiEx = new MaxMinDiEx(maxValueDrawer);

        maxMinDiEx.printValue();

        MinValueDrawer minValueDrawer = new MinValueDrawer();

        MaxMinDiEx maxMinDiEx1 = new MaxMinDiEx(minValueDrawer);

        maxMinDiEx1.printValue();
    }

}