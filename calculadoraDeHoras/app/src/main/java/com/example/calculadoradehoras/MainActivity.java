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

        hi = findViewById(R.id.hi);
        mi = findViewById(R.id.mi);
        hf = findViewById(R.id.hf);
        mf = findViewById(R.id.mf);
        rh = findViewById(R.id.rh);
        rm = findViewById(R.id.rm);
        //rh.setText(hrInicial+minInicial);


    }
    public void soma(View v) {
        int hrInicial = Integer.parseInt(hi.getText().toString());
        int minInicial = Integer.parseInt(mi.getText().toString());
        int hrFinal = Integer.parseInt(hf.getText().toString());
        int minFinal = Integer.parseInt(mf.getText().toString());

        int resultadoHr = hrInicial + hrFinal;
        int resultadoMin = minInicial + minFinal;

        while(resultadoMin>59){
            resultadoMin-=60;
            resultadoHr++;
        }

        rh.setText(resultadoHr+"");
        rm.setText(resultadoMin+"");
    }
    public void sub(View v){
        int hrInicial = Integer.parseInt(hi.getText().toString());
        int minInicial = Integer.parseInt(mi.getText().toString());
        int hrFinal = Integer.parseInt(hf.getText().toString());
        int minFinal = Integer.parseInt(mf.getText().toString());

        //hora inicial em minutos
        while (hrInicial>0){
            hrInicial--;
            minInicial+=60;
        }
        //hora final em minutos
        while (hrFinal>0) {
            hrFinal--;
            minFinal += 60;
        }
        int resultadoHr= 0;
        int resultadoMin = minInicial - minFinal;
       if (minFinal>minInicial){
           resultadoMin = minInicial - minFinal;

       }
       while (resultadoMin>59){
            resultadoMin -=60;
            resultadoHr++;
        }
        //catch dentro do while e if dentro do catch
        rh.setText(resultadoHr+"");
        rm.setText(resultadoMin+"");
    }
}