package com.example.copao.nutriapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.copao.nutriapp.Entities.ReceiveMsg;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdapterMsg extends RecyclerView.Adapter<HolderMsg> {

    private List<ReceiveMsg> messageList = new ArrayList<>();
    private Context c;

    public AdapterMsg(Context c) {
        this.c = c;
    }

    public void addMsg (ReceiveMsg m){
        messageList.add(m);
        notifyItemInserted(messageList.size());
    }

    @Override
    public HolderMsg onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(c).inflate(R.layout.card_view_msg, parent, false);
        return new HolderMsg(v);
    }

    @Override
    public void onBindViewHolder(HolderMsg holder, int position) {
        holder.getName().setText(messageList.get(position).getName());
        holder.getMessage().setText(messageList.get(position).getMessage());
        if(messageList.get(position).getTypeMessage().equals("2")){
            holder.getMessagePhoto().setVisibility(View.VISIBLE);
            holder.getMessage().setVisibility(View.VISIBLE);
            Glide.with(c).load(messageList.get(position).getUrlPhoto()).into(holder.getMessagePhoto());
        }else if(messageList.get(position).getTypeMessage().equals("1")){
            holder.getMessagePhoto().setVisibility(View.GONE);
            holder.getMessage().setVisibility(View.VISIBLE);
        }
        if(messageList.get(position).getProfilePhoto().isEmpty()){
            holder.getProfilePhotoMsg().setImageResource(R.mipmap.ic_launcher);
        }else{
            Glide.with(c).load(messageList.get(position).getProfilePhoto()).into(holder.getProfilePhotoMsg());
        }
        Long hourCode = messageList.get(position).getHour();
        Date d = new Date(hourCode);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");//a pm o am
        holder.getHour().setText(sdf.format(d));
    }



    @Override
    public int getItemCount() {
        return messageList.size();
    }
}
