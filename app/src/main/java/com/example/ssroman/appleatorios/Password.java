package com.example.ssroman.appleatorios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

    }

    public void generarPw (View v){
        EditText num_carac = (EditText)findViewById(R.id.maximopw);
        TextView pw = (TextView)findViewById(R.id.resultadopw);
        pw.setText("Contraseña: ");
        int maximo = Integer.parseInt(num_carac.getText().toString());
        int i;
        char[] caracteres;
        char letra;
        String pwd;
        caracteres = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if (maximo>0) {
            for (i = 0; i < maximo; i++) {
                letra = caracteres[new Random().nextInt(62)];
                pwd = new String(String.valueOf(letra));
                pw.setText(pw.getText() + pwd);
                pw.setVisibility(View.VISIBLE);
            }
        }else{
            Toast.makeText(this, "Asigna valor al número de caracteres", Toast.LENGTH_LONG).show();
        }
    }

}
