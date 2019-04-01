package com.example.migueljaimes.memorygame;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class GameMemory extends AppCompatActivity {

    ArrayList<Viajes> mosaico;
    ArrayList<Viajes> viajes;
    GridView list;
    GridView lista;
    GridAdapter adapter;
    GridAdapter adapter2;
    int prueba = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_memory);

        mosaico = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            mosaico.add(new Viajes(R.drawable.mandala));
        }


        list = (GridView) findViewById(R.id.am_gv_gridview);
        adapter = new GridAdapter(this, R.layout.item_grid, mosaico);
        list.setAdapter(adapter);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mosaico.remove(position);
                adapter.notifyDataSetChanged();
            }
        });


    }

}
