package com.ojun.ojun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OjunPrint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ojun_print);

        RecyclerView recyclerView = findViewById(R.id.recylerview);

        List<ItemPhotocopy> items = new ArrayList<ItemPhotocopy>();
        items.add(new ItemPhotocopy("Fotocopy Cahaya", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp1));
        items.add(new ItemPhotocopy("Fotocopy Bintang", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp2));
        items.add(new ItemPhotocopy("Fotocopy Jaya", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp3));
        items.add(new ItemPhotocopy("Fotocopy 24 Jam", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp4));
        items.add(new ItemPhotocopy("Fotocopy Tujuan Kita", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp5));
        items.add(new ItemPhotocopy("Fotocopy Cahaya", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp6));
        items.add(new ItemPhotocopy("Fotocopy Bintang", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp1));
        items.add(new ItemPhotocopy("Fotocopy Jaya", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp2));
        items.add(new ItemPhotocopy("Fotocopy 24 Jam", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp3));
        items.add(new ItemPhotocopy("Fotocopy Tujuan Kita", "Print skirpsi, laporan, tugas, laprak", "Diskon ongkir s.d 6rb", R.drawable.fcp4));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new OjunPrintAdapter(getApplicationContext(), items));


    }
}