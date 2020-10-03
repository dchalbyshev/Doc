package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Systav extends AppCompatActivity {

    private Button  temp10, slab11, buttonsbrossystav, buttonresultsystav,bolVsystave48,
            otechnost49, skovapoutr50,bolVsysdvig51;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systav);

        temp10 = findViewById(R.id.simp10);
        slab11 = findViewById(R.id.simp11);
        buttonsbrossystav = findViewById(R.id.buttonsbrossystav);
        buttonresultsystav = findViewById(R.id. buttonresultsystav);


        bolVsystave48 = findViewById(R.id.bolVsystave48);
        otechnost49 = findViewById(R.id. otechnost49);
        skovapoutr50 = findViewById(R.id.skovapoutr50);
        bolVsysdvig51 = findViewById(R.id.bolVsysdvig51);

        List<Integer> naborList = new ArrayList<>();


        bolVsystave48.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(48);                     // что кнопочка делает при нажаттии
                        bolVsystave48.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        otechnost49.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(49);                     // что кнопочка делает при нажаттии
                        otechnost49.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        skovapoutr50.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(50);                     // что кнопочка делает при нажаттии
                        skovapoutr50.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        bolVsysdvig51.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(51);                     // что кнопочка делает при нажаттии
                        bolVsysdvig51.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });




      


        temp10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(10);                     // что кнопочка делает при нажаттии
                        temp10.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        slab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(11);                     // что кнопочка делает при нажаттии
                        slab11.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });



        buttonsbrossystav.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        // что кнопочка делает при нажаттии
                try {
                    Intent intent2;
                    intent2 = new Intent(Systav.this, ViborRazdelaActivity.class);// уряяя
                    startActivity(intent2);
                }
                catch (Exception e){

                }
                    }
                });



        buttonresultsystav.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                    try {
                        Intent intent2;
                        intent2 = new Intent(Systav.this, Main4Activity.class);// уряяя
                        intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                        startActivity(intent2);// что кнопочка делает при нажаттии
                    }
                    catch (Exception e){

                    }
                    }
                });







    }
}
