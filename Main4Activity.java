package com.dchalbyshev.doctorinmypocket;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    private RadioGroup knopa;
    List<Integer> naborList2 = new ArrayList<>();
    List<Integer> pnevmonia = new ArrayList<>(Arrays.asList(3,9,11,12));       //3 сухой кашель, 9 плохоснижаемая втемпература
    List<Integer> pnevmonia4 = new ArrayList<>(Arrays.asList(3,10,11,12));     // 11 слабость 12 потливость
    List<Integer> pnevmonia5 = new ArrayList<>(Arrays.asList(3,10,11));
    List<Integer> pnevmonia6 = new ArrayList<>(Arrays.asList(10,11,13));
    List<Integer> pnevmonia8 = new ArrayList<>(Arrays.asList(9,11,13));
    List<Integer> pnevmonia9 = new ArrayList<>(Arrays.asList(9,11,12,13));
    List<Integer> pnevmonia7 = new ArrayList<>(Arrays.asList(3,11));
    List<Integer> pnevmonia2 = new ArrayList<>(Arrays.asList(9,11,12,13));
    List<Integer> pnevmonia3 = new ArrayList<>(Arrays.asList(9,11,12));
                                                                                  //создание списков
    List<Integer> ORVI = new ArrayList<>(Arrays.asList(10,20));
    List<Integer> ORVI2 = new ArrayList<>(Arrays.asList(10,20,22));
    List<Integer> ORVI3 = new ArrayList<>(Arrays.asList(10,20,22));
    List<Integer> ORVI4 = new ArrayList<>(Arrays.asList(10,18,20));
    List<Integer> ORVI5 = new ArrayList<>(Arrays.asList(10,18,20,22));
    List<Integer> ORVI6 = new ArrayList<>(Arrays.asList(10,18,20,22));         //1 першение в горле            20 головная боль
    List<Integer> nazofarengit = new ArrayList<>(Arrays.asList(7,10));            //2                           21 заложеннность носа
    List<Integer> nazofarengit2 = new ArrayList<>(Arrays.asList(1,10));
    List<Integer> nazofarengit3 = new ArrayList<>(Arrays.asList(1,10,22));
    List<Integer> nazofarengit4 = new ArrayList<>(Arrays.asList(7,10,22));
    List<Integer> nazofarengit5 = new ArrayList<>(Arrays.asList(1,22));
    List<Integer> nazofarengit6 = new ArrayList<>(Arrays.asList(7,22));                                                                        //3 сухой кашель                22 насморк
    List<Integer> traxeit= new ArrayList<>(Arrays.asList(3));                   //4                             23 слизисто-гнойный насморк (зеленого цвета)
    List<Integer> traxeit2= new ArrayList<>(Arrays.asList(3,10));                //5                             24 отодышка с затруднениием выдоха
    List<Integer> bronxit= new ArrayList<>(Arrays.asList(3,10));                 // 6 увеличение лимфоузлов -     25 длительный сухой кашель
    List<Integer> bronxit4= new ArrayList<>(Arrays.asList(3,10));                //7 боль в горле                26 всистящее дыхание
    List<Integer> bronxit2= new ArrayList<>(Arrays.asList(13));                 //8  высокая температура > 37.8    27 боль в желудке
    List<Integer> bronxit3= new ArrayList<>(Arrays.asList(10,13));                 //9 плхоснижаемая температура   28 боль в желудке, усиливающаяся натощак
    List<Integer> bronxAstma = new ArrayList<>(Arrays.asList(24));              //10 температура                29 тошнота
    List<Integer> bronxAstma2 = new ArrayList<>(Arrays.asList(25));             //11 слабость                   30 рвота, приносящая облегчение
    List<Integer> bronxAstma3 = new ArrayList<>(Arrays.asList(26));             //12 потливость                  32 рвота, неприносящая аоблегчение
    List<Integer> bronxAstma4 = new ArrayList<>(Arrays.asList(25,26));          //13  влажный кашель
    List<Integer> bronxAstma5 = new ArrayList<>(Arrays.asList(24,25,26));       //14  потеря обобняния/
    List<Integer> gaimorit = new ArrayList<>(Arrays.asList(23));             //15  охриплость
    List<Integer> gaimorit2 = new ArrayList<>(Arrays.asList(10,22,23));
    List<Integer> gaimorit3 = new ArrayList<>(Arrays.asList(20,22,23));            //16 Сухой кашель при вдохе, смехе
    List<Integer> frontid = new ArrayList<>(Arrays.asList(20,23));             //в отличии от гайморита головная боль в облассти лба
    List<Integer> frontid2 = new ArrayList<>(Arrays.asList(10,20,23));       // в отличии записать в выводе
    List<Integer> angina = new ArrayList<>(Arrays.asList(7,10));
    List<Integer> angina2 = new ArrayList<>(Arrays.asList(6,7,10));                      // 18 першение в горле //17 кашель сухой лающий
    List<Integer> lorengit = new ArrayList<>(Arrays.asList(15,17));
    List<Integer> lorengit2 = new ArrayList<>(Arrays.asList(17));
    List<Integer> lorengit3 = new ArrayList<>(Arrays.asList(15)); //  19 боль в глазах
    List<Integer> traxeiit = new ArrayList<>(Arrays.asList(16));
    List<Integer> gastrit = new ArrayList<>(Arrays.asList(27,29));
    List<Integer> gastrit2 = new ArrayList<>(Arrays.asList(27,29));
    List<Integer> gastrit3 = new ArrayList<>(Arrays.asList(27,29));
