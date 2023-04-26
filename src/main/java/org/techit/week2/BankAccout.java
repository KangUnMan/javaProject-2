package org.techit.week2;

public class BankAccout {
    public static void main(String[] args) {
        int myAccount = 1_000_000;
        myAccount = myAccount - 500_000;
        System.out.printf("%d원\n",myAccount);

        myAccount = myAccount + 4_000_000;
        System.out.printf("%d원\n",myAccount);
    }
}
