package net.iesseveroochoa.fernandomartinezperez.practica2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgendaActivity extends AppCompatActivity {
    Button aceptar, reiniciar, salir;
    EditText nombre, apellido, email, telefono, notas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        aceptar = findViewById(R.id.btAceptar);
        reiniciar = findViewById(R.id.btReiniciar);
        salir = findViewById(R.id.btSalir);

        nombre = findViewById(R.id.etNombre);
        apellido = findViewById(R.id.etApellido);
        email = findViewById(R.id.etEmail);
        telefono = findViewById(R.id.etTel);
        notas = findViewById(R.id.etNotas);


        aceptar.setOnClickListener(view -> {
            finish();
        });

        reiniciar.setOnClickListener(view -> {
            nombre.setText("");
            apellido.setText("");
            email.setText("");
            telefono.setText("");
            notas.setText("");
        });
        salir.setOnClickListener(view -> {
            finish();
        });


    }
}