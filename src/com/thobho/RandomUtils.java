package com.thobho;

import java.util.Random;

public class RandomUtils {

    private static Random random = new Random();

    private RandomUtils(){
        // prywatny konstruktor, oznacza, że nie ma możliwości stworzenia instancji klasy,
        // ta klasa istnieje tylko po to aby posiadać metody pomocnicze, używane w wielu różnych miejscach
    }

    public static int randomInt(){
        return random.nextInt();
    }

    public static int randomInt(int boound){
        return random.nextInt(boound);
    }

    public static boolean randomBool(){
        return random.nextBoolean();
    }

    public static  <T> T getRandomFromArray(T[] array){
        return array[randomInt(array.length)];
    }
}
