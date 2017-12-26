package com.example.eslamwael74.javalib;

import java.util.Random;

public class Joke {

    String jokes[];
    Random random;

    public Joke() {

        jokes = new String[3];
        random = new Random();

        jokes[0] = "This is firstjoke:D";
        jokes[1] = "This is secondjoke:D";
        jokes[2] = "This is thirdjoke:D";



    }

    public String getAJoke(){

        return jokes[0];
    }

}
