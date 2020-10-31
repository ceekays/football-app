package com.edmondkachale.footballapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView fansListView = findViewById(R.id.fansListView);

        FootballFanAdapter adapter = new FootballFanAdapter(getApplicationContext(), getFans());

        fansListView.setAdapter(adapter);
    }

    List<FootballFan> getFans() {
        List<FootballFan> fansList = new ArrayList<>();

        fansList.add(new FootballFan("Moses Kaira", "Man U FC"));
        fansList.add(new FootballFan("Kenneth Kanjanja", "Chelsea FC"));
        fansList.add(new FootballFan("Waliko Sichinga", "Flames FC"));
        fansList.add(new FootballFan("Jacqueline Jailos", "Juventus FC"));

        return fansList;
    }
}
