package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Chat extends AppCompatActivity {
    private TextView alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        alamat = (TextView) findViewById(R.id.alamat);

        Bundle b = getIntent().getExtras();
        alamat.setText(b.getString("alamat"));

        Button btn_arr = findViewById(R.id.btn_driver_arrived);
        btn_arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Menu.class);
                startActivity(i);
            }
        });
    }
}