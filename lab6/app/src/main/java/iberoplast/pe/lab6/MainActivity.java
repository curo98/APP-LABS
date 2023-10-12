package iberoplast.pe.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    EditText etnum1, etnum2;
    Spinner spoper;
    Button btncal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnum1 = findViewById(R.id.etNumero1);
        etnum2 = findViewById(R.id.etNumero2);

        spoper = findViewById(R.id.spOperaciones);
        btncal = findViewById(R.id.btnCalcular);

        String[] operaciones = { "Suma", "Resta", "Multiplicacion", "Division"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operaciones);
        spoper.setAdapter(adaptador);

    }

    public void mostrarResultado(View v)
    {
        Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
        int val1 = Integer.parseInt(etnum1.getText().toString());
        int val2 = Integer.parseInt(etnum2.getText().toString());
        String operaciones = spoper.getSelectedItem().toString();


        intent.putExtra("val1", val1);
        intent.putExtra("val2", val2);
        intent.putExtra("operacion", operaciones);

        startActivity(intent);

    }
}