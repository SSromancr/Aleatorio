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

public class Ruleta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruleta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void sacarNumRuleta (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenRuleta);
        TextView x=(TextView)findViewById(R.id.text_numRuleta);
        TextView serie=(TextView)findViewById(R.id.serieNumeros);
        Random r = new Random();
        int dato = r.nextInt(36) + 0;
        switch (dato){
            case 0:
                imagen.setImageResource(R.drawable.ruleta0);
                x.setText("");
                serie.setText(serie.getText() + "0 ");
                break;
            case 1:
                imagen.setImageResource(R.drawable.ruleta1);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "1 ");
                break;
            case 2:
                imagen.setImageResource(R.drawable.ruleta2);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "2 ");
                break;
            case 3:
                imagen.setImageResource(R.drawable.ruleta3);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "3 ");
                break;
            case 4:
                imagen.setImageResource(R.drawable.ruleta4);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "4 ");
                break;
            case 5:
                imagen.setImageResource(R.drawable.ruleta5);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "5 ");
                break;
            case 6:
                imagen.setImageResource(R.drawable.ruleta6);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "6 ");
                break;
            case 7:
                imagen.setImageResource(R.drawable.ruleta7);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "7 ");
                break;
            case 8:
                imagen.setImageResource(R.drawable.ruleta8);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "8 ");
                break;
            case 9:
                imagen.setImageResource(R.drawable.ruleta9);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "9 ");
                break;
            case 10:
                imagen.setImageResource(R.drawable.ruleta10);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "10 ");
                break;
            case 11:
                imagen.setImageResource(R.drawable.ruleta11);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "11 ");
                break;
            case 12:
                imagen.setImageResource(R.drawable.ruleta12);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "12 ");
                break;
            case 13:
                imagen.setImageResource(R.drawable.ruleta13);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "13 ");
                break;
            case 14:
                imagen.setImageResource(R.drawable.ruleta14);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "14 ");
                break;
            case 15:
                imagen.setImageResource(R.drawable.ruleta15);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "15 ");
                break;
            case 16:
                imagen.setImageResource(R.drawable.ruleta16);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "16 ");
                break;
            case 17:
                imagen.setImageResource(R.drawable.ruleta17);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "17 ");
                break;
            case 18:
                imagen.setImageResource(R.drawable.ruleta18);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "18 ");
                break;
            case 19:
                imagen.setImageResource(R.drawable.ruleta19);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "19 ");
                break;
            case 20:
                imagen.setImageResource(R.drawable.ruleta20);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "20 ");
                break;
            case 21:
                imagen.setImageResource(R.drawable.ruleta21);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "21 ");
                break;
            case 22:
                imagen.setImageResource(R.drawable.ruleta22);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "22 ");
                break;
            case 23:
                imagen.setImageResource(R.drawable.ruleta23);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "23 ");
                break;
            case 24:
                imagen.setImageResource(R.drawable.ruleta24);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "24 ");
                break;
            case 25:
                imagen.setImageResource(R.drawable.ruleta25);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "25 ");
                break;
            case 26:
                imagen.setImageResource(R.drawable.ruleta26);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "26 ");
                break;
            case 27:
                imagen.setImageResource(R.drawable.ruleta27);
                x.setText("Rojo, Impar");
                serie.setText(serie.getText() + "27 ");
                break;
            case 28:
                imagen.setImageResource(R.drawable.ruleta28);
                x.setText("Negro, Par");
                serie.setText(serie.getText() + "28 ");
                break;
            case 29:
                imagen.setImageResource(R.drawable.ruleta29);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "29 ");
                break;
            case 30:
                imagen.setImageResource(R.drawable.ruleta30);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "30 ");
                break;
            case 31:
                imagen.setImageResource(R.drawable.ruleta31);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "31 ");
                break;
            case 32:
                imagen.setImageResource(R.drawable.ruleta32);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "32 ");
                break;
            case 33:
                imagen.setImageResource(R.drawable.ruleta33);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "33 ");
                break;
            case 34:
                imagen.setImageResource(R.drawable.ruleta34);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "34 ");
                break;
            case 35:
                imagen.setImageResource(R.drawable.ruleta35);
                x.setText("Negro, Impar");
                serie.setText(serie.getText() + "35 ");
                break;
            case 36:
                imagen.setImageResource(R.drawable.ruleta36);
                x.setText("Rojo, Par");
                serie.setText(serie.getText() + "36 ");
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
                startActivity(new Intent(Ruleta.this, EmailActivity.class));
                break;
            case R.id.acerca:
                startActivity(new Intent(Ruleta.this, AcercaPopup.class));
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
