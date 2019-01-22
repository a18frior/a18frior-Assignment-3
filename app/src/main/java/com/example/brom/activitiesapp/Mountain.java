package com.example.brom.activitiesapp;
public class Mountain {
    private String namn;
    private String plats;
    private int hojd;

    public Mountain(){


        super();
    }


    public Mountain(String namn, String plats, int hojd){
        super();
        this.namn= namn;
        this.plats=plats;
        this.hojd=hojd;
    }
    public String info(){
        String tmp;
        tmp= plats+""+ hojd;
        return tmp;
    }

    @Override
    public String toString() {

        return this.namn;
    }
}