package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cmm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmm);

        //declarando os componentes
        final EditText edtMcm_Prog = (EditText) findViewById(R.id.edtMcm);
        final EditText edtCm_Prog = (EditText) findViewById(R.id.edtCm);
        Button btnConverterCmm_Prog = (Button) findViewById(R.id.btnConverterMcm);
        Button btnNovoCm_Prog = (Button) findViewById(R.id.btnNovoCm);

        // atividade do botão de conversão (inserindo variavel recebida do edtMcm)
        btnConverterCmm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mcm = Double.parseDouble(edtMcm_Prog.getText().toString());
                double cm = mcm * 100;
                edtCm_Prog.setText(String.valueOf(cm));
            }
        });
        // ativando e limpando dados dos editText com botão novo
        btnNovoCm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMcm_Prog.setText("");
                edtCm_Prog.setText("");
                edtMcm_Prog.requestFocus();
            }
        });

    }
}