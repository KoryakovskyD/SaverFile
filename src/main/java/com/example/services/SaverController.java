package com.example.services;

public class SaverController {
    public void saverFile(SaverImp saverImp, String text) {
        if (saverImp != null) saverImp.saveFile(text);
    }
}
