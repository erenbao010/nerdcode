package com.example.CTGTDL.chapter7;

public class Dragon extends Monster {
    boolean frighten(int degree) {
        System.out.println("breath fire");
        return true;
    }

    @Override
    boolean fly(int x) {
        System.out.println("dragon flies");
        return true;
    }

    @Override
    public String toString() {
        return "";
    }
}
