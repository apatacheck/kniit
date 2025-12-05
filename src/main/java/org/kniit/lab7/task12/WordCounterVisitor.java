package org.kniit.lab7.task12;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class WordCounterVisitor extends SimpleFileVisitor<Path> {

    private int wordCount = 0;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toString().endsWith(".txt")) {
            List<String> lines = Files.readAllLines(file);
            for (String line : lines) {
                wordCount += line.split("[ .,!?;:]+").length;
            }
        }
        return FileVisitResult.CONTINUE;
    }

    public int getWordCount() {
        return wordCount;
    }
}
