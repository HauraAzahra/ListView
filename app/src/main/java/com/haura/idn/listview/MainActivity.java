package com.haura.idn.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    ListView listView;
    String judul [] = {
            "Apple", "Banana", "Grape", "Mango", "Orange", "Watermelon"
    };

    String deskripsi [] = {
            "Deskripsi Apple","Deskripsi Banana", "Deskripsi Grape",
            "Deskripsi Mango","Deskripsi Orange", "Deskripsi Watermelon"
    };

    int gambar [] = {
            R.drawable.apple,R.drawable.banana,R.drawable.grape,
            R.drawable.mango,R.drawable.orange,R.drawable.watermelon

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        AdapterList adapterList = new AdapterList(this,judul,deskripsi,gambar);
        listView.setAdapter(adapterList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Kamu Memilih :"+judul[i], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
