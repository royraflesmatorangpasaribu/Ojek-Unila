package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener{
    private Button register;

    private EditText usernamer, gmailr, passwordr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usernamer = (EditText) findViewById(R.id.usernameregris);
        gmailr= (EditText) findViewById(R.id.gmailregris);
        passwordr = (EditText) findViewById(R.id.pswregris);
        register = (Button)findViewById(R.id.regis);

        register.setOnClickListener(this);
        usernamer.setOnClickListener(this);
        gmailr.setOnClickListener(this);
        passwordr.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String usernameregris = usernamer.getText().toString().trim();
        String gmailregris = gmailr.getText().toString().trim();
        String pswregris= passwordr.getText().toString().trim();
        boolean isEmptyFields= false;
        if (view.getId() == R.id.regis){
            if (TextUtils.isEmpty(usernameregris)){
                isEmptyFields = true;
                usernamer.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(gmailregris)){
                isEmptyFields = true;
                gmailr.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(pswregris)){
                isEmptyFields = true;
                passwordr.setError("Field ini tidak boleh kosong");
            }
            if (!isEmptyFields){
                Intent i;
                i = new Intent(this, MainActivity.class);
                startActivity(i);
            }

        }
    }
}