package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class OjunMenAct extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerView;

    private ImageView panah;
    private ArrayList<Contact> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_men);

        panah = (ImageView) findViewById(R.id.panah);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ContactData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewContactAdapter cardViewContactAdapter= new CardViewContactAdapter(this);
        cardViewContactAdapter.setContactList(list);
        recyclerView.setAdapter(cardViewContactAdapter);

        panah.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.panah){
            i = new Intent(this, Menu.class);
            startActivity(i);
        }
    }
}