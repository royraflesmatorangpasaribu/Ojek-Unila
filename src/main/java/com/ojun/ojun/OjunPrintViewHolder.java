package com.ojun.ojun;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class OjunPrintViewHolder extends RecyclerView.ViewHolder {

    ImageView img_fc;
    TextView name_fc, desc_fc, disc_fc;

    RelativeLayout card_fc;

    public OjunPrintViewHolder(@NonNull View itemView) {
        super(itemView);

        img_fc = itemView.findViewById(R.id.img_fc);
        name_fc = itemView.findViewById(R.id.name_fc);
        desc_fc = itemView.findViewById(R.id.desc_fc);
        disc_fc = itemView.findViewById(R.id.disc_fc);
        card_fc = itemView.findViewById(R.id.card);

    }

}
