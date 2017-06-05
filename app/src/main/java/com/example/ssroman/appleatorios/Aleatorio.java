package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Aleatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio);

        Button ConRepeticion = (Button) findViewById(R.id.button_ConRepeticion);
        ConRepeticion.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Aleatorio.this, AleatorioConRepeticion.class));
            }
        });

        Button SinRepeticion = (Button) findViewById(R.id.button_SinRepeticion);
        SinRepeticion.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(Aleatorio.this, AleatorioSinRepeticion.class));
            }
        });
    }

}
