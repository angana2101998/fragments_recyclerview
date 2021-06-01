package com.example.fragments_comm;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments_comm.R;
import com.example.fragments_comm.RecipeModel;

import java.util.ArrayList;

public class PageAdapter2 extends RecyclerView.Adapter<PageAdapter2.ViewHolderOne>{
    ArrayList<RecipeModel>list;
    //Context context;

    public PageAdapter2(ArrayList<RecipeModel> list) {
        this.list = list;
        //this.context = context;
    }


    @NonNull
    @Override
    public ViewHolderOne onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singlw_row,parent,false);
        return new ViewHolderOne(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderOne holder, int position) {
        RecipeModel model=list.get(position);
        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolderOne extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView2);
        }
    }

}
