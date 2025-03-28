package com.example.CTGTDL;

import com.example.CTGTDL.chapter7.Dragon;
import com.example.CTGTDL.generics.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class CtgtdlApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(CtgtdlApplication.class, args);
        Audi a  = new Audi("audi", 4);
        System.out.println(a);
        a.method3();
        System.out.println(a.getName());
        // example to use generics in java
        Printer<Dragon> printer = new Printer<>(new Dragon());
        printer.print("Dragon");
        ArrayList<Dragon> dragons = new ArrayList<>();
        dragons.add(new Dragon());
        Dragon dragon = dragons.get(0);
        System.out.println(dragons.size());
        Printer<Double> doublePrinter = new Printer<>(22.2);
        doublePrinter.print("Generics");
//        Comparison comparison = new Comparison();
//        System.out.println(comparison.compareString());
//        int n = 10000;
//
//        // Using String
//        long start = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < n; i++) {
//            s += i;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("String time: " + (end - start) + "ms");
//
//        // Using StringBuilder
//        start = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            sb
//                    .append("result")
//                    .append(i).append("\n")
//            ;
//        }
//        end = System.currentTimeMillis();
//        System.out.println("StringBuilder time: " + (end - start) + "ms");
//        System.out.println(sb);
//        DynamicArr<String> dynamicArr = new DynamicArr<>();
//        dynamicArr.add("1");
//        dynamicArr.add("2");
//        dynamicArr.add("3");
//        dynamicArr.add("4");
//        dynamicArr.add("5");
//        System.out.println(dynamicArr.toString());
//        ApplicationContext context = SpringApplication.run(CtgtdlApplication.class, args);
//        Engine engine = context.getBean(Engine.class);
//        System.out.println(engine);
//
//        String[] src = {"src/main/resources/zipTest/zipTest2.txt", "src/main/resources/zipTest/zipTest1.txt"};
//        ZipFiles.ZipMultipleFiles(src, "Zipfileaaa.zip");
    }
}

