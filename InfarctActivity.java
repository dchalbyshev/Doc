package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class InfarctActivity extends AppCompatActivity {
    private Button infarct, insult;
    private ImageView serd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infarct);

        infarct = findViewById(R.id.but_infarct);
        insult = findViewById(R.id.but_insult);

        serd = findViewById(R.id.imageView);
        serd.setImageResource(R.drawable.infarkt1);

        infarct.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        serd.setImageResource(R.drawable.infarkt1);
                    }
                });


        insult.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        serd.setImageResource(R.drawable.insult);
                    }
                });







    }
}
