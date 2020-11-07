package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcm);
        //declarando os componentes
        final EditText edtCmm_Prog = (EditText) findViewById(R.id.edtCmm);
        final EditText edtMcmm_Prog = (EditText) findViewById(R.id.edtMcmm);
        Button btnConverterCmm_Prog = (Button) findViewById(R.id.btnConverterCmm);
        Button btnNovoMcm_Prog = (Button) findViewById(R.id.btnNovoMcm);

        // atividade do botão de conversão (inserindo variavel recebida do edtCmm)
        btnConverterCmm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cm = Double.parseDouble(edtCmm_Prog.getText().toString());
                double m = cm / 100;
                edtMcmm_Prog.setText(String.valueOf(m));
            }
        });
        // ativando e limpando dados dos editText com botão novo
        btnNovoMcm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCmm_Prog.setText("");
                edtMcmm_Prog.setText("");
                edtCmm_Prog.requestFocus();
            }
        });

    }
}
