package org.techit.week4.day3;

import static org.junit.jupiter.api.Assertions.*;

class DiexTest {
    public static void main(String[] args) {
        DimondDrawer dimondDrawer = new DimondDrawer();
        PyramidDrawer pyramidDrawer = new PyramidDrawer();
        Diex diex = new Diex(dimondDrawer);
        Diex diex1 = new Diex(pyramidDrawer);
        diex.printshape(7);
        diex1.printshape(7);

    }

}