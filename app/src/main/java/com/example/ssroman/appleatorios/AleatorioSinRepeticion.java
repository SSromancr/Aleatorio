package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AleatorioSinRepeticion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio_sin_repeticion);

    }
    int n1, n2, rep;
    String serie;


    public void generarAleatorio2(View v) {
        EditText inicial2 = (EditText) findViewById(R.id.inicial2);
        EditText final2 = (EditText) findViewById(R.id.final2);
        EditText repeticiones2 = (EditText) findViewById(R.id.repeticiones2);
        TextView resultado2 = (TextView) findViewById(R.id.resultado2);
        resultado2.setText("");

        n1 = Integer.parseInt(inicial2.getText().toString());
        n2 = Integer.parseInt(final2.getText().toString());
        rep = Integer.parseInt(repeticiones2.getText().toString());

        int i, j, k, rango;
        rango = n2-n1;
        int [] numeros = new int [rep];

        //INTRODUCCION DE ALEATORIOS EN EL ARRAY Y COMPROBACION PARA EVITAR NUMEROS REPETIDOS
        if ((rep < rango) && (rep != 0) && (n2 > n1)) {
            numeros[0]=aleatorio(n1, n2);
            for (i = 1; i < rep; i++) {
                numeros[i]=aleatorio(n1, n2);
                for (j=0; j<i; j++) {
                     if (numeros[i] == numeros[j]) {
                        i--;
                    }// fin if
                }// fin del jor j
            } // fin del for i

            // IMPRIMIR ELEMENTOS DEL ARRAY
            for (k=0; k < rep; k++){
                serie = String.valueOf(numeros[k]);
                resultado2.setText(serie + ", " + resultado2.getText());
            }

            // EXCEPCIONES
            } else {
            Toast.makeText(this, "Asigna valor correcto a los operadores", Toast.LENGTH_LONG).show();
            inicial2.setText("0");
            final2.setText("0");
            repeticiones2.setText("0");
        }
    }

    public int aleatorio (int n1, int n2){
        Random r = new Random();
            int dato = r.nextInt(n2-n1) + n1;
            return dato;

    }
}

