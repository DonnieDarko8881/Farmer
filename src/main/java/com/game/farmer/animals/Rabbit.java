package com.game.farmer.animals;
import javafx.util.Pair;

public class Rabbit {


    public Pair addToDequeOffRabbit(int rabbitsOfUser, int rabbitsOfFarm, int randomNumberBlue, int randomNumberRed) {

        if (randomNumberRed <= 6 && randomNumberBlue <= 6 && rabbitsOfUser == 0) {
            if (rabbitsOfFarm > 0) {
                rabbitsOfFarm--;
                rabbitsOfUser++;
            }
            return  new Pair(rabbitsOfUser,rabbitsOfFarm);
        } else if (rabbitsOfUser > 0 && randomNumberRed <= 6 && randomNumberBlue <= 6) {

            int currentNumberRabbit = rabbitsOfUser;
            for (int i = 0; i < Math.floor((currentNumberRabbit + 2) / 2); i++) {
                if (rabbitsOfFarm > 0) {
                    rabbitsOfFarm--;
                    rabbitsOfUser++;
                }
            }
            return  new Pair(rabbitsOfUser,rabbitsOfFarm);
        } else if (rabbitsOfUser > 0 && (randomNumberRed <= 6 || randomNumberBlue <= 6)) {

            int currentNumberRabbit = rabbitsOfUser;
            for (int i = 0; i < Math.floor((currentNumberRabbit + 1) / 2); i++) {
                if (rabbitsOfFarm > 0) {
                    rabbitsOfFarm--;
                    rabbitsOfUser++;
                }
            }
            return  new Pair(rabbitsOfUser,rabbitsOfFarm);
        }


        return  new Pair(rabbitsOfUser,rabbitsOfFarm);
    }
}



