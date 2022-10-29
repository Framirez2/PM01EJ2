package com.example.pm01ej2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnenviar;
    EditText txtnombre,txtapellido,txtedad,txtcorreo;

    private void config(){
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtapellido = (EditText)findViewById(R.id.txtapellido);
        txtedad = (EditText) findViewById(R.id.txtedad);
        txtcorreo = (EditText) findViewById(R.id.txtcorreo);
        btnenviar = (Button) findViewById(R.id.btnenviar);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        config();


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           datos();
            }
        });


    }
    private void datos() {
        String num1 = txtnombre.getText().toString();
        String num2 = txtapellido.getText().toString();
        Integer num3 = Integer.valueOf(txtedad.getText().toString());
        String num4 = txtcorreo.getText().toString();


        DatosPersonales n = new DatosPersonales();



        n.Nombres = String.valueOf(num1.toString());
        n.Apellidos = String.valueOf(num2.toString());
        n.Edad = Integer.valueOf((num3.toString()));
        n.Correo = String.valueOf(num4.toString());

        Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
        intent.putExtra("nombre", n.Nombres);
        intent.putExtra("apellido", n.Apellidos);
        intent.putExtra("edad", n.Edad);
        intent.putExtra("correo", n.Correo);
        startActivity(intent);







    }

}