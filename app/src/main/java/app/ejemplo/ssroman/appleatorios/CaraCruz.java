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

public class CaraCruz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_cruz);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void lanzarMoneda (View v){
        ImageView imagen = (ImageView)findViewById(R.id.imagenMoneda);
        TextView x=(TextView)findViewById(R.id.text_caracruz);
        Random r = new Random();
        int dato = r.nextInt(2) + 1;
        switch (dato){
            case 1:
                imagen.setImageResource(R.drawable.monedacruz);
                x.setText("CRUZ");
                break;
            case 2:
                imagen.setImageResource(R.drawable.monedacara);
                x.setText("CARA");
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
                startActivity(new Intent(CaraCruz.this, EmailActivity.class));
                break;
            case R.id.acerca:
                AlertDialog.Builder emergente = new AlertDialog.Builder(CaraCruz.this);
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
