package com.example.recyclerapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ModelClass>userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView= findViewById(R.id.recyclerView);
       userlist = new ArrayList<>();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2,
                RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

       // userlist.add(new ModelClass("Rahul",R.drawable.a,20));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,21));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,22));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,23));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,24));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,25));
        userlist.add(new  ModelClass("Shivani",R.drawable.mussicc,26));
        RecyclerAdapter recyclerAdapter= new RecyclerAdapter(userlist, getApplicationContext());
        recyclerView.setAdapter(recyclerAdapter);
    }
}

