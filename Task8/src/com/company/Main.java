package com.company;
import sun.nio.cs.ext.ISCII91;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by akalji on 05.10.2017.
 */

public class Main {

    public static void main(String[] args) {
         long a = 25214903917L;
         long c = 11L;
         long m = (long)Math.pow(2,48);

         Isorm randNum = new Isorm();
         randNum.generate(a,c,m);
         System.out.println(randNum.getRandNumbers(40));


    }
}
