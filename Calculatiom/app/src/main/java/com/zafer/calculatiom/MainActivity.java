package com.zafer.calculatiom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText1;
    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // editTextSelected
        editText = findViewById(R.id.numberOne);
        editText1 = findViewById(R.id.numberTwo);
        editText2 = findViewById(R.id.resultText);
    }
    public void toplamaClick(View view){
        if (editText.getText().toString().matches("") || editText1.getText().toString().matches("")){
            editText2.setText("Lütfen Boş Değer Girmeyiniz");
        }else{
            int S1 = Integer.parseInt(editText.getText().toString());
            int S2 = Integer.parseInt(editText1.getText().toString());
            int sonuc = S1 + S2;
            String deger = Integer.toString(sonuc);
            editText2.setText(deger);
        }

    }
    public void ckikarmaClick(View view){
        if (editText.getText().toString().matches("") || editText1.getText().toString().matches("")){
            editText2.setText("Lütfen Boş Değer Girmeyiniz");
        }else{
            int S1 = Integer.parseInt(editText.getText().toString());
            int S2 = Integer.parseInt(editText1.getText().toString());
            int sonuc = S1 - S2;
            String deger = Integer.toString(sonuc);
            editText2.setText(deger);
        }

    }
    public void carpmaClick(View view){
        if (editText.getText().toString().matches("") || editText1.getText().toString().matches("")){
            editText2.setText("Lütfen Boş Değer Girmeyiniz");
        }else{
            int S1 = Integer.parseInt(editText.getText().toString());
            int S2 = Integer.parseInt(editText1.getText().toString());
            int sonuc = S1 * S2;
            String deger = Integer.toString(sonuc);
            editText2.setText(deger);
        }
    }
    public void colmaClick(View view){
        if (editText.getText().toString().matches("") || editText1.getText().toString().matches("")){
            editText2.setText("Lütfen Boş Değer Girmeyiniz");
        }else{
            int S1 = Integer.parseInt(editText1.getText().toString());
            int S2 = Integer.parseInt(editText2.getText().toString());
            double sonuc = (double) S1 / S2;
            editText2.setText(String.valueOf(sonuc));
        }
    }
}