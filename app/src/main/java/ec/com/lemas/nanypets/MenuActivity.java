package ec.com.lemas.nanypets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_menu_principal);
        ibPerfil  = findViewById(R.id.ib_Perfil);
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
        ibPerfil.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_Perfil:
                Intent intent = new Intent(MenuActivity.this, MiGaleria.class);
                startActivity(intent);
                break;
            case R.id.ib_mascota:
                Intent intent1 = new Intent(MenuActivity.this, miMascota.class);
                startActivity(intent1);
                break;
            case R.id.ib_vacuna:
                Intent intent2 = new Intent(MenuActivity.this, MiVacuna.class);
                startActivity(intent2);
                break;
            case R.id.ib_alimentacion:
                Intent intent3 = new Intent(MenuActivity.this, miAlimentacion.class);
                startActivity(intent3);
                break;
            case R.id.ib_agenda:
                Intent intent4 = new Intent(MenuActivity.this, miAgenda.class);
                startActivity(intent4);
                break;
            case R.id.ib_opinion:
                Intent intent5 = new Intent(MenuActivity.this, miOpinion.class);
                startActivity(intent5);
                break;


        }

    }
}

