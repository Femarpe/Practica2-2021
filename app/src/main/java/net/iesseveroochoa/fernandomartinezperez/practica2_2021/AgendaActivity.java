package net.iesseveroochoa.fernandomartinezperez.practica2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgendaActivity extends AppCompatActivity {
Button aceptar, reiniciar, salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        aceptar = findViewById(R.id.btAceptar);
        reiniciar = findViewById(R.id.btReiniciar);
        salir = findViewById(R.id.btSalir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}