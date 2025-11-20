package com.example;

public class App {
    public static String greet() {
        return "Hello from Jenkins CI! and";
    }

    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println("Hello from Jenkins CD!");
    }
}
