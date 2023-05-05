package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_chat_0 extends AppCompatActivity implements View.OnClickListener {

    private EditText alamat;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat0);

        alamat = (EditText) findViewById(R.id.almt);
        send = (Button) findViewById(R.id.send);

        alamat.setOnClickListener(this);
        send.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.send){
            String ALAMAT = alamat.getText().toString();

            boolean isEmptyFields = false;
            if (!isEmptyFields){
                i = new Intent(this, Chat.class);
                i.putExtra("alamat", ALAMAT);
                startActivity(i);
            }
        }
    }
}