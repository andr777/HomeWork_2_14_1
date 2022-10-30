package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        IntegerList nums = new IntegerListImpl(100_000);

        nums.sort();
    }
}