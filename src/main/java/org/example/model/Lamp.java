package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    //Lamp sınıfı için 3 adet instance variable tanımlaması.
    private LampType style;
    private boolean battery;
    private int globRating;

    //Lamp için constructor.
    public Lamp(LampType style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating(){
        return globRating;
    }


}
