package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViborRazdelaActivity extends AppCompatActivity {

    private Button uho, organdixan,organpishevar,mochevidsys, systav, srochn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibor_razdela);

        uho = findViewById(R.id.buttonuho);
        organdixan = findViewById(R.id.buttondixan);
        organpishevar = findViewById(R.id.buttonpishevod);
        mochevidsys = findViewById(R.id.buttonmoch);
        systav = findViewById(R.id.buttonsystav);
        srochn = findViewById(R.id.buttonextrem);

        // звуки
       // final MediaPlayer mp = MediaPlayer.create(this, R.raw.puz);


        //  mp.start();



        uho.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     try {

                         Intent intent2;

                        intent2 = new Intent(ViborRazdelaActivity.this, Main6Activity.class );// уряяя пепрлистываем

                        startActivity(intent2);}
                     catch (Exception e){

                     }



                    }
                });


        organdixan.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{

                            Intent intent3;
                        intent3 = new Intent(ViborRazdelaActivity.this,  Org.class );// уряяя пепрлистываем

                        startActivity(intent3);}
                        catch (Exception e ){

                                                            // что кнопочка делает при нажаттии
                        }


                    }
                });

        organpishevar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      try{


                          Intent intent4;
                        intent4 = new Intent(ViborRazdelaActivity.this, Pishevar.class );// уряяя пепрлистываем

                        startActivity(intent4);}
                      catch(Exception e ){

                          // что кнопочка делает при нажаттии
                      }


                    }
                });

        mochevidsys.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       try{


                           Intent intent5;
                        intent5 = new Intent(ViborRazdelaActivity.this, Mochevid.class );// уряяя пепрлистываем

                        startActivity(intent5);}
                       catch (Exception e) {
                                                      // что кнопочка делает при нажаттии
                       }


                    }
                });


        systav.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     try{


                         Intent intent6;
                        intent6 = new Intent(ViborRazdelaActivity.this, Systav.class );// уряяя пепрлистываем

                        startActivity(intent6);}
                     catch(Exception e ){
                                                                // что кнопочка делает при нажаттии
                     }


                    }
                });

        srochn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try{


                            Intent intent7;
                            intent7 = new Intent(ViborRazdelaActivity.this, SrochnaypomActivity.class );// уряяя пепрлистываем

                            startActivity(intent7);}
                        catch(Exception e ){
                            // что кнопочка делает при нажаттии
                        }


                    }
                });














    }
}
