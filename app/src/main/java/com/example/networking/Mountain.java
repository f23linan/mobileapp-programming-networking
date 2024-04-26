package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    public String ID;
    @SerializedName("name")
    public String name;

    public Mountain(){
        name="Namn:";
    }

    public Mountain(String name){
        this.name=name;
    }
    @Override public String toString(){
        return name;
    }

    public String getTitle(){
        return name;
    }
}

