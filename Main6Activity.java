package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends AppCompatActivity {
    private Button simp,simp7, simp6, simp10, simp17, simp22, simp20, simp11, simp15,simp14,
            simp8 , simp9,buttonresultuho,  buttonsbrosuho, simp23 ;

    List<Integer> naborList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        simp = findViewById(R.id.simp);
        simp7 = findViewById(R.id.simp7);
        simp6 = findViewById(R.id.simp6);
        simp10 = findViewById(R.id.simp10);
        simp17 = findViewById(R.id.simp17);
        simp22 = findViewById(R.id.simp22);
        simp20 = findViewById(R.id.simp20);
        simp11 = findViewById(R.id.simp11);
        simp15 = findViewById(R.id.simp15);
        simp14 = findViewById(R.id.simp14);
        simp8 = findViewById(R.id.simp8);

        simp9 = findViewById(R.id.simptow9);
        simp23 = findViewById(R.id.simp23);

        buttonresultuho = findViewById(R.id.buttonresultuho);
        buttonsbrosuho = findViewById(R.id.buttonsbrosuho);


        simp23.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(23);                     // что кнопочка делает при нажаттии
                        simp23.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });





        simp.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(1);
                       // что кнопочка делает при нажаттии
                        simp.setText("Выбрано");
                       // simp.setVisibility(View.GONE);
                                                           // что кнопочка делает при нажаттии
                    }
                });



        simp9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(9);                     // что кнопочка делает при нажаттии
                        simp9.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });





        simp7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(7);                     // что кнопочка делает при нажаттии
                        simp7.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(6);                     // что кнопочка делает при нажаттии
                        simp6.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simp10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(10);                     // что кнопочка делает при нажаттии
                        simp10.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(17);                     // что кнопочка делает при нажаттии
                        simp17.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simp22.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(22);                     // что кнопочка делает при нажаттии
                        simp22.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });
        simp20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(20);                    // что кнопочка делает при нажаттии
                        simp20.setText("Выбрано");
                                                               // что кнопочка делает при нажаттии
                    }
                });


        simp11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(11);                     // что кнопочка делает при нажаттии
                        simp11.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(15);                     // что кнопочка делает при нажаттии
                        simp15.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simp14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(14);                     // что кнопочка делает при нажаттии
                        simp14.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(8);                     // что кнопочка делает при нажаттии
                        simp8.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });



        buttonsbrosuho.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                                                             // что кнопочка делает при нажаттии
                try{
                        Intent intent2;
                        intent2 = new Intent(Main6Activity.this, ViborRazdelaActivity.class );// уряяя
                        startActivity(intent2);}

                catch (Exception e){

                }
                    }
                });



        buttonresultuho.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                    try{
                        Intent intent2;
                        intent2 = new Intent(Main6Activity.this, Main4Activity.class );// уряяя
                        intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                        startActivity(intent2);}// что кнопочка делает при нажаттии
                catch (Exception e){


                }
                    }
                });





    }
}
