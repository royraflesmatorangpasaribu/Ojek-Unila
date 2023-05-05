package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OjunRideCov extends AppCompatActivity implements View.OnClickListener{
    private Button mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_ride_cov);
        mulai=(Button) findViewById(R.id.btnMulai);
        mulai.setOnClickListener(this);
    }@Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btnMulai){
            i = new Intent(this, OjunRide.class);
            startActivity(i);
        }
    }
}