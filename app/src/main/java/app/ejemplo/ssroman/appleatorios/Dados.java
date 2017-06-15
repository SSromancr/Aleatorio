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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ssroman.appleatorios.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class Dados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
        x.setVisibility(View.VISIBLE);

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
                startActivity(new Intent(Dados.this, EmailActivity.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(Dados.this);
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
