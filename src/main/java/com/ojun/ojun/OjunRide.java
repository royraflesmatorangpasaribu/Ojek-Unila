package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OjunRide extends AppCompatActivity implements View.OnClickListener{
    Button chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_ride);

        chat = (Button) findViewById(R.id.button2);

        chat.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.button2){
            i = new Intent(this, activity_chat_0.class);
            startActivity(i);
        }
    }
}