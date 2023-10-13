package iberoplast.pe.lab7_practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tvPrueba3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvPrueba3 = findViewById(R.id.tvPrueba3);
        registerForContextMenu(tvPrueba3);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_contextual, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.opcion1){
            tvPrueba3.setText("Etiqueta opcion 1 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opcion1){
            tvPrueba3.setText("Etiqueta opcion 1 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opcion2){
            tvPrueba3.setText("Etiqueta opcion 2 pulsada");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}