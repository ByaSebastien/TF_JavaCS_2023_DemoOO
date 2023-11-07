package be.btorm.utils;

import java.util.Random;

public class Dice {

    public static int roll(int nbFaces){
        Random rng = new Random();
        return rng.nextInt(nbFaces) + 1;
    }


}
