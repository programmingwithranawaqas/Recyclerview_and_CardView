package com.wtechweb.v1recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        data = new ArrayList<Person>();
        data.add(new Person("Ali", "Raza" ,"plane"));
        data.add(new Person("Ali", "Raza" ,"bus"));
        data.add(new Person("Muhammad", "Raza" ,"plane"));
        data.add(new Person("Jawab", "Raza" ,"bus"));
        data.add(new Person("Wali", "Raza" ,"plane"));
        data.add(new Person("Aurangzaib", "Raza" ,"bus"));
        data.add(new Person("Khalid", "Raza" ,"plane"));

        myAdapter = new PersonAdapter(this, data);

        recyclerView.setAdapter(myAdapter);
    }
}