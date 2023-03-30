package com.unifunec.dam_app_media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity_cad_aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_aluno);
        this.setTitle("               CADASTRO DE ALUNO");

        Button salvar = findViewById(R.id.buttonSalvar);

        EditText nome = findViewById(R.id.editTextCampoNome);
        EditText cpf = findViewById(R.id.editTextCampoCpf);
        EditText curso = findViewById(R.id.editTextCampoCurso);
        ImageButton perfil = findViewById(R.id.imageButtonPerfil);

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

                    String n = nome.getText().toString();

                    Toast.makeText(Activity_cad_aluno.this, "O Aluno "+n+ " foi cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                    nome.setText("");
                    cpf.setText("");
                    curso.setText("");
            }
                else Toast.makeText(Activity_cad_aluno.this, "Campo CPF deve conter onze dígitos!", Toast.LENGTH_LONG).show();
           }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                if (imm.isActive())
                    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
                Toast.makeText(Activity_cad_aluno.this, "Não possui fotos para inserir no momento!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
