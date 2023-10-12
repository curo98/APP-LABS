package iberoplast.pe.lab7_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SueldoActivity extends AppCompatActivity {
    EditText cApe,cDia,cSue;
    TextView cImp;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sueldo);


        cApe=findViewById(R.id.txtApe);
        cDia=findViewById(R.id.txtDias);
        cSue=findViewById(R.id.txtSue);
        btn2=findViewById(R.id.btnCalc);
        cImp=findViewById(R.id.tvImpor);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ape=cApe.getText().toString();
                double dias=Double.parseDouble(cDia.getText().toString());
                double sueldo=Double.parseDouble(cSue.getText().toString());
                double imp=sueldo/30*dias;
                double bnf1=sueldo*0.10;
                double bnf2=sueldo*0.15;
                double resu=imp+bnf1+bnf2;
                String mensaje="El total es "+resu;
                cImp.setText("El total de "+ape+" es: "+resu);
                Toast toast = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}