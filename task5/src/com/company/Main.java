package com.company;

import java.nio.file.*;

public class Main  {

    public static void main(String[] args)  {
        FilesParsing filesParsing = new FilesParsing();
        filesParsing.createExplorer(50000, Paths.get("c:/Users/занятия/Desktop/src"));
        filesParsing.parse("volatile", "transient");
        System.out.println(filesParsing.getFilesArrayList());
    }}