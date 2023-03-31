package com.adaland.models;

import com.adaland.enums.Hardness;
import com.adaland.enums.Toxicity;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Random;


@ToString
public abstract class Muchomor implements MushroomActions {
    @Min(message = "Min value 25", value = 25)
    @Max(message = "Max value 75", value = 75)
    private int mass;
    private Hardness hardness;
    private Toxicity toxicity;

    public Muchomor(int mass) {
        this.mass = mass;
        this.hardness = Hardness.values()[new Random().nextInt(Hardness.values().length)];
    }

    public int getMass() {
        return mass;
    }


    public Hardness getHardness() {
        return hardness;
    }

    public void setHardness(Hardness hardness) {
        this.hardness = hardness;
    }

    public Toxicity getToxicity() {
        return toxicity;
    }

    public void setToxicity(Toxicity toxicity) {
        this.toxicity = toxicity;
    }
}
