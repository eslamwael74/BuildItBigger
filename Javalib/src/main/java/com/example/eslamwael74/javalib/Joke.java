package com.example.eslamwael74.javalib;

import java.util.Random;

public class Joke {

    String jokes[];
    Random random;

    public Joke() {

        jokes = new String[5];
        random = new Random();

        jokes[0] = "This is firstJoke:D";
        jokes[1] = "This is secondJoke:D";
        jokes[2] = "This is thirdJoke:D";
        jokes[3] = "This is forthJoke:D";
        jokes[4] = "This is fifthJoke:D";



    }

    public String getAJoke(){

        String randomJoke = jokes[random.nextInt(5)];

        return randomJoke;
    }

}
