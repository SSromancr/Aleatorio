package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class BarajaFrancesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baraja_francesa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void sacarCartaFra (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenCartaFra);
        TextView x=(TextView)findViewById(R.id.text_cartaFra);
        Random r = new Random();
        int dato = r.nextInt(52) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.drawable.corazonesas);
                x.setText("As de Corazones");
                break;
            case 2:
                imagen.setImageResource(R.drawable.corazones2);
                x.setText("2 de Corazones");
                break;
            case 3:
                imagen.setImageResource(R.drawable.corazones3);
                x.setText("3 de Corazones");
                break;
            case 4:
                imagen.setImageResource(R.drawable.corazones4);
                x.setText("4 de Corazones");
                break;
            case 5:
                imagen.setImageResource(R.drawable.corazones5);
                x.setText("5 de Corazones");
                break;
            case 6:
                imagen.setImageResource(R.drawable.corazones6);
                x.setText("6 de Corazones");
                break;
            case 7:
                imagen.setImageResource(R.drawable.corazones7);
                x.setText("7 de Corazones");
                break;
            case 8:
                imagen.setImageResource(R.drawable.corazones8);
                x.setText("8 de Corazones");
                break;
            case 9:
                imagen.setImageResource(R.drawable.corazones9);
                x.setText("9 de Corazones");
                break;
            case 10:
                imagen.setImageResource(R.drawable.corazones10);
                x.setText("10 de Corazones");
                break;
            case 11:
                imagen.setImageResource(R.drawable.corazonesjota);
                x.setText("Jota de Corazones");
                break;
            case 12:
                imagen.setImageResource(R.drawable.corazonesdama);
                x.setText("Dama de Corazones");
                break;
            case 13:
                imagen.setImageResource(R.drawable.corazonesrey);
                x.setText("Rey de Corazones");
                break;
            case 14:
                imagen.setImageResource(R.drawable.picasas);
                x.setText("As de Picas");
                break;
            case 15:
                imagen.setImageResource(R.drawable.picas2);
                x.setText("2 de Picas");
                break;
            case 16:
                imagen.setImageResource(R.drawable.picas3);
                x.setText("3 de Picas");
                break;
            case 17:
                imagen.setImageResource(R.drawable.picas4);
                x.setText("4 de Picas");
                break;
            case 18:
                imagen.setImageResource(R.drawable.picas5);
                x.setText("5 de Picas");
                break;
            case 19:
                imagen.setImageResource(R.drawable.picas6);
                x.setText("6 de Picas");
                break;
            case 20:
                imagen.setImageResource(R.drawable.picas7);
                x.setText("7 de Picas");
                break;
            case 21:
                imagen.setImageResource(R.drawable.picas8);
                x.setText("8 de Picas");
                break;
            case 22:
                imagen.setImageResource(R.drawable.picas9);
                x.setText("9 de Picas");
                break;
            case 23:
                imagen.setImageResource(R.drawable.picas10);
                x.setText("10 de Picas");
                break;
            case 24:
                imagen.setImageResource(R.drawable.picasjota);
                x.setText("Jota de Picas");
                break;
            case 25:
                imagen.setImageResource(R.drawable.picasdama);
                x.setText("Dama de Picas");
                break;
            case 26:
                imagen.setImageResource(R.drawable.picasrey);
                x.setText("Rey de Picas");
                break;
            case 27:
                imagen.setImageResource(R.drawable.diamantesas);
                x.setText("As de Diamantes");
                break;
            case 28:
                imagen.setImageResource(R.drawable.diamantes2);
                x.setText("2 de Diamantes");
                break;
            case 29:
                imagen.setImageResource(R.drawable.diamantes3);
                x.setText("3 de Diamantes");
                break;
            case 30:
                imagen.setImageResource(R.drawable.diamantes4);
                x.setText("4 de Diamantes");
                break;
            case 31:
                imagen.setImageResource(R.drawable.diamantes5);
                x.setText("5 de Diamantes");
                break;
            case 32:
                imagen.setImageResource(R.drawable.diamantes6);
                x.setText("6 de Diamantes");
                break;
            case 33:
                imagen.setImageResource(R.drawable.diamantes7);
                x.setText("7 de Diamantes");
                break;
            case 34:
                imagen.setImageResource(R.drawable.diamantes8);
                x.setText("8 de Diamantes");
                break;
            case 35:
                imagen.setImageResource(R.drawable.diamantes9);
                x.setText("9 de Diamantes");
                break;
            case 36:
                imagen.setImageResource(R.drawable.diamantes10);
                x.setText("10 de Diamantes");
                break;
            case 37:
                imagen.setImageResource(R.drawable.diamantesjota);
                x.setText("Jota de Diamantes");
                break;
            case 38:
                imagen.setImageResource(R.drawable.diamantesdama);
                x.setText("Dama de Diamantes");
                break;
            case 39:
                imagen.setImageResource(R.drawable.diamantesrey);
                x.setText("Rey de Diamantes");
                break;
            case 40:
                imagen.setImageResource(R.drawable.trebolas);
                x.setText("As de Tréboles");
                break;
            case 41:
                imagen.setImageResource(R.drawable.trebol2);
                x.setText("2 de Tréboles");
                break;
            case 42:
                imagen.setImageResource(R.drawable.trebol3);
                x.setText("3 de Tréboles");
                break;
            case 43:
                imagen.setImageResource(R.drawable.trebol4);
                x.setText("4 de Tréboles");
                break;
            case 44:
                imagen.setImageResource(R.drawable.trebol5);
                x.setText("5 de Tréboles");
                break;
            case 45:
                imagen.setImageResource(R.drawable.trebol6);
                x.setText("6 de Tréboles");
                break;
            case 46:
                imagen.setImageResource(R.drawable.trebol7);
                x.setText("7 de Tréboles");
                break;
            case 47:
                imagen.setImageResource(R.drawable.trebol8);
                x.setText("8 de Tréboles");
                break;
            case 48:
                imagen.setImageResource(R.drawable.trebol9);
                x.setText("9 de Tréboles");
                break;
            case 49:
                imagen.setImageResource(R.drawable.trebol10);
                x.setText("10 de Tréboles");
                break;
            case 50:
                imagen.setImageResource(R.drawable.treboljota);
                x.setText("Jota de Tréboles");
                break;
            case 51:
                imagen.setImageResource(R.drawable.treboldama);
                x.setText("Dama de Tréboles");
                break;
            case 52:
                imagen.setImageResource(R.drawable.trebolrey);
                x.setText("Rey de Tréboles");
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
                startActivity(new Intent(BarajaFrancesa.this, EmailActivity.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(BarajaFrancesa.this);
                View vista = getLayoutInflater().inflate(R.layout.activity_acerca_popup, null);
                emergente.setView(vista);
                AlertDialog dialogo = emergente.create();
                dialogo.show();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
