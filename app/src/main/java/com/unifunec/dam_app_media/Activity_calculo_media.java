package com.unifunec.dam_app_media;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_calculo_media extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_media);
        this.setTitle("                 CALCULO DE MÉDIA");

        EditText nota1 = findViewById(R.id.edit_Nota1);
        EditText nota2 = findViewById(R.id.edit_Nota2);

        TextView ap = findViewById(R.id.txt_Ap);
        TextView rep = findViewById(R.id.txt_Rep);
        TextView me = findViewById(R.id.txt_Media);

        Button calcular = findViewById(R.id.btn_Calcular);
        Button limpar = findViewById(R.id.btn_Limpar);




        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (nota1.getText().toString().isEmpty() == true) {
                    Toast.makeText(Activity_calculo_media.this, "Insira a Primeira Nota!", Toast.LENGTH_LONG).show();
                } else if (nota2.getText().toString().isEmpty() == true) {
                    Toast.makeText(Activity_calculo_media.this, "Insira a Segunda Nota!", Toast.LENGTH_LONG).show();
                } else if (Double.parseDouble(nota1.getText().toString()) > 10) {
                    Toast.makeText(Activity_calculo_media.this, "Insira uma Nota de 0 a 10!", Toast.LENGTH_LONG).show();
                }else if (Double.parseDouble(nota2.getText().toString()) > 10) {
                    Toast.makeText(Activity_calculo_media.this, "Insira uma Nota de 0 a 10!", Toast.LENGTH_LONG).show();
                } else {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    if (imm.isActive())
                        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);


                    double n1 = Double.parseDouble(nota1.getText().toString());
                    double n2 = Double.parseDouble(nota2.getText().toString());

                    calcular.setEnabled(false);
                    limpar.setEnabled(true);



                    double op = (n1 + n2) / 2;
                    String res = String.format("%.2f", op);


                    if (op >= 7) {
                        ap.setText("APROVADO!");
                        me.setText(res);
                    } else {
                        rep.setText("REPROVADO!");
                        me.setText(res);
                    }
                }
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nota1.setText("");
                nota2.setText("");

                ap.setText("");
                rep.setText("");
                me.setText("");

                limpar.setEnabled(false);
                calcular.setEnabled(true);
            }
        });
    }
}