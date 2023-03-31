package com.adaland.models;


import com.adaland.enums.Toxicity;

/**
 * (twardość* - losowana; masa owocnika*- 25-75; toksyny* - zabójcze dla masy
 * owocnika <50, w p.p. wyjątkowo zabójcze)
 */

public class Sromotnikowy extends Muchomor {


    public Sromotnikowy(int mass) {
        super(mass);
    }

    @Override
    public String toString() {

        return "Sromotnikowy:\nmasa: %s, twardosc: %s, toksyny %s".formatted(getMass(), getHardness(), getToxicity());
    }

    @Override
    public Toxicity getToxicity() {
        if (getMass() < 50) setToxicity(Toxicity.DEATHLY);
        else setToxicity(Toxicity.EXTRA_DEAHLY);
        return super.getToxicity();
    }

}
