package org.techit.week4.day3;

import java.io.IOException;

public class PyramidDrawer extends ShapeDrawer{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", " ".repeat(height - i - 1), "*".repeat(2 * i + 1));
    }

    @Override
    public void print(String message) throws IOException {


    }
}
