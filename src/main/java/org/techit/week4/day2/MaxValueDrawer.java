package org.techit.week4.day2;

public class MaxValueDrawer extends  MaxMinDrawer{
    @Override
    public int valueofThan(int num1, int num2) {
        int max = num1;
        if(max<num2) max = num2;
        return max;
    }
}
