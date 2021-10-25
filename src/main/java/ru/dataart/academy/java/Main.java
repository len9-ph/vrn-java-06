package ru.dataart.academy.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("C:\\Users\\leoni\\Documents\\University\\Java School 2021\\vrn-java-06\\src\\test\\resources\\test.zip", '1'));

        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("C:\\Users\\leoni\\Documents\\University\\Java School 2021\\vrn-java-06\\src\\test\\resources\\test1.zip"));
    }
}