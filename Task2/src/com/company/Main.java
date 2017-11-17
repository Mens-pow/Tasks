package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String temp = args[0];
        rot13 enc = new rot13();
         String result = enc.encode(temp);
         System.out.println("encoded string  - "+ result);
        result = enc.encode(result);
        System.out.println("decoded string  - "+result);


    }
}
