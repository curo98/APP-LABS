package iberoplast.pe.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvresultado = findViewById(R.id.tvResultado);
        Bundle datos = getIntent().getExtras();

        int num1 = datos.getInt("val1");
        int num2 = datos.getInt("val2");

        String operaciones = datos.getString("operacion");

        switch (operaciones){
            case "Suma":
                int suma = num1 + num2;
                tvresultado.setText(num1+ " + " + num2 + " = " + suma);
                break;

            case "Resta":
                int resta = num1 - num2;
                tvresultado.setText(num1+ " - " + num2 + " = " + resta);
                break;

            case "Multiplicacion":
                int multiplicacion = num1 * num2;
                tvresultado.setText(num1+ " X " + num2 + " = " + multiplicacion);
                break;

            case "Division":
                int division = num1 / num2;
                tvresultado.setText(num1+ " / " + num2 + " = " + division);
                break;
        }
    }

    public void Retornar(View v){
        finish();
    }
}