package com.haura.idn.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterList extends ArrayAdapter {
    private final Activity activity;
    private final String[] judulBuah;
    private final String[] deskripsiBuah;
    private final int[] gambarBuah;


    public AdapterList (Activity activity,String[] judulBuah, String[] deskripsiBuah, int[] gambarBuah){
        super(activity,R.layout.list_item,judulBuah);
        this.activity = activity;
        this.judulBuah = judulBuah;
        this.deskripsiBuah = deskripsiBuah;
        this.gambarBuah = gambarBuah;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.list_item,null,true);

        TextView txtJudul = view.findViewById(R.id.judul_item);
        TextView txtDeskripsi = view.findViewById(R.id.deskripsi_item);
        ImageView imgBuah = view.findViewById(R.id.image_item);

        txtJudul.setText(judulBuah[position]);
        txtDeskripsi.setText(deskripsiBuah[position]);
        imgBuah.setImageResource(gambarBuah[position]);

        return view;

    }
}
