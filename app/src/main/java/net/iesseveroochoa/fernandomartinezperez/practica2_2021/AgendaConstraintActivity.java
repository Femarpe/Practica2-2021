package net.iesseveroochoa.fernandomartinezperez.practica2_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgendaConstraintActivity extends AppCompatActivity {
    Button ok, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);
        ok = findViewById(R.id.btOK);
        cancel = findViewById(R.id.btCancel);
        ok.setOnClickListener(view -> {
            finish();
        });
        cancel.setOnClickListener(view -> {
            finish();
        });
    }
}