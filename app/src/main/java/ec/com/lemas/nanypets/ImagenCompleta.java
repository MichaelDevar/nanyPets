package ec.com.lemas.nanypets;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import ec.com.lemas.nanypets.adaptador.GaleriaFotosAdaptador;

public class ImagenCompleta extends AppCompatActivity {
    ImageView imageView;
    GaleriaFotosAdaptador galeriaFotosAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_completa);

        imageView =(ImageView)findViewById(R.id.iv_foto);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Foto Completa");


        Intent intent = getIntent();
        int posicion = intent.getExtras().getInt("imagenes");
        galeriaFotosAdaptador =  new GaleriaFotosAdaptador(this);
        imageView.setImageResource(galeriaFotosAdaptador.imageArray[posicion]);

    }
}