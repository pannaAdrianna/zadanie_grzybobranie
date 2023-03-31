package com.adaland.models;

/**
 * (twardość* - losowana; masa owocnika* - 25-50)
 */

public class Kolczastogłowy extends Muchomor {


    public Kolczastogłowy(int mass) {
        super(mass);
    }


    @Override
    public String toString() {

        return "Kolczastogłowy:\nmasa: %s, twardosc: %s, toksyny %s".formatted(getMass(), getHardness(), getToxicity());
    }
}
