package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        StreamGenerator streamer = new StreamGenerator("122 12 12323");
        List<?> collect = streamer.toIntStream().collect(Collectors.toList());
        System.out.println(collect);

        streamer.setS("Hello world");
        collect = streamer.toStringStream().collect(Collectors.toList());
        System.out.println(collect);

        streamer.setS("1,2 123 51,5");
        collect = streamer.toDoubleStream().collect(Collectors.toList());

        System.out.println(collect);
    }
}
