package iberoplast.pe.lab7_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {
    EditText txt1, txt2;
    RadioButton rb1, rb2, rb3, rb4;
    Button btnCalcular;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        txt1 = findViewById(R.id.txtNumero1);
        txt2 = findViewById(R.id.txtNumero2);
        rb1 = findViewById(R.id.rbSuma);
        rb2 = findViewById(R.id.rbResta);
        rb3 = findViewById(R.id.rbMult);
        rb4 = findViewById(R.id.rbDiv);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado=0;

                if (rb1.isChecked()){
                    resultado = Double.parseDouble(txt1.getText().toString()) + Double.parseDouble(txt2.getText().toString());
                }
                if (rb2.isChecked()){
                    resultado = Double.parseDouble(txt1.getText().toString()) - Double.parseDouble(txt2.getText().toString());
                }
                if (rb3.isChecked()){
                    resultado = Double.parseDouble(txt1.getText().toString()) * Double.parseDouble(txt2.getText().toString());
                }
                if (rb4.isChecked()){
                    resultado = Double.parseDouble(txt1.getText().toString()) / Double.parseDouble(txt2.getText().toString());
                }
                tvResultado.setText("El resultado es: " + resultado);
            }
        });



    }
}