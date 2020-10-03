package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PoperxActivity extends AppCompatActivity {

    private ImageView pop1;
    private Button hemlix, esliodin,buttondeti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poperx);

        hemlix = findViewById(R.id.priemheimlixa);
        esliodin = findViewById(R.id.esliodin);
        buttondeti = findViewById(R.id.buttondeti);

        pop1 = findViewById(R.id.imageView);
        pop1.setImageResource(R.drawable.poperx1);

        hemlix.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        pop1.setImageResource(R.drawable.poperx1);
                    }
                });

        esliodin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        pop1.setImageResource(R.drawable.poperx2);
                    }
                });



        esliodin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {            // создание метода для кнопочки

                        pop1.setImageResource(R.drawable.poperx3);
                    }
                });





    }
}
