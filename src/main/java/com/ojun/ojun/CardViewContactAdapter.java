package com.ojun.ojun;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class CardViewContactAdapter extends RecyclerView.Adapter<CardViewContactAdapter.CardViewViewHolder> {
    private ArrayList<Contact> contactList;
    private Context context;

    public CardViewContactAdapter(Context context){
        this.context = context;
    }
    public ArrayList<Contact> getContactList(){
        return contactList;
    }
    public void setContactList(ArrayList<Contact> contactList){
        this.contactList = contactList;
    }
    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item_ojunmen, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position){
        Contact c = getContactList().get(position);
        Glide.with(context).load(c.getPhoto()).override(350,550).into(holder.imgPhoto);
        holder.tvJudul.setText(c.getJudul());
        holder.tvName.setText(c.getName());
        holder.tvName.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback(){
            @Override
            public void onItemClicked(View view, int position){
                Toast.makeText(context, "Memesan Driver "+getContactList().get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context, OjunMenChat.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        }));
    }
    @Override
    public int getItemCount(){
        return getContactList().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvJudul;

        public CardViewViewHolder(View itemView){
            super(itemView);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            tvJudul = (TextView)itemView.findViewById(R.id.tv_item_judul);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
        }
    }
}
