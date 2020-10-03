package com.dchalbyshev.doctorinmypocket;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    private Button simp18, simp19, simp20,simp21, simp22, simp23, simp24, simp25, simp26, simp27,
    simp28, simp29, simp30, simp32, result2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // Intent intent = getIntent();    проверка условия если не буду передавать араййЛист
        //    if (intent.hasExtra()){      } только метод надо подобрать
        Bundle arguments = getIntent().getExtras();
         final List<Integer> naborList =  arguments.getIntegerArrayList("list");


        simp18 = findViewById(R.id.simp18);    // приравнивание компонентов КНОПКИ
        simp19 = findViewById(R.id.simp19);// или указываем id кнопки
        simp20 = findViewById(R.id.simp20);    // приравнивание компонентов КНОПКИ
        simp21 = findViewById(R.id.simp21);// или указываем id кнопки
        simp22 = findViewById(R.id.simp22);    // приравнивание компонентов КНОПКИ
        simp23 = findViewById(R.id.simp23);// или указываем id кнопки
        simp24 = findViewById(R.id.simp24);    // приравнивание компонентов КНОПКИ
        simp25 = findViewById(R.id.simp25);// или указываем id кнопки
        simp26 = findViewById(R.id.simp26);    // приравнивание компонентов КНОПКИ
        simp27 = findViewById(R.id.simp27);// или указываем id кнопки
        simp28 = findViewById(R.id.simp28);    // приравнивание компонентов КНОПКИ
        simp29 = findViewById(R.id.simp29);// или указываем id кнопки
        simp30 = findViewById(R.id.simp30);    // приравнивание компонентов КНОПКИ
        // или указываем id кнопки
        simp32 = findViewById(R.id.simp32);    // приравнивание компонентов КНОПКИ

         // приравнивание компонентов КНОПКИ
        result2 = findViewById(R.id.result2);


        simp18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(18);                     // что кнопочка делает при нажаттии
                        simp18.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                       naborList.add(19);                     // что кнопочка делает при нажаттии
                        simp18.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                       naborList.add(20);                     // что кнопочка делает при нажаттии
                        simp20.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp21.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                      naborList.add(21);                     // что кнопочка делает при нажаттии
                        simp21.setText("Выбрано");
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

        simp23.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                       naborList.add(23);                     // что кнопочка делает при нажаттии
                        simp23.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp24.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(24);                     // что кнопочка делает при нажаттии
                        simp24.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp25.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(25);                     // что кнопочка делает при нажаттии
                        simp25.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simp26.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(26);                     // что кнопочка делает при нажаттии
                        simp26.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp27.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(27);                     // что кнопочка делает при нажаттии
                        simp27.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simp28.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(28);                     // что кнопочка делает при нажаттии
                        simp28.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });
        simp29.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(29);                     // что кнопочка делает при нажаттии
                        simp29.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });
        simp30.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(30);                     // что кнопочка делает при нажаттии
                        simp30.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simp32.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(32);                     // что кнопочка делает при нажаттии
                        simp32.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });





        result2.setOnClickListener(                    //начало листенера
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v) {// создание метода для кнопочки




                        Intent intent2;
                        intent2 = new Intent(Main3Activity.this, Main4Activity.class );// уряяя
                        intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                        startActivity(intent2);// что кнопочка делает при нажаттии
                    }
                });                                       // конец листенера



    }
}
