package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BOTONES DEL MENU PRINCIPAL

        Button B_Aleatorio = (Button) findViewById(R.id.button_Aleatorio);
        B_Aleatorio.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Aleatorio.class));
            }
        });

        Button B_CaraCruz = (Button) findViewById(R.id.button_CaraCruz);
        B_CaraCruz.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CaraCruz.class));
            }
        });

        Button B_PiedraPapelTijera = (Button) findViewById(R.id.button_PiedraPapelTijera);
        B_PiedraPapelTijera.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PiedraPapelTijera.class));
            }
        });

        Button B_Dados = (Button) findViewById(R.id.button_Dados);
        B_Dados.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dados.class));
            }
        });

        Button B_Ruleta = (Button) findViewById(R.id.button_Ruleta);
        B_Ruleta.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ruleta.class));
            }
        });

        Button B_Cartas = (Button) findViewById(R.id.button_Cartas);
        B_Cartas.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cartas.class));
            }
        });

        Button B_Sorteos = (Button) findViewById(R.id.button_Sorteos);
        B_Sorteos.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sorteos.class));
            }
        });

        Button B_Password = (Button) findViewById(R.id.button_Password);
        B_Password.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Password.class));
            }
        });
    }
}
