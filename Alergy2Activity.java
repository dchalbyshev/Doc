package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Alergy2Activity extends AppCompatActivity {

    private Button instr, pchelka;
    ImageView pomalerdgy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alergy2);
        instr = findViewById(R.id.but_priallerg);
        pchelka = findViewById(R.id.but_illustrgalo);

        pomalerdgy = findViewById(R.id.imageView);
        pomalerdgy.setImageResource(R.drawable.alergy2);

        instr.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        pomalerdgy.setImageResource(R.drawable.alergy);
                    }
                });


        pchelka.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        pomalerdgy.setImageResource(R.drawable.alergy2);
                    }
                });








    }
}
