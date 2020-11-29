package com.example.task06;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Task06Main {
    void fun() {
        new Task06Main().printMethodName();
    }

    public static void main(String[] args) {
        new Task06Main().fun();
    }

    void printMethodName() {
        try {
            throw new Exception();
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String stackTrace = sw.toString().split("\n")[2];
            stackTrace = stackTrace.substring(0, stackTrace.indexOf('('));
            stackTrace = stackTrace.substring(stackTrace.lastIndexOf('.') + 1);
            System.out.print(stackTrace);
        }
    }
}