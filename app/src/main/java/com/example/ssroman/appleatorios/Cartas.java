package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Cartas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartas);

        Button B_Espanola = (Button) findViewById(R.id.button_BarajaEspanola);
        B_Espanola.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cartas.this, BarajaEspanola.class));
            }
        });

        Button B_Francesa = (Button) findViewById(R.id.button_BarajaFrancesa);
        B_Francesa.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cartas.this, BarajaFrancesa.class));
            }
        });

    }

}
