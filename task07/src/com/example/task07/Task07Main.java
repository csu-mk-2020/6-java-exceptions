package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        try {
            processor.process(); //todo вы можете заменить реализацию этого метода для ручного дебага
        } catch (Throwable e) {
            if (e instanceof RuntimeException || e instanceof Error)
                return "unchecked";
            else
                return "checked";

        }
        /*
        return null;
         */
        return "none";
    }

}