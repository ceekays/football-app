package com.edmondkachale.footballapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FootballFanAdapter extends ArrayAdapter<FootballFan> {
    private List<FootballFan> fansList;
    private Context context;

    public FootballFanAdapter(@NonNull Context context, @NonNull List<FootballFan> fansList) {
        super(context, R.layout.football_fan_iten, fansList);

        this.context = context;
        this.fansList = fansList;
    }


    @Override
    public int getCount() {
        return this.fansList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        FootballFan footballFan = fansList.get(position);

        LayoutInflater inflater = LayoutInflater.from(this.context);
        convertView = inflater.inflate(R.layout.football_fan_iten, parent, false);

        TextView fanNameTextView = convertView.findViewById(R.id.fanNameTextView);
        TextView clubNameTextView = convertView.findViewById(R.id.clubNameTextView);

        fanNameTextView.setText(footballFan.getFanName());
        clubNameTextView.setText(footballFan.getClubName());

        return convertView;
    }
}
