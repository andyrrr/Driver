package com.carpoolingtec.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainFormulario extends AppCompatActivity {
    Button btnfoto, btnRegistroListo;
    TextView UserName, UserBirthday, UserEmail;

    public static TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario);

        resultTextView = (TextView) findViewById(R.id.editCarne);
        btnfoto = (Button) findViewById(R.id.buttonFoto);
        btnfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainAux.class));
            }
        });

        UserName = (TextView) findViewById(R.id.editName);
        UserBirthday = (TextView) findViewById(R.id.editFecha);
        UserEmail = (TextView) findViewById(R.id.editEmail);

        Bundle bundle = getIntent().getExtras();
        UserName.setText(bundle.getString("name"));
        UserBirthday.setText(bundle.getString("birthday"));
        UserEmail.setText(bundle.getString("email"));

        btnRegistroListo = (Button) findViewById(R.id.buttonRegistroListo);
        btnRegistroListo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IRegistroListo = new Intent(MainFormulario.this, MainEspacio.class);
                startActivityForResult(IRegistroListo, 0);
                finish();
            }
        });
    }
}
