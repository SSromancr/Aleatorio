package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Cartas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.compartir:
                break;
            case R.id.valorar:
                break;
            case R.id.contacto:
                startActivity(new Intent(Cartas.this, EmailActivity.class));
                break;
            case R.id.acerca:
                startActivity(new Intent(Cartas.this, AcercaPopup.class));
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
