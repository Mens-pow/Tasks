package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for(int i =0; i<15;i++)first.add(i);
        for(int i =5; i<30;i++)second.add(i);

        Zip zip = new Zip(first, second);
        zip.zip();
        System.out.println(zip.getResult());

    }

}
