package ec.com.lemas.nanypets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import ec.com.lemas.nanypets.menuActivitys.MiGaleria;
import ec.com.lemas.nanypets.menuActivitys.MiVacuna;
import ec.com.lemas.nanypets.menuActivitys.miAlimentacion;
import ec.com.lemas.nanypets.menuActivitys.miMascota;
import ec.com.lemas.nanypets.menuActivitys.miOpinion;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ibPerfil;
    ImageView ibMascota;
    ImageView ibVacuna;
    ImageView ibAlimentacion;
    ImageView ibOpinion;
    ImageView ibAgenda;

    LinearLayout lytMiPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_menu_principal);
        lytMiPerfil = findViewById(R.id.lytMiPerfil);
        ibMascota= findViewById(R.id.ib_mascota);
        ibVacuna = findViewById(R.id.ib_vacuna);
        ibAlimentacion = findViewById(R.id.ib_alimentacion);
        ibOpinion = findViewById(R.id.ib_opinion);
        ibAgenda = findViewById(R.id.ib_agenda);

        ibAgenda.setOnClickListener(this);
        ibOpinion.setOnClickListener(this);
        ibVacuna.setOnClickListener(this);
        ibAlimentacion.setOnClickListener(this);
        ibMascota.setOnClickListener(this);

        lytMiPerfil.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lytMiPerfil:
                Intent _intent = new Intent(this, MiGaleria.class);
                startActivity(_intent);
                break;
        }
    }
}

