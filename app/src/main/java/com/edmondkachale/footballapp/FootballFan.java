package com.edmondkachale.footballapp;

public class FootballFan {
    private String fanName;
    private String clubName;

    FootballFan(String fanName, String clubName) {
        this.fanName = fanName;
        this.clubName = clubName;
    }

    public String getFanName() {
        return fanName;
    }

    public String getClubName() {
        return clubName;
    }
}
