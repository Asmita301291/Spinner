package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutocompleteTv extends AppCompatActivity {

    AutoCompleteTextView actv;
    String stringactv[] = {"Java", "CSS", "Html", "Android", "Kotlin", "Paython","AndroidKotlin","JavaAndroid","JAVA"};
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete_tv);
        actv=findViewById(R.id.autoco);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,stringactv);
        actv.setAdapter(adapter);

        actv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(AutocompleteTv.this,"Course is "+stringactv[i],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(AutocompleteTv.this,"Course Not selected ",Toast.LENGTH_SHORT).show();
            }
        });

       /* actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(AutocompleteTv.this,"Course is "+stringactv[i],Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}