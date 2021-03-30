package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Course is "+stringvalues[i],Toast.LENGTH_SHORT).show();
            }
        });*/

    }
    public void openSpinnerActivity(View view) {
        Intent intent = new Intent(MainActivity.this, Spinner.class);
        startActivity(intent);
    }

    public void openAutocomplete(View view) {
        Intent intent = new Intent(MainActivity.this, AutocompleteTv.class);
        startActivity(intent);
    }

    public void openList(View view) {
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }
}