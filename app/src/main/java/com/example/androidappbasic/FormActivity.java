package com.example.androidappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btnCaptura = findViewById(R.id.btnGet);

        EditText formNome = findViewById(R.id.formNome);
        EditText formIdade = findViewById(R.id.formIdade);
        EditText formCpf = findViewById(R.id.formCpf);
        EditText formEmail = findViewById(R.id.formEmail);

        btnCaptura.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String nome = formNome.getText().toString();
               String idade = formIdade.getText().toString();
               String cpf = formCpf.getText().toString();
               String email = formEmail.getText().toString();

               Intent tela = new Intent(getApplicationContext(), ResultadoActivity.class);
               tela.putExtra("nome", nome);
               tela.putExtra("idade", idade);
               tela.putExtra("cpf", cpf);
               tela.putExtra("email", email);
               startActivity(tela);


           }
        });


    }


}