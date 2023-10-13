package iberoplast.pe.lab7_practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static final int MNU_OPC1= 1;
    private static final int MNU_OPC2= 2;
    private static final int SMNU_OPC1= 31;
    private static final int SMNU_OPC2= 32;

    TextView tvPrueba2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvPrueba2 = findViewById(R.id.tvPrueba2);
        registerForContextMenu(tvPrueba2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_etiqueta, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.opc1){
            tvPrueba2.setText("Etiqueta opcion 1 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opc1){
            tvPrueba2.setText("Etiqueta opcion 1 pulsada");
            return true;
        }

        if (item.getItemId() == R.id.opc2){
            tvPrueba2.setText("Etiqueta opcion 2 pulsada");
            return true;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(Menu.NONE, MNU_OPC1, Menu.NONE, "OPCION 1").setIcon(android.R.drawable.ic_menu_preferences);
        menu.add(Menu.NONE, MNU_OPC2, Menu.NONE, "OPCION 2").setIcon(android.R.drawable.ic_menu_compass);

        SubMenu smnu = menu.addSubMenu(Menu.NONE, MNU_OPC1, Menu.NONE, "OPCION 3").setIcon(android.R.drawable.ic_menu_agenda);
        smnu.add(Menu.NONE, SMNU_OPC1, Menu.NONE, "Opcion 3.1");
        smnu.add(Menu.NONE, SMNU_OPC2, menu.NONE, "Opcion 3.2");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case MNU_OPC1:
                tvPrueba2.setText("Opcion 1 pulsada!");
                return true;
            case MNU_OPC2:
                tvPrueba2.setText("Opcion 2 pulsada!");
                return true;
            case SMNU_OPC1:
                tvPrueba2.setText("Opcion 3.1 pulsada!");
                return true;
            case SMNU_OPC2:
                tvPrueba2.setText("Opcion 3.2 pulsada!");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}