package com.adaland.models;

import com.adaland.enums.Toxicity;

/**
 * (twardość* - losowana; masa owocnika* - 25-75; toksyny* = trujące, rok
 * odkrycia gatunku - 1783)
 */
public class Szarawy extends Muchomor {

    private int year = 1783;

    public Szarawy(int mass) {
        super(mass);
    }


    @Override
    public String toString() {

        return "Szarawy:\nmasa: %s, twardosc: %s, toksyny %s, rok %s".formatted(getMass(), getHardness(), getToxicity(), year);
    }

    @Override
    public Toxicity getToxicity() {
        return Toxicity.POISONOUS;
    }

    public int getYear() {
        return year;
    }

    @Override
    public Muchomor ugotuj(Muchomor muchomor) {
        muchomor.setToxicity(Toxicity.ABSENT);
        return super.ugotuj(muchomor);
    }

    @Override
    public boolean isTrujacy() {
        if (getToxicity().equals(Toxicity.ABSENT)) return false;
        else return true;
    }


}
