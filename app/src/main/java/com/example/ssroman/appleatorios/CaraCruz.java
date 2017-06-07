package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CaraCruz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);

    }

    public void lanzarMoneda (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenMoneda);
        TextView x=(TextView)findViewById(R.id.text_caracruz);
        Random r = new Random();
        int dato = r.nextInt(2) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.mipmap.monedacruzok);
                x.setText("CRUZ");
                break;
            case 2:
                imagen.setImageResource(R.mipmap.monedacaraok);
                x.setText("CARA");
                break;
        }

    }
}
