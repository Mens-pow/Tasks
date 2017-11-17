package com.company;

public class Main {

    public static void main(String[] args) {
        WorkWithFile fileWork = new WorkWithFile(args[0]);
        fileWork.getRandomLines(Integer.parseInt(args[1]));

    }
}