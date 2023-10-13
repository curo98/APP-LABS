package iberoplast.pe.lab7_practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tvPrueba3;

    ListView lvLista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvPrueba3 = findViewById(R.id.tvPrueba3);
        lvLista = findViewById(R.id.lvLista);
//        registerForContextMenu(tvPrueba3);
        // Cargamos lista con datos de ejemplo
        String[] datos = new String[]{"Ariana Montoya", "Leonardo Montoya",
                "Juan Diaz", "Rosa Perez", "Gabby Medina"};
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lvLista.setAdapter(adaptador);
        // Asociamos los menús contextuales a los controles
        registerForContextMenu(lvLista);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_lista, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.opc1){
            tvPrueba3.setText("Etiqueta: opcion 1 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opc2){
            tvPrueba3.setText("Etiqueta: opcion 2 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opc3){
            tvPrueba3.setText("Etiqueta: opcion 3 pulsada");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}