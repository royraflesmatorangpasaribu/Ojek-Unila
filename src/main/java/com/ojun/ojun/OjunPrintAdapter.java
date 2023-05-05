package com.ojun.ojun;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OjunPrintAdapter extends RecyclerView.Adapter<OjunPrintViewHolder> {

    Context context;
    List<ItemPhotocopy> items;

    public OjunPrintAdapter(Context context, List<ItemPhotocopy> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public OjunPrintViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OjunPrintViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view_ojun_print,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull OjunPrintViewHolder holder, int position) {
        holder.name_fc.setText(items.get(position).getNamaPhotoCopy());
        holder.desc_fc.setText(items.get(position).getDeskripsiPhotoCopy());
        holder.disc_fc.setText(items.get(position).getDiskonPhotoCopy());
        holder.img_fc.setImageResource(items.get(position).getImg());

        holder.card_fc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, OjunPrintMenu.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
