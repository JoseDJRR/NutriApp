package com.example.copao.nutriapp.Entities;

import com.example.copao.nutriapp.Entities.Message;

import java.util.Map;

public class SendMessage extends Message {
    private Map hour;

    public SendMessage(){
    }

    public SendMessage(Map hour){
        this.hour = hour;
    }

    public SendMessage(String message, String name, String profilePhoto, String typeMessage, Map hour) {
        super(message, name, profilePhoto, typeMessage);
        this.hour = hour;
    }

    public SendMessage(String message, String name, String profilePhoto, String typeMessage, String urlPhoto, Map hour) {
        super(message, name, profilePhoto, typeMessage, urlPhoto);
        this.hour = hour;
    }

    public Map getHour() {
        return hour;
    }

    public void setHour(Map hour) {
        this.hour = hour;
    }
}
