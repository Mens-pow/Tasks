package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку в 16 системе счисления");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Ваша строка в 10 системе счисления");
        System.out.println((Long.parseLong(s, 16)));
    }
}
