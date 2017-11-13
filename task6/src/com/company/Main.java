package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        long ch = 0;
        String path = "C:\\Users\\Занятия\\Desktop\\src\\java\\beans\\BeanDescriptor.java";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ: ");
        String value = in.next();
        try{
            String content = new String(Files.readAllBytes(Paths.get(path)));
            Pattern p = Pattern.compile(value);
            Matcher m = p.matcher(content);
            while(m.find()) {
                ch++;
            }
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println(ch);
        try{
        in.close();}
        catch (NoSuchElementException e){
            System.out.println(e);}
        }
    }

