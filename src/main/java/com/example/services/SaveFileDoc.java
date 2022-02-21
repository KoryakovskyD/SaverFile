package com.example.services;

import com.example.propPacket.PropApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveFileDoc implements SaverImp{
    @Override
    public void saveFile(String text) {
        try {
            String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));
            String extension = PropApp.getValue("formatFile");
            File file = new File("file" + currentTime + ".doc");
            if (!file.exists()) file.createNewFile();
            try(FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.append(text);
            }
        } catch (IOException e) {

        }
    }
}
