package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Mochevid extends AppCompatActivity {

    private Button  temp10, slabost11, buttonresultmochevid, buttonsbrosmochevid,
            bolVpoyssod42, chastMoch43, bolVpax44,bolVpoys45, bolmochesp47;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mochevid);
        temp10 = findViewById(R.id.simp10);

        slabost11 = findViewById(R.id.simp11);
        buttonresultmochevid = findViewById(R.id.buttonresultmochevid);
        buttonsbrosmochevid = findViewById(R.id.buttonsbrosmochevid);



        bolVpoyssod42 = findViewById(R.id.bolVpoyssod42);
        chastMoch43 = findViewById(R.id.chastMoch43);
        bolVpax44 = findViewById(R.id.bolVpax44);
        bolVpoys45 = findViewById(R.id.bolVpoys45);
        bolmochesp47 = findViewById(R.id.bolmochesp47);

        List<Integer> naborList = new ArrayList<>();

        bolVpoyssod42.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(42);                     // что кнопочка делает при нажаттии
                        bolVpoyssod42.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        chastMoch43.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(43);                     // что кнопочка делает при нажаттии
                        chastMoch43.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        bolVpax44.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(44);                     // что кнопочка делает при нажаттии
                        bolVpax44.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        bolVpoys45.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(45);                     // что кнопочка делает при нажаттии
                        bolVpoys45.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        bolmochesp47.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(47);                     // что кнопочка делает при нажаттии
                        bolmochesp47.setText("Выбрано");
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




        slabost11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(11);                     // что кнопочка делает при нажаттии
                        slabost11.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });





        buttonresultmochevid.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                     try {
                         Intent intent2;
                         intent2 = new Intent(Mochevid.this, Main4Activity.class);// уряяя
                         intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                         startActivity(intent2);
                     }// что кнопочка делает при нажаттии
                        // что кнопочка делает при нажаттии
                        catch (Exception e){


                        }
                    }
                });


        buttonsbrosmochevid.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                try {
                    Intent intent2;
                    intent2 = new Intent(Mochevid.this, ViborRazdelaActivity.class);// уряяя
                    startActivity(intent2);
                }
                catch (Exception e){


                }

                    }
                });


















    }
}
