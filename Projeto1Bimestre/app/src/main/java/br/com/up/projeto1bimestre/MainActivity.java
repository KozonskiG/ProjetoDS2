package br.com.up.projeto1bimestre;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button avisosButton = findViewById(R.id.button_avisos);

        avisosButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callAvisosActivity();
            }
        });

        Button listaMensagensButton = findViewById(R.id.button_lista_mensagens);

        listaMensagensButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callListaMensagensActivity();
            }
        });
    }

    public void callAvisosActivity(){
        Intent intent = new Intent(
                MainActivity.this,
                AvisosActivity.class
        );

        startActivityForResult(intent, 100);
    }

    public void callListaMensagensActivity(){
        Intent intent = new Intent(
                MainActivity.this,
                ListaMensagensActivity.class
        );

        startActivityForResult(intent, 100);
    }

}