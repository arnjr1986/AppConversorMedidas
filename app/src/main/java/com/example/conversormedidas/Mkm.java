package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mkm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mkm);

        //declarando os componentes
        final EditText edtMkm_Prog = (EditText) findViewById(R.id.edtMkm);
        final EditText edtkmm_Prog = (EditText) findViewById(R.id.edtKmm);
        Button btnConverterMkm_Prog = (Button) findViewById(R.id.btnConverterMkm);
        Button btnNovoMkm_Prog = (Button) findViewById(R.id.btnNovoMkm);

        // atividade do botão de conversão (inserindo variavel recebida do edtMkm)
        btnConverterMkm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double mkm = Double.parseDouble(edtMkm_Prog.getText().toString());
                double km = mkm / 1000;
                edtkmm_Prog.setText(String.valueOf(km));
            }
        });
        // ativando e limpando dados dos editText com botão novo
        btnNovoMkm_Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMkm_Prog.setText("");
                edtkmm_Prog.setText("");
                edtMkm_Prog.requestFocus();
            }
        });

    }
}

