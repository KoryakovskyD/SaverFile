package com.example.services;

import com.example.propPacket.PropApp;

public class SaverDispatcher {

    public void saveFile(String text) {
        SaverImp saverImp = null;
        String extension = PropApp.getValue("FormatFile");

        switch (extension) {
            case ("txt") : saverImp = new SaverFileTxt();
                break;
            case ("doc") : saverImp = new SaveFileDoc();
                break;
        }

        new SaverController().saverFile(saverImp, text);
    }
}
