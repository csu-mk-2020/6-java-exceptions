package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getSeason(-5));

    }

    static String getSeason(int monthNumber) throws MyException {
        if(monthNumber < 1 || monthNumber > 12) {
            throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
        }
        if((monthNumber >= 1 && monthNumber <= 2) || monthNumber == 12) {
            return "зима";
        }

        int numOfSeason = monthNumber / 3;
        switch (numOfSeason){
            case 1:
                return "весна";
            case 2:
                return "лето";
            case 3:
                return "осень";
            default:
                return "зима";
        }
    }

}