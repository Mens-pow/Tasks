package com.company;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Isorm {

    private Stream<Long> infiniteStream;

 public void generate(long a, long c, long m){
     this.infiniteStream = Stream.iterate(0L, i ->  (a * i+  c) % m);
 }

    public List<Long> getRandNumbers(int limit) {
        List<Long> collect = infiniteStream.limit(limit).collect(Collectors.toList());
        return collect;
    }

}
