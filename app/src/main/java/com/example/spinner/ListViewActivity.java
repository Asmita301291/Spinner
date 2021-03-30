package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    ListView list;
    String stringlist[] = {"Java", "CSS", "Html", "Android", "Kotlin", "Paython"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        list=findViewById(R.id.list1);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,stringlist);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,"Course is "+stringlist[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}