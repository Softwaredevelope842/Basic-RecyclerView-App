package com.example.recyclerapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Random;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    ArrayList<ModelClass> userlist;
    Context context;

    public RecyclerAdapter(ArrayList<ModelClass> userlist, Context context) {
        this.userlist = userlist;
        this.context = context;
    }

    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
       // View view = LayoutInflater.from(context).inflate(R.layout.format, viewGroup, false);
        View view =LayoutInflater.from(context).inflate(R.layout.format,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);



        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder myViewHolder, int i) {

        ModelClass modelClass = userlist.get(i);
        myViewHolder.imageView.setImageResource(modelClass.getImageurl());
        myViewHolder.button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            }
        });
    }


    public int getItemCount() {
        return userlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        ImageView imageView;
        Button button;
        TextView textView;
        EditText editText;

        public MyViewHolder(View itemView) {
            super(itemView);

            relativeLayout = itemView.findViewById(R.id.relatively);
            imageView = itemView.findViewById(R.id.imageView3);
           textView=itemView.findViewById(R.id.textview);
editText=itemView.findViewById(R.id.edittext);
            button = itemView.findViewById(R.id.button);
        }
    }
}


