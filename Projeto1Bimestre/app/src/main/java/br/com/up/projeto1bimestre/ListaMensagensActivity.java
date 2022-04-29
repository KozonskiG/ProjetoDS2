package br.com.up.projeto1bimestre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListaMensagensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_mensagens);

        Button professorButton = findViewById(R.id.button_professor);

        professorButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callMensagensActivity();
            }
        });
    }

    public void callMensagensActivity(){
        Intent intent = new Intent(
                ListaMensagensActivity.this,
                MensagensActivity.class
        );
        startActivityForResult(intent, 100);
    }
}