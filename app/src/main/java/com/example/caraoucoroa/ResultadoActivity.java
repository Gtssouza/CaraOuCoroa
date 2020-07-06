package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResult;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResult = findViewById(R.id.imageResult);
        botaoVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar dados
        Bundle dados = getIntent().getExtras();
        int num = dados.getInt("numero");

        if(num == 0){
            //exibe cara
            imageResult.setImageResource(R.drawable.moeda_cara);
        }else{
            //exibe
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}
