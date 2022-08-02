package ec.com.lemas.nanypets.menuActivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import ec.com.lemas.nanypets.ImagenCompleta;
import ec.com.lemas.nanypets.R;
import ec.com.lemas.nanypets.adaptador.GaleriaFotosAdaptador;

public class MiGaleria extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_galeria);
        gridView = (GridView)findViewById(R.id.gv_migaleria);
        gridView.setAdapter(new GaleriaFotosAdaptador(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ImagenCompleta.class);
                intent.putExtra("misImagenes", position);
                startActivity(intent);
            }
        });
    }
}