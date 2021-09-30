package net.iesseveroochoa.fernandomartinezperez.practica2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button agenda;
    Button agendac;
    Button receta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agenda = findViewById(R.id.btAgenda);
        agendac = findViewById(R.id.btAgendaC);

        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AgendaActivity.class);
                startActivity(intent);
            }
        });
        agendac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,AgendaConstraintActivity.class);
                startActivity(intent);
            }
        });
    }

}