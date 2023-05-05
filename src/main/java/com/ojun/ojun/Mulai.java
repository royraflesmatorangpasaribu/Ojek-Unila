package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mulai extends AppCompatActivity{
    Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        mulai = (Button)findViewById(R.id.mulai);

        Intent i = getIntent();
        String gmail = i.getStringExtra("gmail");

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Menu.class);
                i.putExtra("gmail", gmail);
                startActivity(i);
            }
        });

    }
}