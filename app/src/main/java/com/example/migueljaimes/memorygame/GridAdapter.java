package com.example.migueljaimes.memorygame;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends ArrayAdapter {

    Context context;
    int item_layout;
    List<Viajes> viajes;

    public GridAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.item_layout = resource;
        this.viajes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Inflar item layout
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(item_layout, parent, false);
        }

        // Obtener datos del Viaje
        int image = viajes.get(position).getImage();

        // Poner imagen de perfil
        ImageView profilePicture = convertView.findViewById(R.id.imagen_principal);
        profilePicture.setImageResource(image);

        return convertView;
    }

}
