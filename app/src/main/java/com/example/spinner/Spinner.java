package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class Spinner extends AppCompatActivity {

    android.widget.Spinner spinner;
    Button button;
    String stringvalues[] = {"Java", "CSS", "Html", "Android", "Kotlin", "Paython"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner = findViewById(R.id.spin);
        button = findViewById(R.id.btn);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stringvalues);
        spinner.setAdapter(adapter);
        /*spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Spinner.this,"Course is "+stringvalues[i],Toast.LENGTH_SHORT).show();
            }
        });*/
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Spinner.this,"Course is "+stringvalues[i],Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(Spinner.this,"You have not select any item",Toast.LENGTH_SHORT).show();
            }
        });

    }
}