package iberoplast.pe.lab7_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtNota1, txtNota2, txtNota3, txtNota4;
    TextView tvPromedio;
    Button btnProcesar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtNota3 = findViewById(R.id.txtNota3);
        txtNota4 = findViewById(R.id.txtNota4);
        tvPromedio = findViewById(R.id.tvPromedio);
        btnProcesar= findViewById(R.id.btnPromedio);

        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = txtNombre.getText().toString();
                double nota1 = Double.parseDouble(txtNota1.getText().toString());
                double nota2 = Double.parseDouble(txtNota2.getText().toString());
                double nota3 = Double.parseDouble(txtNota3.getText().toString());
                double nota4 = Double.parseDouble(txtNota4.getText().toString());

                if ((nota1>=0 && nota1<=20) && (nota2>=0 && nota2<=20) && (nota3>=0 && nota3<=20) && (nota4>=0 && nota4<=20)) {
                    double promedio = (nota1 + nota2 + nota3 + nota4)/4;
                    String mensaje = "";
                    if (promedio>=11.0){
                        mensaje = "APROBADO";
                    }else{
                        mensaje = "DESAPROBADO";
                    }

                    tvPromedio.setText("Promedio:\nEl Promedio de " + nombre + " es: "+promedio+"\nEl alumno esta "+mensaje);
                } else  {
                    Toast.makeText(v.getContext(), "Debe ingresar notas entre 0 y 20", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}