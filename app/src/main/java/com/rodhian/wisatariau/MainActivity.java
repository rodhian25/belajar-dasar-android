package com.rodhian.wisatariau;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private  ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getlistData());
        showRecyclerList();
    }

    private  void showRecyclerList(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        ListWisata listWisata = new ListWisata(list);
        rvWisata.setAdapter(listWisata);

        listWisata.setOnItemClickCallback(new ListWisata.OnItemClickCallback(){
            @Override
            public void onItemClicked(Wisata wisata){
                Intent moveIntent = new Intent(MainActivity.this, DetailActivity.class);
                moveIntent.putExtra(DetailActivity.ITEM_EXTRA, wisata);
                startActivity(moveIntent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu); //inflate our menu
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.btn_about:

            Intent about = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(about);
                return true;
            default:
                return true;
        }
    }

}