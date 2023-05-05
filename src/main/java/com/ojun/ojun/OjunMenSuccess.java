package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OjunMenSuccess extends AppCompatActivity implements View.OnClickListener {

    private Button succes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_men_success);

        succes = (Button) findViewById(R.id.btn_success);

        succes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_success){
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
    }
}