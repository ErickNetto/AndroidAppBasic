package com.example.androidappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtIdade = findViewById(R.id.txtIdade);
        TextView txtCpf = findViewById(R.id.txtCpf);
        TextView txtEmail = findViewById(R.id.txtEmail);

        Intent intent = getIntent();

        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String cpf = intent.getStringExtra("cpf");
        String email = intent.getStringExtra("email");

        txtNome.setText(nome);
        txtIdade.setText(idade);
        txtCpf.setText(cpf);
        txtEmail.setText(email);

        Button btnHome = findViewById(R.id.btnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(home);
            }
        });
    }
}