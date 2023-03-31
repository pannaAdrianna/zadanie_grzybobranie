package com.adaland.models;


import com.adaland.enums.Hardness;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CesarskiTest {

    @BeforeEach
    void setUp() {

    }


    @RepeatedTest(5)
    public void shouldReturnHardnessTwardy() {

        Cesarski cesarski = new Cesarski(25);
        assertEquals(Hardness.TWARDY, cesarski.getHardness());

    }

    @RepeatedTest(5)
    public void shouldReturnMass() {
        Faker faker = new Faker();
        Cesarski cesarski = new Cesarski(faker.number().numberBetween(50, 75));
        boolean min = cesarski.getMass() >= 50;
        boolean max = cesarski.getMass() <= 75;
        assertTrue(min && max);
    }


}