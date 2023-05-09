package org.techit.week4.day2;

public class MaxMinDiEx {
    MaxMinDrawer maxMinDrawer;
    public MaxMinDiEx(MaxMinDrawer maxMinDrawer) {
        this.maxMinDrawer = maxMinDrawer;
    }


    public void printValue(){
        maxMinDrawer.MaxOrMinValuePrint(new int[]{3,4,5});
    }

}
