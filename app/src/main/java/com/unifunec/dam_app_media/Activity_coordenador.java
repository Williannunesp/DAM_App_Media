package com.unifunec.dam_app_media;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.Scroller;
import android.widget.TextView;

public class Activity_coordenador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordenador);
        this.setTitle("                    COORDENADOR");

        TextView t9 = findViewById(R.id.textView9);

        t9.setMovementMethod(new ScrollingMovementMethod());

    }
}