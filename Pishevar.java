package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Pishevar extends AppCompatActivity {


    private Button slabost11, toshnota29,rvota30,rvotaneprin32,bol28,bol27,buttonresultpish,
    buttonsbrospish, simpIzgoga31,simpSlizVGorle52, simpBolVPodREb33,simpGorechVoRtu34,
            simpBolOpXaracter35,simpMettorizm36, simpBolvGivote38, simpRvotaKofGushei40,
            simpKalBlack41;

    List<Integer> naborList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pishevar);

        slabost11 = findViewById(R.id.simp11);
        toshnota29 = findViewById(R.id.simp29);
        rvota30 = findViewById(R.id.simp30);
        rvotaneprin32 = findViewById(R.id.simp32);
        bol28 = findViewById(R.id.simp28);
        bol27 = findViewById(R.id.simp27);
        buttonresultpish = findViewById(R.id.buttonresultuho);
        buttonsbrospish = findViewById(R.id.buttonsbrosuho);


        simpSlizVGorle52 = findViewById(R.id.simpSlizVGorle52);
        simpBolVPodREb33 = findViewById(R.id.simpBolVPodREb33);
        simpGorechVoRtu34 = findViewById(R.id.simpGorechVoRtu34);
        simpBolOpXaracter35 = findViewById(R.id.simpBolOpXaracter35);
        simpMettorizm36 = findViewById(R.id.simpMettorizm36);
        simpBolvGivote38 = findViewById(R.id.simpBolvGivote38);
        simpRvotaKofGushei40 = findViewById(R.id.simpRvotaKofGushei40);
        simpKalBlack41 = findViewById(R.id.simpKalBlack41);
        simpIzgoga31 = findViewById(R.id.simpIzgoga31);



        simpSlizVGorle52.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(52);                     // что кнопочка делает при нажаттии
                        simpSlizVGorle52.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simpBolVPodREb33.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(33);                     // что кнопочка делает при нажаттии
                        simpBolVPodREb33.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simpGorechVoRtu34.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(34);                     // что кнопочка делает при нажаттии
                        simpGorechVoRtu34.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });



        simpBolOpXaracter35.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(35);                     // что кнопочка делает при нажаттии
                        simpBolOpXaracter35.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simpMettorizm36.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(36);                     // что кнопочка делает при нажаттии
                        simpMettorizm36.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        simpBolvGivote38.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(38);                     // что кнопочка делает при нажаттии
                        simpBolvGivote38.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simpRvotaKofGushei40.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(40);                     // что кнопочка делает при нажаттии
                        simpRvotaKofGushei40.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simpKalBlack41.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(41);                     // что кнопочка делает при нажаттии
                        simpKalBlack41.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });


        simpIzgoga31.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(31);                     // что кнопочка делает при нажаттии
                        simpIzgoga31.setText("Выбрано");
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

        toshnota29.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(29);                     // что кнопочка делает при нажаттии
                        toshnota29.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        rvota30.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(30);                     // что кнопочка делает при нажаттии
                        rvota30.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        rvotaneprin32.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(32);                     // что кнопочка делает при нажаттии
                        rvotaneprin32.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        bol28.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(28);                     // что кнопочка делает при нажаттии
                        bol28.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        bol27.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        naborList.add(27);                     // что кнопочка делает при нажаттии
                        bol27.setText("Выбрано");
                        // что кнопочка делает при нажаттии
                    }
                });

        buttonresultpish.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                      try{  Intent intent2;
                        intent2 = new Intent(Pishevar.this, Main4Activity.class );// уряяя
                        intent2.putIntegerArrayListExtra("list", (ArrayList<Integer>) naborList);
                        startActivity(intent2);}// что кнопочка делает при нажаттии
                        // что кнопочка делает при нажаттии
                        catch (Exception e){

                        }
                    }
                });


        buttonsbrospish.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                try {
                    Intent intent2;
                    intent2 = new Intent(Pishevar.this, ViborRazdelaActivity.class);// уряяя
                    startActivity(intent2);

                }
                catch (Exception e){

                }
                    }
                });



















    }
}
