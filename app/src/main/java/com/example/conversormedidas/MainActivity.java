package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKmM_Prog = (Button)findViewById(R.id.btnKmM);
        btnKmM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Kmm.class);
                startActivity(intent);
            }
        });
        // Açao botão de conversão Metro > Km
        Button btnM_Prog = (Button) findViewById(R.id.btnM);
        btnM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Mkm.class);
                startActivity(intent);
            }
        });
        // Açao botão de conversão CM > Metro
        Button btnMcm_Prog = (Button)findViewById(R.id.btnMcm);
        btnMcm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Cmm.class);
                startActivity(intent);
            }
        });
        // Açao botão de conversão CM > Metro
        Button btnCmM_Prog = (Button)findViewById(R.id.btnCmM);
        btnCmM_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mcm.class);
                startActivity(intent);
            }
        });

    }
}