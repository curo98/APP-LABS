package iberoplast.pe.lab7_practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView tvPrueba3;

    ListView lvLista;
    Button btnSalir;
    Button btnIdioma;
    Button btnIdiomaRb;
    Button btnIdiomaCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvPrueba3 = findViewById(R.id.tvPrueba3);
        lvLista = findViewById(R.id.lvLista);

        btnSalir = findViewById(R.id.btnSalir);
        btnIdioma = findViewById(R.id.btnIdioma);
        btnIdiomaRb = findViewById(R.id.btnIdiomaRb);
        btnIdiomaCS = findViewById(R.id.btnIdiomaCS);

//        registerForContextMenu(tvPrueba3);
        // Cargamos lista con datos de ejemplo
        String[] datos = new String[]{"Ariana Montoya", "Leonardo Montoya",
                "Juan Diaz", "Rosa Perez", "Gabby Medina"};
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        lvLista.setAdapter(adaptador);
        // Asociamos los menús contextuales a los controles
        registerForContextMenu(lvLista);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity3.this);
                alerta.setMessage("¿Desea salir de la aplicación?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Salida");
                titulo.show();
            }
        });

        btnIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] items = {"Español", "Inglés", "Francés"};
                AlertDialog.Builder consulta = new AlertDialog.Builder(MainActivity3.this);
                consulta.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i("Dialogo","El idioma que más dominas es: " + items[which]);
                        Toast.makeText( getApplicationContext(), "El idioma que más dominas es: " +
                                items[which], Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog titulo = consulta.create();
                titulo.setTitle("Selecciona el idioma que más dominas");
                titulo.show();
            }
        });

        btnIdiomaRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] itemsRb = {"Español", "Inglés", "Francés"};
                AlertDialog.Builder consultaRb = new AlertDialog.Builder(MainActivity3.this);
                consultaRb.setSingleChoiceItems(itemsRb, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText( getApplicationContext(), "El idioma que más dominas es: " +
                                itemsRb[which], Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog titulo = consultaRb.create();
                titulo.setTitle("Selecciona el idioma que más dominas");
                titulo.show();
            }
        });

        btnIdiomaCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] itemsCs = {"Español", "Inglés", "Francés"};
                AlertDialog.Builder consultaCs = new AlertDialog.Builder(MainActivity3.this);
                consultaCs.setMultiChoiceItems(itemsCs, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        Log.i("Dialogo", "Opción Elegida: "+itemsCs[which]);
                        Toast.makeText( getApplicationContext(), "Idiomas: " +
                                itemsCs[which], Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog titulo = consultaCs.create();
                titulo.setTitle("Selecciona el idioma que más dominas");
                titulo.show();
            }
        });

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