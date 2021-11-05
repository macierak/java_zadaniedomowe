package com.zad2.zad2;

public class kantorData {
    double GBP = 5.46;
    double EUR = 4.62;
    double USD = 3.99;
    double CHF = 4.38;

    double input = 0;
    double result = 0;
    String entry = "";

    public double getInput(){
        return input;
    }
    public String getEntry(){
        return entry;
    }

    public void setInput(double in){
        input = in;
    }
    public void setEntry(String in){
        entry = in;
    }
    public double getResult(){
        return result;
    }
    public void calc(){
        switch(entry){
            case "GBP":
                result = input*GBP;
                break;
            case "EUR":
                result = input*EUR;
                break;
            case "USD":
                result = input*USD;
                break;
            case "CHF":
                result = input*CHF;
                break;
                default:
                System.out.println(entry);
        }
    }
}
