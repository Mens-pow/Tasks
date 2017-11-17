package com.company;

import java.io.*;
import java.nio.file.Files;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesParsing {
    private List filesList;
    private String currentFilePath;
    private ArrayList<String> filesArrayList;

    FilesParsing() {
        this.filesArrayList = new ArrayList<>();
    }


    public void createExplorer(int depth, Path start) {
        try (Stream<Path> stream = Files.walk(start, depth)) {
            this.filesList = stream
                    .map(String::valueOf)
                    .filter(path -> path.endsWith(".java"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> getFilesArrayList() {
        return filesArrayList;
    }

    private void define(int index) {

        this.currentFilePath = filesList.get(index).toString();

    }

    public void parse(String param1, String param2) {
        for (int i = 0; i < filesList.size(); i++) {
            define(i);
            try (LineNumberReader lnr = new LineNumberReader(
                    new BufferedReader(
                            new FileReader(currentFilePath)))) {

                String temp;
                while ((temp = lnr.readLine()) != null) {
                    if (temp.contains(param1) || temp.contains(param2)) {
                        filesArrayList.add(currentFilePath);
                    }
                }

            } catch (IOException e) {

                System.out.println(e);
            }

        }


    }
}