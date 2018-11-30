package com.example.copao.nutriapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.copao.nutriapp.R;
import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {

    private Button chatbtn;
    private Button closes;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        chatbtn = findViewById(R.id.chat);
        closes = findViewById(R.id.closes);

        chatbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                    Intent i = new Intent(MenuActivity.this, MainActivity.class);
                    startActivity(i);
            }
        });
        closes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(MenuActivity.this, ActivityLogin.class));
                finish();
            }
        });
    }
}
