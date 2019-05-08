package com.naman.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] myDataset = {"Apple","Blackberrry","Cisco","Deloitte","Epson","Honda","Internet","Java","Kingston"};

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        mAdapter = new myAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);

    }

}
