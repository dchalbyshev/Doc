package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AlergyActivity extends AppCompatActivity {
private ImageView alerdgy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alergy);
 alerdgy = findViewById(R.id.imageView);
 alerdgy.setImageResource(R.drawable.alergy);


    }
}
