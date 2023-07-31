package com.example.worldcupapp;

public class CountryModelClass {
    private String country_name, cup_win_count;
    private int flag_img;

    public CountryModelClass(String country_name, String cup_win_count, int flag_img) {
        this.country_name = country_name;
        this.cup_win_count = cup_win_count;
        this.flag_img = flag_img;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCup_win_count() {
        return cup_win_count;
    }

    public void setCup_win_count(String cup_win_count) {
        this.cup_win_count = cup_win_count;
    }

    public int getFlag_img() {
        return flag_img;
    }

    public void setFlag_img(int flag_img) {
        this.flag_img = flag_img;
    }
}

