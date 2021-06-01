package com.example.fragments_comm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MailHolder>{
    ArrayList<DataObject> data;
    //Context context;
    final  int VIEW_TYPE=1;
    final  int VIEW_LOADING=0;

    public Adapter(ArrayList<DataObject> data) {
        this.data=data;
    }

    @NonNull
    @Override
    public MailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.second_row,parent,false);
        return new MailHolder(view);}



    @Override
    public void onBindViewHolder(@NonNull MailHolder holder, int position) {


        DataObject model=data.get(position);
        holder.vContent.setText(model.getText());
        holder.vSender.setText(model.getSender());
        holder.vSubject.setText(model.getSubject());
        holder.rs.setImageResource(model.getResid());
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MailHolder extends RecyclerView.ViewHolder {
        TextView vSender,vContent,vSubject;
        ImageView rs;
        public MailHolder(@NonNull View itemView) {
            super(itemView);
            vSender=itemView.findViewById(R.id.vSender);
            vContent=itemView.findViewById(R.id.vContent);
            vSubject=itemView.findViewById(R.id.vSubject);
            rs=itemView.findViewById(R.id.image1);

        }
    }

}
