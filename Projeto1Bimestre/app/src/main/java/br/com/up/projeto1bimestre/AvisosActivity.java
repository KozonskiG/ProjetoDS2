package br.com.up.projeto1bimestre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AvisosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avisos);

        Button novoAvisoButton = findViewById(R.id.button_novo_aviso);

        novoAvisoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callRegisterAvisoActivity();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void callRegisterAvisoActivity(){
        Intent intent = new Intent(
                AvisosActivity.this,
                RegisterAvisoActivity.class
        );

        startActivityForResult(intent, 100);
    }
}
