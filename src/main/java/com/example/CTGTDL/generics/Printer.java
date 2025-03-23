package com.example.CTGTDL.generics;

import com.example.CTGTDL.chapter7.Dragon;
import com.example.CTGTDL.chapter7.Monster;


public class Printer <T >{
    // example of using generics in java
    T printThings;
    public Printer(T printThings) {
        this.printThings = printThings;
    }
    public void print(String action) {
        System.out.println(
                action);
    }
}
