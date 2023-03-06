package com.example.calculadoradehoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText hi, mi, hf, mf;
    TextView rh, rm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //declarando id
        hi = findViewById(R.id.hi);
        mi = findViewById(R.id.mi);
        hf = findViewById(R.id.hf);
        mf = findViewById(R.id.mf);
        rh = findViewById(R.id.rh);
        rm = findViewById(R.id.rm);


    }
    public void soma(View v){
        int iHi = Integer.parseInt(hi.getText().toString());
        int iMi = Integer.parseInt(hi.getText().toString());
        //condicao de tempo
        while (iRm > 59){
            iRm -= 60;
            iRh ++;
        }

        int somaRh = iHi+iHf;
        int somaRm = iMi+iMf;

        //mandando resultado
         rh.setText(somaRh);
         rm.setText(somaRm);

    }
    public void sub(View v){

    }
}