//jyyyyyyyyyyy
    List<Integer> iyzva_geludka = new  ArrayList<>(Arrays.asList(28));
    List<Integer> iyzva_geludka4 = new  ArrayList<>(Arrays.asList(28,29));
    List<Integer> iyzva_geludka5 = new  ArrayList<>(Arrays.asList(28,29,30));
    List<Integer> iyzva_geludka2 = new  ArrayList<>(Arrays.asList(29));
    List<Integer> iyzva_geludka3 = new  ArrayList<>(Arrays.asList(30));
    List<Integer> iyzva_geludka6 = new  ArrayList<>(Arrays.asList(29,30));
    List<Integer> COVID_19 = new  ArrayList<>(Arrays.asList(3,10,11, 14)); //3каш.сухой  14потеря обоняния отдышка  10температура
    List<Integer> COVID_191 = new  ArrayList<>(Arrays.asList(10,13, 14)); //13 каш влажный
    List<Integer> COVID_192 = new  ArrayList<>(Arrays.asList(3,10,11,14));                                    //  8 высок температура
    List<Integer> COVID_193 = new  ArrayList<>(Arrays.asList(3,11, 14)); //
    List<Integer> COVID_194 = new  ArrayList<>(Arrays.asList(10,13, 14));
    List<Integer> COVID_195 = new  ArrayList<>(Arrays.asList(10,11,13, 14));
    List<Integer> COVID_196 = new  ArrayList<>(Arrays.asList(3,10,11));
    List<Integer> COVID_197 = new  ArrayList<>(Arrays.asList(14));
  //  List<Integer> COVID_198 = new  ArrayList<>(Arrays.asList(8)); // одышка


    List<Integer> refluxOfagit  = new  ArrayList<>(Arrays.asList(31,52));
    List<Integer> refluxOfagit2  = new  ArrayList<>(Arrays.asList(52));
    List<Integer> refluxOfagit3  = new  ArrayList<>(Arrays.asList(31));  /// рефлюкс-зофагит
    List<Integer> holecistit = new  ArrayList<>(Arrays.asList(33,34));
    List<Integer> holecistit2 = new  ArrayList<>(Arrays.asList(34));
    List<Integer> holecistit3 = new  ArrayList<>(Arrays.asList(33));
    // холецестит
    List<Integer> pankreotit = new  ArrayList<>(Arrays.asList(35,36));// панкретиатит
    List<Integer> pankreotit2 = new  ArrayList<>(Arrays.asList(35,36,29));
    List<Integer> pankreotit3 = new  ArrayList<>(Arrays.asList(32,38));

    List<Integer> kolit = new  ArrayList<>(Arrays.asList(38));//колит
    List<Integer> gelKishKrovotech = new  ArrayList<>(Arrays.asList(40));//жеплудочно кишечные кровотечения
    List<Integer> gelKishKrovotech2 = new  ArrayList<>(Arrays.asList(41));
    List<Integer> gelKishKrovotech3 = new  ArrayList<>(Arrays.asList(11,40,41));
    List<Integer> mochecambol = new  ArrayList<>(Arrays.asList(42,43,44));// мочекаменная болезнь
    List<Integer> mochecambol2 = new  ArrayList<>(Arrays.asList(42));// мочекаменная болезнь
    List<Integer> ostrPiloNefr= new  ArrayList<>(Arrays.asList(10,45));//острый пилонефриит  8||10 45
    List<Integer> ostrPiloNefr2= new  ArrayList<>(Arrays.asList(10,45));//острый пилонефриит  8||10 45
    List<Integer> cestit= new  ArrayList<>(Arrays.asList(43,47));// цестит
    List<Integer> cestit2= new  ArrayList<>(Arrays.asList(47));// цестит
    List<Integer> cestit3= new  ArrayList<>(Arrays.asList(43));// цестит

    List<Integer> revmArtrit= new  ArrayList<>(Arrays.asList(48,49,50));//ревматоидный артрит
    List<Integer> revmArtrit2= new  ArrayList<>(Arrays.asList(48,50));//ревматоидный артрит

    List<Integer> artroz  = new  ArrayList<>(Arrays.asList(48)); // артроз


    // отдельные признаки
    List<Integer> limfo  = new  ArrayList<>(Arrays.asList(6));     // увеличеие лимфатических узлов
    List<Integer> bolvgorle = new  ArrayList<>(Arrays.asList(7));     //боль в горле
    List<Integer> pershenie = new  ArrayList<>(Arrays.asList(1));     //першение в горле
    List<Integer> golovnyabol = new  ArrayList<>(Arrays.asList(20));     //головная боль
    List<Integer> nasmork = new  ArrayList<>(Arrays.asList(22));     //насморк
    List<Integer> slabost = new  ArrayList<>(Arrays.asList(11));     //слаботсь
    List<Integer> temperatur = new  ArrayList<>(Arrays.asList(10));     //температура
    List<Integer> potlivost = new  ArrayList<>(Arrays.asList(12));     //температура



  //  List<Integer> COVID_197 = new  ArrayList<>(Arrays.asList(3,8,11));

    List<Integer>  iyzva_12_kishki= new ArrayList<>(Arrays.asList(0));      // боль в желудке через два часа после еды
                                                                           // боль в желудке в ночное время б тошнота  рвота
