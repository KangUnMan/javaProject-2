package org.techit.week6.day1;

public class Dog extends Animal{
    @Override
    public void makesound() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makesound();
    }
}
