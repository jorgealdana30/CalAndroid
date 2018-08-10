package com.dreft.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Spinner spop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        et1 =(EditText) findViewById(R.id.et1);
        et2 =(EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tvres);
    }

    @SuppressLint("SetTextI18n")
    public void calcular(View view){
        switch (spop.getSelectedItem().toString()){
            case "Sumar":{
                int res = 0;
                res = Integer.parseInt(et1.getText().toString())+Integer.parseInt(et2.getText().toString());
                tv1.setText("El resultado es: " +Integer.toString(res));
                et1.setText("");
                et2.setText("");
            }
            default:{
                Toast.makeText(this,"Seleccione una opcion",Toast.LENGTH_LONG ).show();

            }
        }
    }
}