//kkk

    private TextView poleOut, poleOut2;
    private Button end;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle arguments = getIntent().getExtras();
        final List<Integer> naborList = arguments.getIntegerArrayList("list");
        poleOut = findViewById(R.id.poleOut);
        poleOut2 = findViewById(R.id.poleOut2);
        end = findViewById(R.id.end);

                                                                       //РАДИОКНОПЫ
       knopa = findViewById(R.id.radiogr);

       //poleOut2.setTextSize(18);

        knopa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButtonbig:
                        poleOut2.setTextSize(18);
                        break;
                    case R.id.radiobutnormal:
                        poleOut2.setTextSize(14);
                        break;
                }
            }
        });


        poleOut2.setText("К сожалению мы не смогли определить заболевание по указанным признакам, попробуйте ввести симптомы еще раз или обратитесь к врачу");
        poleOut2.setMovementMethod(new ScrollingMovementMethod());
    //   ScrollView scroller = new ScrollView(this);
        //TextView tv = new TextView(this);
       // tv.setText(R.string.my_text);
       // scroller.addView(tv);
       // scroller.addView(poleOut2);

        Collections.sort(naborList);
        if (naborList.size() > 0) {


            for (int i = 0; i < (naborList.size() - 1); i++) { //удалений одоинаковых
                if (naborList.get(i).equals(naborList.get(i + 1))) {
                    naborList.remove(i);
                    i--;
                }
            }

        }


                                     //  рповерка условий и вывод блоки if  else if
                                     //  рповерка условий и вывод блоки if  else if
        //одиночные симптомы


        if (naborList.equals(nasmork)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.nasmork)  );
        }
        if (naborList.equals(slabost)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.slabost)  );
        }
        if (naborList.equals(temperatur)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.temperatura)  );
        }



        if (naborList.equals(limfo)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.limfo)  );
        }
        if (naborList.equals(bolvgorle)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.bolvgorle)  );
        }
        if (naborList.equals(pershenie)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.pershenie)  );
        }
        if (naborList.equals( golovnyabol)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.golovnyabol) );
        }

        if (naborList.equals( potlivost)) {
            poleOut2.setText("");
            poleOut2.append( getString(R.string.potlivost) );
        }











        if (naborList.equals(refluxOfagit)) {                     /// рефлюкс-зофагит
            poleOut2.setText("");
            poleOut2.append("ЕФЛЮКС-ЭЗОФАГИТ \n "+  getString(R.string.refluxOfagit)  );
        }


        if (naborList.equals(refluxOfagit2)) {                     /// рефлюкс-зофагит
            poleOut2.setText("");
            poleOut2.append("ЕФЛЮКС-ЭЗОФАГИТ \n "+  getString(R.string.refluxOfagit)  );
        }


        if (naborList.equals(refluxOfagit3)) {                     /// рефлюкс-зофагит
            poleOut2.setText("");
            poleOut2.append("ЕФЛЮКС-ЭЗОФАГИТ \n "+  getString(R.string.refluxOfagit)  );
        }


        if (naborList.equals(holecistit)) {                     // холецестит
            poleOut2.setText("");
            poleOut2.append("ХОЛЕЦЕСТИТ \n" + getString(R.string.holrcistit)  );
        }

        if (naborList.equals(holecistit2)) {                     // холецестит
            poleOut2.setText("");
            poleOut2.append("ХОЛЕЦЕСТИТ \n" + getString(R.string.holrcistit)  );
        }

        if (naborList.equals(holecistit3)) {                     // холецестит
            poleOut2.setText("");
            poleOut2.append("ХОЛЕЦЕСТИТ \n" + getString(R.string.holrcistit)  );
        }

        if (naborList.equals(pankreotit)) {                     // панкреротит
            poleOut2.setText("");
            poleOut2.append (" ПАНКРЕАТИТ \n "  + getString(R.string.pancreotit) );
        }

        if (naborList.equals(pankreotit2)) {                     // панкреротит
            poleOut2.setText("");
            poleOut2.append (" ПАНКРЕАТИТ \n "  + getString(R.string.pancreotit) );
        }

        if (naborList.equals(pankreotit3)) {                     // панкреротит
            poleOut2.setText("");
            poleOut2.append (" ПАНКРЕАТИТ \n "  + getString(R.string.pancreotit) );
        }

        if (naborList.equals(kolit)) {                     // панкреротит
            poleOut2.setText("");
            poleOut2.append(" КОЛИТ \n    "   + getString(R.string.kolit) );
        }


        if (naborList.equals(gelKishKrovotech)) {                     //жеплудочно кишечные кровотечения
            poleOut2.setText("");
            poleOut2.append("ЖЕЛУДОЧНО-КИШЕЧНЫЕ КРОВОТЕЧЕНИЯ \n " + getString(R.string.gelkish) );
        }

        if (naborList.equals(gelKishKrovotech2)) {                     //жеплудочно кишечные кровотечения
            poleOut2.setText("");
            poleOut2.append("ЖЕЛУДОЧНО-КИШЕЧНЫЕ КРОВОТЕЧЕНИЯ \n " + getString(R.string.gelkish) );
        }

        if (naborList.equals(gelKishKrovotech3)) {                     //жеплудочно кишечные кровотечения
            poleOut2.setText("");
            poleOut2.append("ЖЕЛУДОЧНО-КИШЕЧНЫЕ КРОВОТЕЧЕНИЯ \n " + getString(R.string.gelkish) );
        }




        if (naborList.equals(mochecambol)) {                     // мочекаменная болезнь
            poleOut2.setText("");
            poleOut2.append(" МОЧЕКАМЕННАЯ БОЛЕЗНЬ \n " + getString(R.string.mochecam) );
        }

        if (naborList.equals(mochecambol)) {                     // мочекаменная болезнь
            poleOut2.setText("");
            poleOut2.append(" МОЧЕКАМЕННАЯ БОЛЕЗНЬ \n " + getString(R.string.mochecam) );
        }





        if (naborList.equals(  ostrPiloNefr)) {                     // острый пилонефрит
            poleOut2.setText("");
            poleOut2.append("  ПИЕЛОНЕФРИТ \n "  + getString(R.string.pielonefrit) );
        }


        if (naborList.equals(  ostrPiloNefr2)) {                     // острый пилонефрит
            poleOut2.setText("");
            poleOut2.append("  ПИЕЛОНЕФРИТ \n "  + getString(R.string.pielonefrit) );
        }


        if (naborList.equals(  cestit)) {                     // цестит
            poleOut2.setText("");
            poleOut2.append(" ЦИСТИТ \n " + getString(R.string.cistit) );
        }

        if (naborList.equals(  cestit2)) {                     // цестит
            poleOut2.setText("");
            poleOut2.append(" ЦИСТИТ \n " + getString(R.string.cistit) );
        }
        if (naborList.equals( cestit3 )) {                     // цестит
            poleOut2.setText("");
            poleOut2.append(" ЦИСТИТ \n " + getString(R.string.cistit) );
        }



        if (naborList.equals(  revmArtrit)) {                     // ревматоидный артрит
            poleOut2.setText("");
            poleOut2.append(" РЕВМАТОИДНЫЙ АРТРИТ \n "   + getString(R.string.revmatoidArtrit) );
        }

        if (naborList.equals(  revmArtrit2)) {                     // ревматоидный артрит
            poleOut2.setText("");
            poleOut2.append(" РЕВМАТОИДНЫЙ АРТРИТ \n "   + getString(R.string.revmatoidArtrit) );
        }



        if (naborList.equals(  artroz)) {                     // артроз
            poleOut2.setText("");
            poleOut2.append(" ОСТЕОАРТРОЗ \n "  + getString(R.string.osteoartroz) );
        }





        if (naborList.equals(pnevmonia)) {
             poleOut2.setText("");
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
                  );
        }

        if (naborList.equals(pnevmonia4)) {
            poleOut2.setText("");

            // tv.setText(R.string.my_text)
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }

        if (naborList.equals(pnevmonia5)) {
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }


        if (naborList.equals(pnevmonia6)) {
            poleOut2.setText("");
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }


        if (naborList.equals(pnevmonia7)) {
            poleOut2.setText("");
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }


        if (naborList.equals(pnevmonia8)) {
            poleOut2.setText("");
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }


        if (naborList.equals(pnevmonia9)) {
            poleOut2.setText("");
            poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
            );
        }


          if (naborList.equals(pnevmonia2)) {
              poleOut2.setText("");
              poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
              );
          }

         if (naborList.equals(pnevmonia3)) {
             poleOut2.setText("");
             poleOut2.append("ПНЕВМОНИЯ \n  " + getString(R.string.pnevmonia)
             );
         }

         if (naborList.equals(ORVI)) {
             poleOut2.setText("");
            poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
        }

          if (naborList.equals(ORVI2)) {
              poleOut2.setText("");
              poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
          }


          if (naborList.equals(ORVI3)) {
              poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
          }

          if (naborList.equals(ORVI4)) {
              poleOut2.setText("");
              poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
          }

          if (naborList.equals(ORVI5)) {
              poleOut2.setText("");
              poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
          }

          if (naborList.equals(ORVI6)) {
              poleOut2.setText("");
              poleOut2.append(" ОРВИ \n " + getString(R.string.ORVI));
          }

         if (naborList.equals(nazofarengit)) {
             poleOut2.setText("");
            // tv.setText(R.string.my_text)
            // scroller.addView(tv);
            poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

        }

          if (naborList.equals(nazofarengit2)) {
              poleOut2.setText("");
              poleOut2.setText("");
              // tv.setText(R.string.my_text)
              // scroller.addView(tv);
              poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

         }

        if (naborList.equals(nazofarengit3)) {
            poleOut2.setText("");
            poleOut2.setText("");
            // tv.setText(R.string.my_text)
            // scroller.addView(tv);
            poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

        }


        if (naborList.equals(nazofarengit4)) {
            poleOut2.setText("");
            poleOut2.setText("");
            // tv.setText(R.string.my_text)
            // scroller.addView(tv);
            poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

        }

        if (naborList.equals(nazofarengit5)) {
            poleOut2.setText("");
            poleOut2.setText("");
            // tv.setText(R.string.my_text)
            // scroller.addView(tv);
            poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

        }

        if (naborList.equals(nazofarengit6)) {
            poleOut2.setText("");
            poleOut2.setText("");
            // tv.setText(R.string.my_text)
            // scroller.addView(tv);
            poleOut2.append("НАЗОФАРИНГИТ " + getString(R.string.nazofarengit));

        }

          if (naborList.equals(traxeit)) {
              poleOut2.setText("");
            poleOut2.append(" ТРАХЕИТ \n " + getString(R.string.traxrit));
        }

          if (naborList.equals(traxeit2)) {
              poleOut2.setText("");
              poleOut2.append(" ТРАХЕИТ \n " + getString(R.string.traxrit));
          }


         if (naborList.equals(bronxit)) {
             poleOut2.setText("");
            poleOut2.append("БРОНХИТ \n " + getString(R.string. bronxit));
        }

         if (naborList.equals(bronxit2)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИТ \n " + getString(R.string. bronxit));
         }

         if (naborList.equals(bronxit3)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИТ \n " + getString(R.string. bronxit));
         }

          if (naborList.equals(bronxit4)) {
              poleOut2.setText("");
              poleOut2.append("БРОНХИТ \n " + getString(R.string. bronxit));
          }



         if (naborList.equals(bronxAstma)) {
             poleOut2.setText("");
            poleOut2.append("БРОНХИАЛЬНАЯ АСТМА \n" + getString(R.string.bronxAstma));
        }

         if (naborList.equals(bronxAstma2)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИАЛЬНАЯ АСТМА \n" + getString(R.string.bronxAstma));
        }

         if (naborList.equals(bronxAstma3)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИАЛЬНАЯ АСТМА \n" + getString(R.string.bronxAstma));
        }

         if (naborList.equals(bronxAstma4)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИАЛЬНАЯ АСТМА \n" + getString(R.string.bronxAstma));
        }

         if (naborList.equals(bronxAstma5)) {
             poleOut2.setText("");
             poleOut2.append("БРОНХИАЛЬНАЯ АСТМА \n" + getString(R.string.bronxAstma));
        }

         if (naborList.equals(gaimorit)) {
             poleOut2.setText("");
            poleOut2.append("ГАЙМОРИТ \n" + getString(R.string. gaimorit));
        }

         if (naborList.equals(gaimorit2)) {
             poleOut2.setText("");
             poleOut2.append("ГАЙМОРИТ \n" + getString(R.string. gaimorit));
         }


          if (naborList.equals(gaimorit3)) {
              poleOut2.setText("");
              poleOut2.append("ГАЙМОРИТ \n" + getString(R.string. gaimorit));
          }


          if (naborList.equals(frontid)) {
              poleOut2.setText("");
            poleOut2.append("ФРОНТИТ \n " + getString(R.string. frontit));
        }


         if (naborList.equals(frontid2)) {
             poleOut2.setText("");
             poleOut2.append("ФРОНТИТ \n " + getString(R.string. frontit));
        }



         if (naborList.equals(angina)) {
             poleOut2.setText("");
            poleOut2.append("АНГИНА  \n " + getString(R.string.angina));
        }

         if (naborList.equals(angina2)) {
             poleOut2.setText("");
             poleOut2.append("АНГИНА  \n " + getString(R.string.angina));
        }


        if (naborList.equals(lorengit2)) {
            poleOut2.setText("");
            poleOut2.append("ЛАРИНГИТ \n " + getString(R.string.laringit));
        }

        if (naborList.equals(lorengit3)) {
            poleOut2.setText("");
            poleOut2.append("ЛАРИНГИТ \n " + getString(R.string.laringit));
        }


        if (naborList.equals(traxeiit)) {
              poleOut2.setText("");
              poleOut2.append(" ТРАХЕИТ \n " + getString(R.string.traxrit));
          }



         if (naborList.equals(gastrit)) {
            poleOut2.setText("");
            poleOut2.append("ГАСТРИТ \n " + getString(R.string.gastrit));
        }
        if (naborList.equals(gastrit2)) {
            poleOut2.setText("");
            poleOut2.append("ГАСТРИТ \n " + getString(R.string.gastrit));
        }
        if (naborList.equals(gastrit3)) {
            poleOut2.setText("");
            poleOut2.append("ГАСТРИТ \n " + getString(R.string.gastrit));
        }

         if (naborList.equals(iyzva_geludka)) {
             poleOut2.setText("");
            poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
        }

         if (naborList.equals(iyzva_geludka2)) {
             poleOut2.setText("");
             poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
        }

         if (naborList.equals(iyzva_geludka3)) {
             poleOut2.setText("");
             poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
        }
          if (naborList.equals(iyzva_geludka4)) {
              poleOut2.setText("");
              poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
         }
         if (naborList.equals(iyzva_geludka5)) {
             poleOut2.setText("");
             poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
         }
        if (naborList.equals(iyzva_geludka6)) {
            poleOut2.setText("");
            poleOut2.append("ЯЗВА ЖЕЛУДКА  \n " +getString(R.string.yazvageludka));
        }

          if (naborList.equals(iyzva_12_kishki)) {
            poleOut2.append("ЯЗВА ДВЕНАДЦАТИПЕРСТНОЙ КИШКИ \n " +getString(R.string.yazva12));
        }
         if (naborList.equals(COVID_19)) {
             poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }

         if (naborList.equals(COVID_191)) {
             poleOut2.setText("");
             poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
         if (naborList.equals(COVID_192)) {
             poleOut2.setText("");
             poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
        if (naborList.equals(COVID_193)) {
            poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
        if (naborList.equals(COVID_194)) {
            poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
         if (naborList.equals(COVID_195)) {
             poleOut2.setText("");
             poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }


        if (naborList.equals(COVID_196)) {
            poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
        if (naborList.equals(COVID_197)) {
            poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        }
      /*  if (naborList.equals(COVID_198)) {
            poleOut2.setText("");
            poleOut2.append( "Коронавирусная инфекция COVID-19 \n " +getString(R.string.covid19));
        } */







     //   else if (naborList.equals(COVID_196)) {
    //        poleOut2.append( "Коронавирусная инфекция COVID-19 \n — потенциально тяжёлая острая" +
    //                " респираторная инфекция, вызываемая коронавирусом SARS-CoV-2 " +
     //               " Представляет собой опасное заболевание[, которое может протекать как в" +
     //               " форме острой респираторной вирусной инфекции лёгкого течения, так и в тяжёлой форме[" +
    //                ", специфические осложнения которой могут включать пневмонию." +
     //               " К наиболее распространённым симптомам" +
     //               " заболевания относятся повышенная температура тела, утомляемость и сухой кашель.");
    //    }
   //     else if (naborList.equals(COVID_197)) {
   //         poleOut2.append( "Коронавирусная инфекция COVID-19 \n — потенциально тяжёлая острая" +
    //                " респираторная инфекция, вызываемая коронавирусом SARS-CoV-2 " +
   //                 " Представляет собой опасное заболевание[, которое может протекать как в" +
    //                " форме острой респираторной вирусной инфекции лёгкого течения, так и в тяжёлой форме[" +
    //                ", специфические осложнения которой могут включать пневмонию." +
     //               " К наиболее распространённым симптомам" +
    //                " заболевания относятся повышенная температура тела, утомляемость и сухой кашель.");
   //     }
      //   else {
        //   poleOut2.append("К сожалению мы не смогли определить заболевание по" +
       //             " указанным признакам, попробуйте ввести симптомы еще раз");

     //   }


            end.setOnClickListener(
                    new View.OnClickListener() {
                        // @RequiresApi(api = Build.VERSION_CODES.N)
                        @Override
                        public void onClick(View v) {            // создание метода для кнопочки
                            // naborList2.sort(Comparator.<Integer>naturalOrder()); // придется подниматься до 8 дджавы
                            // что кнопочка делает при нажаттии
                            end.setText("Результат отображен");
                            naborList.clear();

                            for (int i = 0; i < naborList.size(); i++) {
                                Integer x = naborList.get(i);
                                poleOut2.append(x.toString() + " ");
                            }
            try {
                Intent intent2;
                intent2 = new Intent(Main4Activity.this, ViborRazdelaActivity.class);// уряяя

                startActivity(intent2);
            }
            catch (Exception e){

            }
                            //  poleOut2.append("Пока так");  //добавление текста в текст вью                                       // что кнопочка делает при нажаттии
                        }
                    });


            //  poleOut2.append( "\n" + "какой либо текст либо перемменную"); // добавление текста в текствью


        }
    }
