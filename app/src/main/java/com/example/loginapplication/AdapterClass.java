package com.example.loginapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.viewholder>{

    private ArrayList<ModelClass> userList;

    public AdapterClass(ArrayList<ModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public AdapterClass.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_template,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.viewholder holder, int position) {
          String name, town;
          int photo;
          name=userList.get(position).getName();
          town= userList.get(position).getTown();
          photo=userList.get(position).getPhoto();

          holder.tv_name.setText(name);
          holder.tv_town.setText(town);
          holder.img_user.setImageResource(photo);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        private TextView tv_name,tv_town;
        private CircleImageView img_user;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.textView1);
            tv_town=itemView.findViewById(R.id.tv_town);
            img_user=itemView.findViewById(R.id.circleImageView);
        }
    }
}
