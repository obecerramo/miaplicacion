package com.example.oscarbecerra.miaplicacion;


import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundoActivity extends Activity {

    private TextView textNombre, textApellidos, textCedula, textMedico;

    Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        textNombre = (TextView) findViewById(R.id.textNombre);
        textApellidos = (TextView) findViewById(R.id.testApellido);
        textCedula = (TextView) findViewById(R.id.testCedula);
        textMedico = (TextView) findViewById(R.id.testMedico);

        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellido");
        String cedula = getIntent().getStringExtra("cedula");
        String medico = getIntent().getStringExtra("medico");

        textNombre.setText(nombre);
        textApellidos.setText(apellidos);
        textCedula.setText(cedula);
        textMedico.setText(medico);


        miBoton = (Button) findViewById(R.id.BotonPasar);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent miBoton = new Intent (SegundoActivity.this, PrimerActivity.class);
                startActivity(miBoton);

            }
        });




    }


}
