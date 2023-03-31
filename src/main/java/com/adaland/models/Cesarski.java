package com.adaland.models;

import com.adaland.enums.Hardness;

import javax.validation.constraints.Min;

/**
 * muchomor cesarski
 * (twardość* - twardy; masa owocnika* - 50-75 )
 */

public class Cesarski extends Muchomor {


    public Cesarski(@Min(50) int mass) {
        super(mass);
    }

    @Override
    public Hardness getHardness() {
        return Hardness.TWARDY;
    }

    @Override
    public String toString() {

        return "Cesarski:\nmasa: %s, twardosc: %s, toksyny %s".formatted(getMass(), getHardness(), getToxicity());
    }

}
