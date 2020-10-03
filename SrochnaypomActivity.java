package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SrochnaypomActivity extends AppCompatActivity {


    private Button ukuz, srochpoperx,infarkt, allergy, reanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srochnaypom);

     ukuz= findViewById(R.id.butzmeiklesh);
     srochpoperx= findViewById(R.id.buttonsrochpoperx);
        infarkt = findViewById(R.id.but_sroch_infarkt);
        infarkt = findViewById(R.id.but_sroch_infarkt);
        allergy = findViewById(R.id.but_srochpom_allerg);
        reanim = findViewById(R.id.butt_sroch_pom_srr);





        ukuz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{   Intent intent;
                            intent = new Intent(SrochnaypomActivity.this, UcusCleshaActivity.class );// уряяя пепрлистываем

                            startActivity(intent);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });


        srochpoperx.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{   Intent intent;
                            intent = new Intent(SrochnaypomActivity.this, PoperxActivity.class );// уряяя пепрлистываем

                            startActivity(intent);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });

        infarkt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{   Intent intent;
                            intent = new Intent(SrochnaypomActivity.this, InfarctActivity.class );// уряяя пепрлистываем

                            startActivity(intent);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });

        allergy.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{   Intent intent;
                            intent = new Intent(SrochnaypomActivity.this, Alergy2Activity.class );// уряяя пепрлистываем

                            startActivity(intent);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });

        reanim.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{   Intent intent;
                            intent = new Intent(SrochnaypomActivity.this, SerdActivity.class );// уряяя пепрлистываем

                            startActivity(intent);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });




























    }
}
