package com.example.turismocolombia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.turismocolombia.Model.LugarT;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TuristicAdapter extends RecyclerView.Adapter<TuristicAdapter.LugartViewHolder> {
    List<LugarT> lugart;

    public TuristicAdapter(List<LugarT> lugart){
        this.lugart = lugart;
    }

    @Override
    public int getItemCount() {
        return lugart.size();
    }

    @Override
    public LugartViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        LugartViewHolder rvh = new LugartViewHolder(v);
        return rvh;
    }

    @Override
    public void onBindViewHolder(LugartViewHolder LugartViewHolder, int i) {
        LugartViewHolder.sitios_turisticos.setText(lugart.get(i).getSitios_turisticos());
        LugartViewHolder.ubicacion.setText(lugart.get(i).getUbicacion());
        LugartViewHolder.descripci_n.setText(lugart.get(i).getDescripci_n());
        String url = "https://www.datos.gov.co/views/yf8m-7cq5/files/"+lugart.get(i).getImagen();
        Picasso.get()
                .load(url)
                .into(LugartViewHolder.imagen);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class LugartViewHolder extends RecyclerView.ViewHolder {
        TextView sitios_turisticos;
        TextView ubicacion;
        TextView descripci_n;
        ImageView imagen;

        LugartViewHolder(View itemView) {
            super(itemView);
            sitios_turisticos = itemView.findViewById(R.id.nombre);
            ubicacion = itemView.findViewById(R.id.lugar);
            descripci_n = itemView.findViewById(R.id.detalle);
            imagen = itemView.findViewById(R.id.imageViewAll);
        }
    }

}
