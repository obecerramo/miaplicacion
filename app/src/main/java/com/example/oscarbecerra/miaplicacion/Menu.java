package com.example.oscarbecerra.miaplicacion;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Menu extends Activity {

        Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        miBoton = (Button) findViewById(R.id.BotonPasar);
        miBoton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent miBoton = new Intent (Menu.this, PrimerActivity.class);
                startActivity(miBoton);

            }
        });

    }
}
