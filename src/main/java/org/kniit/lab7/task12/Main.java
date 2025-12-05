package org.kniit.lab7.task12;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path folder = Paths.get("src\\main\\java\\org\\kniit\\lab7\\task12\\test");
        WordCounterVisitor visitor = new WordCounterVisitor();
        Files.walkFileTree(folder, visitor);
        System.out.println("Общее количество слов: " + visitor.getWordCount());
    }
}
