package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorkWithFile {
    private Path file;
    private List<String> linesList;

    public WorkWithFile(String path) {
        this.file = Paths.get(path);
        this.linesList = new ArrayList<String>((int)(this.file.toFile().length() / 40) * 2);
        readLinesToList();
    }

    private void readLinesToList(){
        try (InputStream in = Files.newInputStream(file);
             InputStreamReader r = new InputStreamReader(in)){
            BufferedReader reader = new BufferedReader(r);
            String line;
            while ((line = reader.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void getRandomLines(int linesNumber){
        Random random = new Random();
        for (int i = 0; i < linesNumber; i++) {
            System.out.print(i + ": "); System.out.println(linesList.get(random.nextInt(linesList.size() - 1)));
        }
    }



}
