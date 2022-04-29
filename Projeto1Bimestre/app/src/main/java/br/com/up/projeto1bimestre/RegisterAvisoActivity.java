package br.com.up.projeto1bimestre;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class RegisterAvisoActivity extends AppCompatActivity {

    private DatePickerDialog selecionarDataDialog;
    private Button dataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_aviso);
        selecionarDataInicial();

        Button salvarButton = findViewById(R.id.button_salvar_aviso);
        dataButton = findViewById(R.id.button_data);
        dataButton.setText(getDataAtual());

        salvarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onBackPressed();
            }
        });


    }

    private String getDataAtual() {
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        mes += 1;

        int style = AlertDialog.THEME_HOLO_LIGHT;
        return ConverterDataParaString(dia, mes, ano);
    }

    private void selecionarDataInicial() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {

                mes += 1;
                String data = ConverterDataParaString(dia, mes, ano);
                dataButton.setText(data);
            }
        };

        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        int style = AlertDialog.THEME_HOLO_LIGHT;

        selecionarDataDialog = new DatePickerDialog(this, style, dateSetListener, ano, mes, dia);
    }

    private String ConverterDataParaString(int dia, int mes, int ano) {
        return dia + " " + getFormatoMes(mes) + " " + ano;
    }

    private String getFormatoMes(int mes) {
        if(mes == 1)
            return "JAN";
        if(mes == 2)
            return "FEV";
        if(mes == 3)
            return "MAR";
        if(mes == 4)
            return "ABR";
        if(mes == 5)
            return "MAI";
        if(mes == 6)
            return "JUN";
        if(mes == 7)
            return "JUL";
        if(mes == 8)
            return "AGO";
        if(mes == 9)
            return "SET";
        if(mes == 10)
            return "OUT";
        if(mes == 11)
            return "NOV";
        if(mes == 12)
            return "DEZ";

        //default
        return "JAN";
    }

    public void abrirSelecionarData(View view){
        selecionarDataDialog.show();
    }
}
