package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login, register;

    EditText gmailForm, passwordForm;

    String default_gmail, default_password, gmail, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        default_gmail = "ojun123@gmail.com";
        default_password = "123";

        login = (Button)findViewById(R.id.btn_login);
        register =(Button)findViewById(R.id.btn_register);

        gmailForm = findViewById(R.id.gmailForm);
        passwordForm = findViewById(R.id.passwordForm);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                gmail = gmailForm.getText().toString();
                password = passwordForm.getText().toString();

                if (gmail.equals(default_gmail) && password.equals(default_password)){
                    Toast.makeText(view.getContext(),"Hore Berhasil Login" , Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(view.getContext(), Mulai.class);
                    i.putExtra("gmail", gmail);
                    startActivity(i);

                }else{

                    Toast.makeText(view.getContext(), "gmail or passwrod is wrong!", Toast.LENGTH_SHORT).show();

                }
            }
        });
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_register){

            i = new Intent(this, Register.class);
            startActivity(i);
        }
    }
}