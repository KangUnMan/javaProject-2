package org.techit.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackEx { //스택 구현.

    private int[] arr = new int[10];

    private int pointer = 0;
    public void push(int value){
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer : " + pointer);
    }

    public boolean isEmpty(){
        return this.pointer == 0;
    }

    public int peek() {
        if(isEmpty()) throw new EmptyStackException(); //Stack이 비어있을 경우
        return this.arr[pointer - 1]; //값을 확인하지만 없애진않음
    }

    public int pop() {
        /*int temp = this.arr[pointer-1];
        pointer--;
        System.out.println(Arrays.toString(arr));
        return temp;*/
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer]; //

    }
    public static void main(String[] args) {
        StackEx st = new StackEx();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st.peek());
        st.pop();

    }
}
