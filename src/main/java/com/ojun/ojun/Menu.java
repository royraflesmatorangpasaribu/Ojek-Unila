package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity implements View.OnClickListener{
    ImageButton ojunride, ojunprint, ojunmen, ojunhelp;
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ojunmen = (ImageButton) findViewById(R.id.imageView6);
        ojunride = (ImageButton) findViewById(R.id.imageView7);
        ojunprint = (ImageButton) findViewById(R.id.imageView8);
        ojunhelp = (ImageButton) findViewById(R.id.imageView9);

        ImageView btn_side_bar = findViewById(R.id.imageView5);
        drawerLayout = findViewById(R.id.drawer_layout);

        Intent i = getIntent();
        String gmail = i.getStringExtra("gmail");
        TextView gmail_text = findViewById(R.id.gmail);
        gmail_text.setText(gmail);

        Button btn_logout = findViewById(R.id.btn_logout);

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), MainActivity.class);
                startActivity(i);
            }
        });

        btn_side_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        ojunprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), OjunPrintCov.class);
                startActivity(i);
            }
        });
        ojunmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), OjunMenCov.class);
                startActivity(i);
            }
        });

        ojunhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/+6282282419941"));
                startActivity(i);
            }
        });

        ojunride.setOnClickListener(this);

    }

    @Override
    protected void onPause(){

        super.onPause();
        closeDrawer(drawerLayout);

    }

    private void closeDrawer(DrawerLayout drawerLayout) {
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.imageView7){
            i = new Intent(this, OjunRideCov.class);
            startActivity(i);
        }
    }
}