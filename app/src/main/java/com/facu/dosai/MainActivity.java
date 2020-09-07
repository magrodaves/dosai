package com.facu.dosai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtDose;
    private EditText edtPeso;
    private EditText edtConcentracao;
    private Button btnCalcular;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtConcentracao = (EditText) findViewById(R.id.edtConcentracao);
        edtDose = (EditText) findViewById(R.id.edtConcentracao);
        edtPeso = (EditText) findViewById(R.id.edtPeso);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txvResultado = (TextView) findViewById(R.id.txvResultado);
    }

    public void calcular (View view){

        double doseStr = Double.valueOf(edtDose.getText().toString());
        double pesoStr = Double.valueOf(edtPeso.getText().toString());
        double concentracaoStr = Double.valueOf(edtConcentracao.getText().toString());

        double result = (pesoStr * doseStr) / concentracaoStr;

        txvResultado.setText(result);

    }
}