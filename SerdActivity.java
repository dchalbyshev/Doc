package com.dchalbyshev.doctorinmypocket;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SerdActivity extends AppCompatActivity {

    private ImageView serdleg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serd);

        serdleg = findViewById(R.id.imageView);
        serdleg.setImageResource(R.drawable.serdlegreanim);





    }
}
