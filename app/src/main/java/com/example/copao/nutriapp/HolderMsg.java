package com.example.copao.nutriapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class HolderMsg extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView message;
    private TextView hour;
    private CircleImageView profilePhotoMsg;
    private ImageView messagePhoto;

    public HolderMsg(@NonNull View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.messageName);
        message = (TextView) itemView.findViewById(R.id.messageMessage);
        hour = (TextView) itemView.findViewById(R.id.messageHour);
        profilePhotoMsg = (CircleImageView) itemView.findViewById(R.id.profilePhotoMsg);
        messagePhoto = (ImageView) itemView.findViewById(R.id.messagePhoto);
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getMessage() {
        return message;
    }

    public void setMessage(TextView message) {
        this.message = message;
    }

    public TextView getHour() {
        return hour;
    }

    public void setHour(TextView hour) {
        this.hour = hour;
    }

    public CircleImageView getProfilePhotoMsg() {
        return profilePhotoMsg;
    }

    public void setProfilePhotoMsg(CircleImageView profilePhotoMsg) {
        this.profilePhotoMsg = profilePhotoMsg;
    }

    public ImageView getMessagePhoto() {
        return messagePhoto;
    }

    public void setMessagePhoto(ImageView messagePhoto) {
        this.messagePhoto = messagePhoto;
    }
}
