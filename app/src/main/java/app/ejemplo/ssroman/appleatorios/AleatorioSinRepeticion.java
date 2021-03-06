package app.ejemplo.ssroman.appleatorios;

import android.content.Intent;
import android.net.Uri;
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

import com.example.ssroman.appleatorios.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class AleatorioSinRepeticion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleatorio_sin_repeticion);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    int n1, n2, rep;
    String serie;


    public void generarAleatorio2(View v) {
        EditText inicial2 = (EditText) findViewById(R.id.inicial2);
        EditText final2 = (EditText) findViewById(R.id.final2);
        EditText repeticiones2 = (EditText) findViewById(R.id.repeticiones2);
        TextView resultado2 = (TextView) findViewById(R.id.resultado2);
        resultado2.setText(" Números: ");

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
                resultado2.setText(resultado2.getText() + " " + serie + " ");
                resultado2.setVisibility(View.VISIBLE);
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
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=app.ejemplo.ssroman.appleatorios");
                startActivity(Intent.createChooser(intent, "Compartir con:"));
                break;
            case R.id.valorar:
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=app.ejemplo.ssroman.appleatorios")));
                } catch (android.content.ActivityNotFoundException anfe) {}
                break;
            case R.id.contacto:
                startActivity(new Intent(AleatorioSinRepeticion.this, EmailActivity.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(AleatorioSinRepeticion.this);
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

