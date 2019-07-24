package com.game.farmer.digs;

import java.util.Random;

public class Dig {
    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(12)+1;
    }
}
