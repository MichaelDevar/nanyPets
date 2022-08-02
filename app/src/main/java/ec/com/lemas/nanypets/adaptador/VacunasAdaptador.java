package ec.com.lemas.nanypets.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ec.com.lemas.nanypets.R;

public class VacunasAdaptador extends RecyclerView.Adapter<VacunasAdaptador.ViewHolder>{


    private List<String> lstItems;
    private Context _ctx;


    public void PartesAdapter(List<String> lstItems, Context cntxt){
        this.lstItems = lstItems;
        this._ctx = cntxt;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.vacuna_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView  tvFecha;
        private TextView  tvVacuna;
        private ImageView ivVacuna;
        private ImageView ivFirma;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tvFecha = (TextView) itemView.findViewById(R.id.tv_fecha);
            this.tvFecha = (TextView) itemView.findViewById(R.id.tv_vacuna);
            this.ivVacuna = (ImageView) itemView.findViewById(R.id.iv_fotoVacuna);
            this.ivFirma = (ImageView) itemView.findViewById(R.id.iv_fotoFirma);

        }
    }
}
