package com.example.botonterceraforma_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Atributos
    private TextView txtResultado;
    private EditText etPalabra;
    private Button btnInvertir, btnMensaje;

    private String palabra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Cuando este activa esta pantalla, sera ese componente
        //el que se va a pintar o dibujar o renderizar en la pantalla
        setContentView(R.layout.activity_main);
        inicializarVistas();
        //configuran el elemento que estara atento al evento click
        //     parametros de tipo Primitivos ---> int, String, float, boolean
        //     parametros de tipo Objetos ----> Persona, Doctor, FiguraGeometrica
        //     parametro una funcion ---> funciones anonimas, funciones lambda, arrow functions
        btnInvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerInformacion();
            }
        });
        //funcion lambda
        btnMensaje.setOnClickListener((view -> obtenerInformacion()));
    }



    private void inicializarVistas() {
        txtResultado = findViewById(R.id.txtResultado);
        etPalabra = findViewById(R.id.etPalabra);
        btnInvertir = findViewById(R.id.btnInvertir);
        btnMensaje = findViewById(R.id.btnMensaje);
    }

    private void obtenerInformacion() {
        palabra = etPalabra.getText().toString();
    }
}






















