package com.example.caraoucoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    //Atributo
    private ImageView imageResultado;
    private Button buttonVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonvoltar);


        //recuperando dados do tipo bandle
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero"); //utilizar a chave indentificadora da outra Tela

        //Logica
        if (numero == 0){ //Cara
            imageResultado.setImageResource(R.drawable.moeda_cara);

        }else{ //coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);

        }
        //Metodo de Click
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //visualiza a active que esta em baixo
            }
        });

    }
}