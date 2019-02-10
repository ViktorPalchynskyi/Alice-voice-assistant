package com.example.vp.alisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.startapp.android.publish.adsCommon.AutoInterstitialPreferences;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Content extends AppCompatActivity {



    ImageView info;


    String[] listViewText = new String[]{
            "Основные", "Звуки", "Умные колонки", "Аудиокниги", "Телевизор", "Телофоны", "Windows", "Приложения и сайты", "Игры", "Новости", "Для детей", "Музыка и радио","Камера","Словари","Погода","Калькулятор","Таймеры и Будильники","Мести и маршруты","Навигатор","География","История","Биология","Физика и Химия","Люди","Напоминания","Праздники","Календарь","Секретые команды","Кухня","Покупки"
    };

    int[] listViewImage = new int[]{
            R.drawable.main, R.drawable.sounds, R.drawable.smart_loudspeakers, R.drawable.audiobook, R.drawable.tv, R.drawable.phone, R.drawable.windows, R.drawable.app, R.drawable.games, R.drawable.news, R.drawable.for_children, R.drawable.music, R.drawable.camera,R.drawable.dictionary,R.drawable.cloud, R.drawable.calculate, R.drawable.alarm,R.drawable.places, R.drawable.navigation,R.drawable.geography,R.drawable.history,R.drawable.biology,R.drawable.phisics, R.drawable.people, R.drawable.list,R.drawable.holiday, R.drawable.calendar,R.drawable.secret,R.drawable.kitchen,R.drawable.shoppping
    };

    int [] listArrow = new int[]{
            R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "201242710", true);
        StartAppAd.enableAutoInterstitial();

        setContentView(R.layout.activity_content);




        List<HashMap<String, String>> arrList = new ArrayList<>();

        for (int i = 0; i <30; i++){
            HashMap<String, String> hm = new HashMap<>();
            hm.put("list_view_title", listViewText[i]);
            hm.put("list_view_image", Integer.toString(listViewImage[i]));
            hm.put("arrow_image", Integer.toString(listArrow[i]));
            arrList.add(hm);
        }
        String [] from = {"list_view_image", "list_view_title","arrow_image"};
        int [] to = {R.id.list_view_image, R.id.list_view_title, R.id.arrow_image};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), arrList, R.layout.my_list,from,to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){

                    case 0:
                        startActivity(new Intent(getApplicationContext(), Main.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), com.example.vp.alisa.Sounds.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), com.example.vp.alisa.SmartLoudspeakers.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), Audiobooks.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), TV.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(), Phones.class));
                        break;
                    case 6:
                        startActivity(new Intent(getApplicationContext(), Windows.class));
                        break;
                    case 7:
                        startActivity(new Intent(getApplicationContext(), App.class));
                        break;
                    case 8:
                        startActivity(new Intent(getApplicationContext(), Games.class));
                        break;
                    case 9:
                        startActivity(new Intent(getApplicationContext(), News.class));
                        break;
                    case 10:
                        startActivity(new Intent(getApplicationContext(), Children.class));
                        break;
                    case 11:
                        startActivity(new Intent(getApplicationContext(), Music.class));
                        break;
                    case 12:
                        startActivity(new Intent(getApplicationContext(), Camera.class));
                        break;
                    case 13:
                        startActivity(new Intent(getApplicationContext(), Dictionary.class));
                        break;
                    case 14:
                        startActivity(new Intent(getApplicationContext(), Cloud.class));
                        break;
                    case 15:
                        startActivity(new Intent(getApplicationContext(), Calc.class));
                        break;
                    case 16:
                        startActivity(new Intent(getApplicationContext(), Alarm.class));
                        break;
                    case 17:
                        startActivity(new Intent(getApplicationContext(), Places.class));
                        break;
                    case 18:
                        startActivity(new Intent(getApplicationContext(), Navigation.class));
                        break;
                    case 19:
                        startActivity(new Intent(getApplicationContext(), Geography.class));
                        break;
                    case 20:
                        startActivity(new Intent(getApplicationContext(), History.class));
                        break;
                    case 21:
                        startActivity(new Intent(getApplicationContext(), Biology.class));
                        break;
                    case 22:
                        startActivity(new Intent(getApplicationContext(), Physics.class));
                        break;
                    case 23:
                        startActivity(new Intent(getApplicationContext(), People.class));
                        break;
                    case 24:
                        startActivity(new Intent(getApplicationContext(), Memory.class));
                        break;
                    case 25:
                        startActivity(new Intent(getApplicationContext(), Holidays.class));
                        break;
                    case 26:
                        startActivity(new Intent(getApplicationContext(), Calender.class));
                        break;
                    case 27:
                        startActivity(new Intent(getApplicationContext(), Secret.class));
                        break;
                    case 28:
                        startActivity(new Intent(getApplicationContext(), Kitchen.class));
                        break;
                    case 29:
                        startActivity(new Intent(getApplicationContext(), Shop.class));
                        break;




                }

            }
        });

        info = (ImageView) findViewById(R.id.btn_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(), Info.class));

            }
        });


        StartAppAd.setAutoInterstitialPreferences(
                new AutoInterstitialPreferences()
                        .setActivitiesBetweenAds(5)
        );

    }


}
