package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OjunPrintMenu extends AppCompatActivity {

    Button btn_laprak, btn_makalah, btn_skripsi, btn_other;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_print_menu);

        btn_laprak = (Button) findViewById(R.id.btn_laprak);
        btn_makalah = (Button) findViewById(R.id.btn_makalah);
        btn_skripsi = (Button) findViewById(R.id.btn_skripsi);
        btn_other = (Button) findViewById(R.id.btn_other);


        btn_laprak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), OjunPrintUploadFile.class);
                startActivity(i);

            }
        });

        btn_makalah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), OjunPrintUploadFile.class);
                startActivity(i);

            }
        });

        btn_skripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), OjunPrintUploadFile.class);
                startActivity(i);

            }
        });

        btn_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), OjunPrintUploadFile.class);
                startActivity(i);

            }
        });

    }
}