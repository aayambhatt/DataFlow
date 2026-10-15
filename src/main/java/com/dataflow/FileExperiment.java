package com.dataflow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExperiment {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("data/input/message.txt");

        String content = Files.readString(path);

        Path outputPath = Path.of("data/output/result.txt");

        Files.createDirectories(outputPath.getParent());

        Files.writeString(outputPath, content);

        Files.writeString(outputPath, "FIRST");
        Files.writeString(outputPath, "SECOND");

        System.out.println("Output Written");

        System.out.println(content);

    }
}
