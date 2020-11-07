package com.example.conversormedidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();//esconde barra de ação (nome da classe java)

        //deixa em tela cheia e esconde (bateria, relogio...)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //chama a MainActivity após 2000 ms
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                mostrarActivity();
            }
        },  700);
    }

    //inicia a tela Activity automaticamente
    private void mostrarActivity(){
        Intent intent = new Intent(Splash.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
