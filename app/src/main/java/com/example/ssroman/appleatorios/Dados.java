package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

    }

    public void tirarDado (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenDado);
        TextView x=(TextView)findViewById(R.id.text_dado);
        Random r = new Random();
        int dato = r.nextInt(6) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.drawable.dadoface1);
                x.setText("UNO (1)");
                break;
            case 2:
                imagen.setImageResource(R.drawable.dadodace2);
                x.setText("DOS (2)");
                break;
            case 3:
                imagen.setImageResource(R.drawable.dadoface3);
                x.setText("TRES (3)");
                break;
            case 4:
                imagen.setImageResource(R.drawable.dadoface4);
                x.setText("CUATRO (4)");
                break;
            case 5:
                imagen.setImageResource(R.drawable.dadoface5);
                x.setText("CINCO (5)");
                break;
            case 6:
                imagen.setImageResource(R.drawable.dadodace6);
                x.setText("SEIS (6)");
                break;
        }

    }
}
