package com.rodhian.wisatariau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView gambarWisata = findViewById(R.id.gambarWisata);
        TextView item_name = findViewById(R.id.item_name);
        TextView item_detail = findViewById(R.id.item_detail);

        Wisata wisata = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(wisata != null){
            Glide.with(this)
                    .load(wisata.getPhoto())
                    .into(gambarWisata);
            item_name.setText(wisata.getNames());
            item_detail.setText(wisata.getDetail());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Wisata");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}