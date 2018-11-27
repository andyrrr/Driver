package com.carpoolingtec.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class MainEspacio extends AppCompatActivity {
    Button btnSiguiente;
    EditText EditCampos;
    String camposDisponibles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.espacio);


        btnSiguiente = (Button) findViewById(R.id.button2);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditCampos = (EditText) findViewById(R.id.editText);
                camposDisponibles = EditCampos.getText().toString();

                    Intent seguir = new Intent(MainEspacio.this, MainScanner.class);
                    startActivityForResult(seguir,0);

            }
        });
    }
}
