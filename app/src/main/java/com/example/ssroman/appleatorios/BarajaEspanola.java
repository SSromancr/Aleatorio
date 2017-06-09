package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class BarajaEspanola extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baraja_espanola);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void sacarCartaEsp (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenCartaEsp);
        TextView x=(TextView)findViewById(R.id.text_cartaEsp);
        Random r = new Random();
        int dato = r.nextInt(48) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.drawable.bastos1);
                x.setText("As de Bastos");
                break;
            case 2:
                imagen.setImageResource(R.drawable.bastos2);
                x.setText("2 de Bastos");
                break;
            case 3:
                imagen.setImageResource(R.drawable.bastos3);
                x.setText("3 de Bastos");
                break;
            case 4:
                imagen.setImageResource(R.drawable.bastos4);
                x.setText("4 de Bastos");
                break;
            case 5:
                imagen.setImageResource(R.drawable.bastos5);
                x.setText("5 de Bastos");
                break;
            case 6:
                imagen.setImageResource(R.drawable.bastos6);
                x.setText("6 de Bastos");
                break;
            case 7:
                imagen.setImageResource(R.drawable.bastos7);
                x.setText("7 de Bastos");
                break;
            case 8:
                imagen.setImageResource(R.drawable.bastos8);
                x.setText("8 de Bastos");
                break;
            case 9:
                imagen.setImageResource(R.drawable.bastos9);
                x.setText("9 de Bastos");
                break;
            case 10:
                imagen.setImageResource(R.drawable.sotabastos);
                x.setText("Sota de Bastos");
                break;
            case 11:
                imagen.setImageResource(R.drawable.caballobastos);
                x.setText("Caballo de Bastos");
                break;
            case 12:
                imagen.setImageResource(R.drawable.reybastos);
                x.setText("Rey de Bastos");
                break;
            case 13:
                imagen.setImageResource(R.drawable.copas1);
                x.setText("As de Copas");
                break;
            case 14:
                imagen.setImageResource(R.drawable.copas2);
                x.setText("2 de Copas");
                break;
            case 15:
                imagen.setImageResource(R.drawable.copas3);
                x.setText("3 de Copas");
                break;
            case 16:
                imagen.setImageResource(R.drawable.copas4);
                x.setText("4 de Copas");
                break;
            case 17:
                imagen.setImageResource(R.drawable.copas5);
                x.setText("5 de Copas");
                break;
            case 18:
                imagen.setImageResource(R.drawable.copas6);
                x.setText("6 de Copas");
                break;
            case 19:
                imagen.setImageResource(R.drawable.copas7);
                x.setText("7 de Copas");
                break;
            case 20:
                imagen.setImageResource(R.drawable.copas8);
                x.setText("8 de Copas");
                break;
            case 21:
                imagen.setImageResource(R.drawable.copas9);
                x.setText("9 de Copas");
                break;
            case 22:
                imagen.setImageResource(R.drawable.sotacopas);
                x.setText("Sota de Copas");
                break;
            case 23:
                imagen.setImageResource(R.drawable.caballocopas);
                x.setText("Caballo de Copas");
                break;
            case 24:
                imagen.setImageResource(R.drawable.reycopas);
                x.setText("Rey de Copas");
                break;
            case 25:
                imagen.setImageResource(R.drawable.espadas1);
                x.setText("As de Espadas");
                break;
            case 26:
                imagen.setImageResource(R.drawable.espadas2);
                x.setText("2 de Espadas");
                break;
            case 27:
                imagen.setImageResource(R.drawable.espadas3);
                x.setText("3 de Espadas");
                break;
            case 28:
                imagen.setImageResource(R.drawable.espadas4);
                x.setText("4 de Espadas");
                break;
            case 29:
                imagen.setImageResource(R.drawable.espadas5);
                x.setText("5 de Espadas");
                break;
            case 30:
                imagen.setImageResource(R.drawable.espadas6);
                x.setText("6 de Espadas");
                break;
            case 31:
                imagen.setImageResource(R.drawable.espadas7);
                x.setText("7 de Espadas");
                break;
            case 32:
                imagen.setImageResource(R.drawable.espadas8);
                x.setText("8 de Espadas");
                break;
            case 33:
                imagen.setImageResource(R.drawable.espadas9);
                x.setText("9 de Espadas");
                break;
            case 34:
                imagen.setImageResource(R.drawable.sotaespadas);
                x.setText("Sota de Espadas");
                break;
            case 35:
                imagen.setImageResource(R.drawable.caballoespadas);
                x.setText("Caballo de Espadas");
                break;
            case 36:
                imagen.setImageResource(R.drawable.reyespadas);
                x.setText("Rey de Espadas");
                break;
            case 37:
                imagen.setImageResource(R.drawable.oros1);
                x.setText("As de Oros");
                break;
            case 38:
                imagen.setImageResource(R.drawable.oros2);
                x.setText("2 de Oros");
                break;
            case 39:
                imagen.setImageResource(R.drawable.oros3);
                x.setText("3 de Oros");
                break;
            case 40:
                imagen.setImageResource(R.drawable.oros4);
                x.setText("4 de Oros");
                break;
            case 41:
                imagen.setImageResource(R.drawable.oros5);
                x.setText("5 de Oros");
                break;
            case 42:
                imagen.setImageResource(R.drawable.oros6);
                x.setText("6 de Oros");
                break;
            case 43:
                imagen.setImageResource(R.drawable.oros7);
                x.setText("7 de Oros");
                break;
            case 44:
                imagen.setImageResource(R.drawable.oros8);
                x.setText("8 de Oros");
                break;
            case 45:
                imagen.setImageResource(R.drawable.oros9);
                x.setText("9 de Oros");
                break;
            case 46:
                imagen.setImageResource(R.drawable.sotaoros);
                x.setText("Sota de Oros");
                break;
            case 47:
                imagen.setImageResource(R.drawable.caballooros);
                x.setText("Caballo de Oros");
                break;
            case 48:
                imagen.setImageResource(R.drawable.reyoros);
                x.setText("Rey de Oros");
                break;
        }

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
                startActivity(new Intent(BarajaEspanola.this, EmailActivity.class));
                break;
            case R.id.acerca:
                startActivity(new Intent(BarajaEspanola.this, AcercaPopup.class));
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
