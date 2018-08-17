package com.dreft.calculadora;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class Principal extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private Spinner spop;
    private String op[];
    private Resources resources;

    public Principal() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        et1 =(EditText) findViewById(R.id.txtNum1);
        et2 =(EditText) findViewById(R.id.txtNum2);
        tv1 = (TextView) findViewById(R.id.lblRes);
        spop = (Spinner) findViewById(R.id.cmbOpcion);
        resources = this.getResources();
        op = resources.getStringArray(R.array.opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, op);
    }

    @SuppressLint("SetTextI18n")
    public void calcular(View view) {
        if (et1.getText().length() != 0 && et2.getText().length() != 0) {
            double num1 = Double.parseDouble(et1.getText().toString());
            double num2 = Double.parseDouble(et2.getText().toString());
            switch (spop.getSelectedItemPosition()) {
                case 0: {
                    tv1.setText(Double.toString(Metodos.sumar(num1,num2)));
                    break;
                }
                case 1: {
                    tv1.setText(Double.toString(Metodos.restar(num1,num2)));
                    break;
                }
                case 2: {
                    tv1.setText(Double.toString(Metodos.multiplicar(num1,num2)));
                    break;
                }
                case 3: {
                    tv1.setText(Double.toString(Metodos.dividir(num1,num2)));
                    break;
                }
            }
        }else{
            Toast.makeText(this,resources.getText(R.string.errorfaltanum), Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar(View view){
        et1.setText("");
        et2.setText("");
       tv1.setText(resources.getText(R.string.resultado));
    }
}
