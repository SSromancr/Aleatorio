package app.ejemplo.ssroman.appleatorios;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.ssroman.appleatorios.R;

public class EmailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        String[] TO = {"ssromancr84@gmail.com"}; //Direcciones email  a enviar.
        String[] CC = {""}; //Direcciones email con copia.

        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto...");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Texto"); // * configurar email aquí!

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email."));
            Log.i("EMAIL", "Enviando email...");
        }
        catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(this, "NO existe ningún cliente de email instalado!.", Toast.LENGTH_SHORT).show();
        }
    }

}
