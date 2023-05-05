package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OjunMenChat extends AppCompatActivity implements View.OnClickListener{

    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_men_chat);

        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.send){
            i = new Intent(this, OjunMenSuccess.class);
            startActivity(i);
        }
    }
}