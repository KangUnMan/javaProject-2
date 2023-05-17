package org.techit.week5.day2;

import java.util.Arrays;
import java.util.Collections;

public class InsertSort2<T> {
    // desc --> 내림차순
    // asc --> 오름차순
    public T[] sort(T[] arr, boolean isAscending) {
        if(isAscending){
            Arrays.sort(arr);
        }else{
            Arrays.sort(arr, Collections.reverseOrder());
        }
        return arr;
    }
    public T[] sort(T[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
//      int [] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'f', 'e', 'g', 'a', 'c'};
        InsertSort2<Character> is = new InsertSort2();
        cArr = is.sort(cArr, false);
        System.out.println(Arrays.toString(cArr));
    }
}
