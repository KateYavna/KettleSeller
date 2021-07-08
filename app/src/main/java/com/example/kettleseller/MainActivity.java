package com.example.kettleseller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String trafic = new String("Машка, привет! Как ты? У Ани тут день рождения был, так я ей подарок так долго\n" +
                "выбирала… прямо в голову ничего не лезло. Короче, чайник ей купила. А че, классная тема\n" +
                "– всегда пригодится, и с размером угадывать не надо. Я думаю Юле тоже чайник подарить,\n" +
                "когда у нее ДР будет. Или кофеварку… Короче, что-нибудь в таком духе.");
        ArrayList<String> names = new ArrayList();
        names.add("Ан");
        names.add("Юл");
        names.add("Кат");
        names.add("Маш");
        names.add("Ван");
        names.add("Пет");
        ArrayList<String> usedNames = new ArrayList();
        if (trafic.contains("чайник")) {
            Log.d("MyLog", "This text contains чайник");
            for (int i = 0; i < names.size(); i++) {
                if (trafic.contains(names.get(i))) {
                    usedNames.add(names.get(i) + "я/а");
                } else Log.d("MyLog", "This text doesn't contain " + names.get(i) + "я/а");
            }
        }
        if (trafic.contains("чайник")) {
            Log.d("MyLog", "Used names:");
            for (int j = 0; j <= usedNames.size(); j++) {
                Log.d("MyLog", usedNames.get(j));
            }
        }
    }
}

