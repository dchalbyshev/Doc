package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class UcusCleshaActivity extends AppCompatActivity {

    private ImageView ukuszmei,clesh1,clesh2;
    private Button clesh_button1, clesh_button2;                                                     // переменная имэдж вью

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucus_clesha);


        clesh_button1 = findViewById(R.id.ukusKlesha);
        clesh_button2 = findViewById(R.id.ukusKlesha2);

        ukuszmei = findViewById(R.id.imageView);
        ukuszmei.setImageResource(R.drawable.ukuszmei);



        clesh_button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        clesh1 = findViewById(R.id.imageView);
                        clesh1.setImageResource(R.drawable.clesh1);


                    }
                });

        clesh_button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки
                        clesh2 = findViewById(R.id.imageView);
                        clesh2.setImageResource(R.drawable.clesh2);


                    }
                });





    }
}
