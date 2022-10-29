package com.example.pm01ej2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResultado extends AppCompatActivity {

    TextView txtviewnom,txtviewape,txtviewedad,txtviewcor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        txtviewnom = (TextView) findViewById(R.id.txtviewnom);
        txtviewape = (TextView)findViewById(R.id.txtviewape);
        txtviewedad = (TextView) findViewById(R.id.txtviewedad);
        txtviewcor = (TextView) findViewById(R.id.txtviewcor);

        Bundle info = getIntent().getExtras();
        txtviewnom.setText(info.getString("nombre"));
        txtviewape.setText(info.getString("apellido"));
        txtviewedad.setText(info.get("edad").toString());
        txtviewcor.setText(info.getString("correo"));


    }
}