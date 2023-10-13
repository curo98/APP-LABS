package iberoplast.pe.lab7_practica;

import static iberoplast.pe.lab7_practica.R.menu.menu_en_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    TextView tvprueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvprueba= findViewById(R.id.tvprueba);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_en_activity, mimenu);
        return true;
    }

    public boolean onOptionItemsSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();
        if (id==R.id.config){
            Toast.makeText(this, "Configuracion", Toast.LENGTH_SHORT).show();
            tvprueba.setText("Menu configuracion");
            return true;
        }

        if (id==R.id.info){
            Toast.makeText(this, "Informacion", Toast.LENGTH_SHORT).show();
            tvprueba.setText("Menu informacion");
            return true;
        }
        return super.onContextItemSelected(opcion_menu);
    }
}