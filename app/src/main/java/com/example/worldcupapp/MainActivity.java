package com.example.worldcupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private CustomAdapter adapter;

    private ArrayList<CountryModelClass> dataModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        dataModel = new ArrayList<>();

        dataModel.add(new CountryModelClass("Germany", "4", R.drawable.germany));
        dataModel.add(new CountryModelClass("France", "2", R.drawable.france));
        dataModel.add(new CountryModelClass("Brazil", "5", R.drawable.brazil));
        dataModel.add(new CountryModelClass("Spain", "1", R.drawable.spain));
        dataModel.add(new CountryModelClass("England", "1", R.drawable.unitedkingdom));
        dataModel.add(new CountryModelClass("United States", "0", R.drawable.unitedstates));
        dataModel.add(new CountryModelClass("Saudi Arabia", "0", R.drawable.saudiarabia));

        adapter = new CustomAdapter(dataModel,getApplicationContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Country "+adapter.getItem(i).getCountry_name()+"\n" + "World Cups wins: "+adapter.getItem(i).getCup_win_count(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}