package com.adaland.models;

import com.adaland.enums.Hardness;

/**
 * ugotuj() - która twardość każdego grzyba redukuje do minimalnej, a w przypadku
 * muchomora szarawego dodatkowo zmienia zawartość toksyn do stanu "nieobecne".
 * ➔ isTrujacy() zwracającą false dla muchomora cesarskiego, kolczastogłowego oraz szarawego (jeśli w tym ostatnim poziom toksyn jest nieobecny). W p.p. true
 */
public interface MushroomActions {

    default Muchomor ugotuj(Muchomor muchomor) {
        muchomor.setHardness(Hardness.MIEKKI);
        return muchomor;
    }


    default boolean isTrujacy() {
        return false;
    }


}
