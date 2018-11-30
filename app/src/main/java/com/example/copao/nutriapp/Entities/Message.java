package com.example.copao.nutriapp.Entities;

public class Message {

    private String message;
    private String name;
    private String profilePhoto;
    private String typeMessage;
    private String urlPhoto;

    public Message() {
    }

    public Message(String message, String name, String profilePhoto, String typeMessage, String urlPhoto) {
        this.message = message;
        this.name = name;
        this.profilePhoto = profilePhoto;
        this.typeMessage = typeMessage;
        this.urlPhoto = urlPhoto;
    }

    public Message(String message, String name, String profilePhoto, String typeMessage) {
        this.message = message;
        this.name = name;
        this.profilePhoto = profilePhoto;
        this.typeMessage = typeMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getTypeMessage() {
        return typeMessage;
    }

    public void setTypeMessage(String typeMessage) {
        this.typeMessage = typeMessage;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }
}
