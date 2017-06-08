package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PiedraPapelTijera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedra_papel_tijera);

    }

    public void sacarMano (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenMano);
        TextView x=(TextView)findViewById(R.id.text_mano);
        Random r = new Random();
        int dato = r.nextInt(3) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.drawable.piedra);
                x.setText("PIEDRA");
                break;
            case 2:
                imagen.setImageResource(R.drawable.papel);
                x.setText("PAPEL");
                break;
            case 3:
                imagen.setImageResource(R.drawable.tijera);
                x.setText("TIJERA");
                break;
        }

    }

}
