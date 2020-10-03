package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;





public class MainActivity extends AppCompatActivity {
    private Button vpered;
    private TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vpered= findViewById(R.id.act_change);
        list = findViewById(R.id.textView5);
        list.append(getString(R.string.instruction));


        vpered.setOnClickListener(                    //начало листенера
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {// создание метода для кнопочки

                       try{
                        Intent intent;
                        intent = new Intent(MainActivity.this, ViborRazdelaActivity.class );// уряяя

                        startActivity(intent);}
                       catch (Exception e) {// что кнопочка делает при нажаттии
                       }
                    }
                });                                       // конец листенера
















    }
}
