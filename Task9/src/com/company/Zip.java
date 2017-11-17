package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zip {
    private Stream<Integer> Stream1, Stream2, result;
    Zip( ArrayList<Integer> first, ArrayList<Integer> second){
        this.Stream1 = first.stream();
        this.Stream2 = second.stream();
    }

    public void zip(){
        Stream.Builder<Integer> b = Stream.builder();
        Iterator firstIt = Stream1.iterator();
        Iterator secondIt = Stream2.iterator();

        while (firstIt.hasNext()&&secondIt.hasNext()){
                b.accept((Integer) firstIt.next());
                b.accept((Integer) secondIt.next());
            }

        this.result = b.build();
    }

    public List<?> getResult() {
        return this.result.collect(Collectors.toList());
    }
}
