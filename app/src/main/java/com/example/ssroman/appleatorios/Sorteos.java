package com.example.ssroman.appleatorios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Sorteos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void generarSorteo (View v){
        String serie;
        EditText max = (EditText) findViewById(R.id.maximo);
        EditText premios = (EditText) findViewById(R.id.premios);
        EditText reintegro = (EditText) findViewById(R.id.edit_reintegro);
        EditText max_reintegro = (EditText) findViewById(R.id.maximo_reintegro);
        TextView resulSorteo = (TextView) findViewById(R.id.resultadoSorteo);
        TextView resulReintegro = (TextView) findViewById(R.id.resultadoReintegro);
        resulSorteo.setText("Números ganadores: ");
        resulReintegro.setText("Reintegros ganadores: ");

        int max1, premios1, reintegro1, maxReintegro;

        max1 = Integer.parseInt(max.getText().toString());
        premios1 = Integer.parseInt(premios.getText().toString());
        reintegro1 = Integer.parseInt(reintegro.getText().toString());
        maxReintegro = Integer.parseInt(max_reintegro.getText().toString());

        int i, j, k, l, m, n;
        int [] numeros = new int [premios1];
        int [] reintegroArray = new int [maxReintegro];

        //INTRODUCCION DE ALEATORIOS EN EL ARRAY DE PREMIOS Y COMPROBACION PARA EVITAR NUMEROS REPETIDOS
        if ((premios1 != 0) && (max1 > 1) && (premios1 < max1)) {
            numeros[0]=aleatorio(max1);
            for (i = 1; i < premios1; i++) {
                numeros[i]=aleatorio(max1);
                for (j=0; j<i; j++) {
                    if (numeros[i] == numeros[j]) {
                        i--;
                    }// fin if
                }// fin del jor j
            } // fin del for i

            // IMPRIMIR ELEMENTOS DEL ARRAY DE PREMIOS
            for (k=0; k < premios1; k++){
                serie = String.valueOf(numeros[k]);
                resulSorteo.setText(resulSorteo.getText() + " " + serie);
                resulSorteo.setVisibility(View.VISIBLE);
            }

            // EXCEPCIONES PREMIOS
        } else {
            Toast.makeText(this, "Asigna valor correcto al número máximo y de premios", Toast.LENGTH_LONG).show();
            max.setText("0");
            premios.setText("0");
        }

        //INTRODUCCION DE ALEATORIOS EN EL ARRAY DE REINTEGROS Y COMPROBACION PARA EVITAR NUMEROS REPETIDOS
        if (reintegro1!=0) {
            if ((maxReintegro >= 1) && (reintegro1 < maxReintegro)) {
                reintegroArray[0] = aleatorio(maxReintegro);
                for (l = 1; l < reintegro1; l++) {
                    reintegroArray[l] = aleatorio(maxReintegro);
                    for (m = 0; m < l; m++) {
                        if (reintegroArray[l] == reintegroArray[m]) {
                            l--;
                        }// fin if
                    }// fin del jor j
                } // fin del for i

                // IMPRIMIR ELEMENTOS DEL ARRAY DE REINTEGROS
                for (n = 0; n < reintegro1; n++) {
                    serie = String.valueOf(reintegroArray[n]);
                    resulReintegro.setText(resulReintegro.getText() + " " + serie);
                    resulReintegro.setVisibility(View.VISIBLE);
                }

                // EXCEPCIONES REINTEGROS
            } else {
                Toast.makeText(this, "Asigna valor correcto al número máximo y de reintegros", Toast.LENGTH_LONG).show();
                reintegro.setText("0");
                max_reintegro.setText("0");
            }
        }
    }

    public int aleatorio (int n){
        Random r = new Random();
        int dato = r.nextInt(n) + 1;
        return dato;

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
                startActivity(new Intent(Sorteos.this, EmailActivity.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(Sorteos.this);
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
