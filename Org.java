package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Org extends AppCompatActivity {

    private Button cashel3, dlitSuxCashel25, suxCashVdox16, cashelVlag13,
   simptow9, temperature10,potlivost12, slabost11, oottdishkaszatrudvidoxa24,
    svistdix26, buttonsbrosdix,buttonresultdix, poterzobon14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org);

        cashel3 = findViewById(R.id.simp3);
        dlitSuxCashel25 = findViewById(R.id.simp25);
        suxCashVdox16 =findViewById(R.id.simp16);
        cashelVlag13 =findViewById(R.id.simp13);
        temperature10 = findViewById(R.id.simp10);
        potlivost12 = findViewById(R.id.simp12);
        slabost11 = findViewById(R.id.simp11);
        oottdishkaszatrudvidoxa24 = findViewById(R.id.simp24);
        svistdix26 = findViewById(R.id.simp26);
        buttonsbrosdix = findViewById(R.id.buttonsbrosuho);
        buttonresultdix = findViewById(R.id.buttonresultuho);
        poterzobon14 = findViewById(R.id.poterzobon14);
        simptow9 = findViewById(R.id.simptow9);

        List<Integer> naborList = new ArrayList<>();


        simptow9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(14);                     // что кнопочка делает при нажаттии
                        simptow9.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });
        poterzobon14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(14);                     // что кнопочка делает при нажаттии
                        poterzobon14.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        cashel3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(13);                     // что кнопочка делает при нажаттии
                        cashel3.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        dlitSuxCashel25.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(25);                     // что кнопочка делает при нажаттии
                        dlitSuxCashel25.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        suxCashVdox16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(16);                     // что кнопочка делает при нажаттии
                        suxCashVdox16.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        cashelVlag13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(13);                     // что кнопочка делает при нажаттии
                        cashelVlag13.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });



        temperature10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(10);                     // что кнопочка делает при нажаттии
                        temperature10.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        potlivost12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(12);                     // что кнопочка делает при нажаттии
                        potlivost12.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        slabost11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(11);                     // что кнопочка делает при нажаттии
                        slabost11.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        oottdishkaszatrudvidoxa24.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(24);                     // что кнопочка делает при нажаттии
                        oottdishkaszatrudvidoxa24.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        svistdix26.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(26);                     // что кнопочка делает при нажаттии
                        svistdix26.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        buttonsbrosdix.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        // что кнопочка делает при нажаттии
                try {
                    Intent intent2;
                    intent2 = new Intent(Org.this, ViborRazdelaActivity.class);// уряяя
                    startActivity(intent2);
                }
                catch (Exception e){

                }
                    }
                });



        buttonresultdix.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                     try {
                         Intent intent2;
                         intent2 = new Intent(Org.this, Main4Activity.class);// уряяя
                         intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                         startActivity(intent2);// что кнопочка делает при нажаттии
                     }
                     catch (Exception e){

                     }
                    }
                });


























    }
}
