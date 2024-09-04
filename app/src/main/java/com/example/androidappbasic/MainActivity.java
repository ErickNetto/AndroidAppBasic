package com.example.androidappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnForm = findViewById(R.id.formButton);
        Button btnEff = findViewById(R.id.effectButton);

        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent form = new Intent(getApplicationContext(), FormActivity.class);
                startActivity(form);
            }
        });
        btnEff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent efeito = new Intent(getApplicationContext(), EfeitoActivity.class);
                startActivity(efeito);
            }
        });



    }
}