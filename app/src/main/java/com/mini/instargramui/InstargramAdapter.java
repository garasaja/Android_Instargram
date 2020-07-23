package com.mini.instargramui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InstargramAdapter extends RecyclerView.Adapter<InstargramAdapter.MyViewHolder> {

    private List<Instargram> items = new ArrayList<>();

    public void addItem(Instargram instargram) {
        items.add(instargram);
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_content,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Instargram instargram = items.get(position);
        holder.setItem(instargram);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView personName;
        private ImageView image1,mainImage,image2,image3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            personName = itemView.findViewById(R.id.tv_person_name);
            image1 = itemView.findViewById(R.id.iv_image1);
            image2 = itemView.findViewById(R.id.iv_image2);
            image3 = itemView.findViewById(R.id.iv_image3);
            mainImage = itemView.findViewById(R.id.iv_main);
        }

        public void setItem(Instargram instargram) {
            image1.setImageResource(instargram.getImage1());
            image2.setImageResource(instargram.getImage2());
            image3.setImageResource(instargram.getImage3());
            mainImage.setImageResource(instargram.getImage4());

        }
    }
}
