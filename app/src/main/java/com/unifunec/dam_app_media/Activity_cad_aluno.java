package com.unifunec.dam_app_media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_cad_aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_aluno);

        Button salvar = findViewById(R.id.buttonSalvar);

        EditText nome = findViewById(R.id.editTextCampoNome);
        EditText cpf = findViewById(R.id.editTextCampoCpf);
        EditText curso = findViewById(R.id.editTextCampoCurso);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(nome.getText().length()== 0){
                    Toast.makeText(Activity_cad_aluno.this, "Preencha o campo nome!", Toast.LENGTH_LONG).show();
                } else if (cpf.getText().length()== 0) {
                    Toast.makeText(Activity_cad_aluno.this, "Preencha o campo CPF!", Toast.LENGTH_LONG).show();
                } else if (curso.getText().length()== 0) {
                    Toast.makeText(Activity_cad_aluno.this, "Preencha o campo curso!", Toast.LENGTH_LONG).show();
                } else if (cpf.getText().length()== 11){
                    Toast.makeText(Activity_cad_aluno.this, "Cadastro realizado com sucesso!", Toast.LENGTH_LONG).show();
                    nome.setText("");
                    cpf.setText("");
                    curso.setText("");
            }
                else Toast.makeText(Activity_cad_aluno.this, "Campo CPF deve conter onze dígitos!", Toast.LENGTH_LONG).show();
           }
        });
    }
}
