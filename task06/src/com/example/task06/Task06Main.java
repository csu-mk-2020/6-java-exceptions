package com.example.task06;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Task06Main {
    /*
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    void fun() {
        new Task06Main().printMethodName();
    }

    public static void main(String[] args) {
        new Task06Main().fun();
    }

    void printMethodName() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
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