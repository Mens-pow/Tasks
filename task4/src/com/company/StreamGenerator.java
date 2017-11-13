package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

public class StreamGenerator {
    private String s;

    public StreamGenerator(String s) {
        this.s = s;
    }

    public void setS(String s) {

        this.s = s;
    }

    public Stream<String> toStringStream(){

        Stream.Builder<String> b = Stream.builder();
        try(Scanner scanner = new Scanner(this.s)){
            while (scanner.hasNext()) {
                b.accept(scanner.next());
            }
            Stream<String> stream = b.build();
            return stream;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }};

    public Stream<Integer> toIntStream(){
        Stream.Builder<Integer> b = Stream.builder();
        try(Scanner scanner = new Scanner(this.s)){
            while (scanner.hasNextInt()) {
                b.accept(scanner.nextInt());
            }
            Stream<Integer> stream = b.build();
            return stream;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }};

    public Stream<Double> toDoubleStream(){
        Stream.Builder<Double> b = Stream.builder();
        try(Scanner scanner = new Scanner(this.s)){
            while (scanner.hasNextDouble()) {
                b.accept(scanner.nextDouble());
            }
            Stream<Double> stream = b.build();
            return stream;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }}
}
