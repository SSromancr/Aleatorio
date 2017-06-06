package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class AleatorioConRepeticion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio_con_repeticion);

    }

    int n1, n2, rep;
    String serie;

    public void generarAleatorio1(View v){
        EditText inicial1  = (EditText)findViewById(R.id.inicial1);
        EditText final1 = (EditText)findViewById(R.id.final1);
        EditText repeticiones1 = (EditText)findViewById(R.id.repeticiones1);
        TextView resultado1 = (TextView)findViewById(R.id.resultado1);
        resultado1.setText("");
        n1 = Integer.parseInt(inicial1.getText().toString());
        n2 = Integer.parseInt(final1.getText().toString());
        rep = Integer.parseInt(repeticiones1.getText().toString());

            if ((rep!=0)&&(n2>n1)){
                int limite = 1;
                Random r = new Random();
                do {
                    int dato = r.nextInt(n2-n1) + n1;
                    serie = String.valueOf(dato);
                    resultado1.setText(serie + ", " + resultado1.getText());
                    limite++;
                } while (limite <= rep); //Numero de veces que genera un aleatorio con el contador limite
            }else{
            Toast.makeText(this, "Asigna valor correcto a los operadores", Toast.LENGTH_LONG).show();
            inicial1.setText("0");
            final1.setText("0");
            repeticiones1.setText("0");
            }
    }
}
