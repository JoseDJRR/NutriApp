package com.example.copao.nutriapp.Entities;

import com.example.copao.nutriapp.Entities.Message;

public class ReceiveMsg extends Message {
    private Long Hour;

    public ReceiveMsg() {
    }

    public ReceiveMsg(Long Hour) {
        this.Hour = Hour;
    }

    public ReceiveMsg(String message, String name, String profilePhoto, String typeMessage, String urlPhoto, Long hour) {
        super(message, name, profilePhoto, typeMessage, urlPhoto);
        Hour = hour;
    }

    public ReceiveMsg(String message, String name, String profilePhoto, String typeMessage, Long hour) {
        super(message, name, profilePhoto, typeMessage);
        Hour = hour;
    }

    public Long getHour() {
        return Hour;
    }

    public void setHour(Long Hour) {
        this.Hour = Hour;
    }
}
