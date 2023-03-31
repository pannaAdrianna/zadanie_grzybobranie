package com.adaland.models;

import com.adaland.enums.Toxicity;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SromotnikowyTest {

    @BeforeEach
    void setUp() {
    }

    @RepeatedTest(5)
    public void shouldReturnToxicityDealthy() {
        Faker faker = new Faker();
        Sromotnikowy sromotnikowy = new Sromotnikowy(faker.number().numberBetween(25, 49));
        assertEquals(Toxicity.DEATHLY, sromotnikowy.getToxicity());
    }

    @RepeatedTest(5)
    public void shouldReturnToxicityExtraDealthy() {
        Faker faker = new Faker();
        Sromotnikowy sromotnikowy = new Sromotnikowy(faker.number().numberBetween(50, 75));
        assertEquals(Toxicity.EXTRA_DEAHLY, sromotnikowy.getToxicity());
    }
}