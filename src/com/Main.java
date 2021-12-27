package com;

import com.Calculations;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArr = new int[10];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(randomArr.length);
        }
        Calculations c = new Calculations();
        c.fillArrayPaired(randomArr);
        c.fillRandom(randomArr);
        c.sumMultiplesThree(randomArr);
        c.mean(randomArr);
        c.sumPaired(randomArr);
        c.ascendingOrder(randomArr);
        c.smallestValue(randomArr);
        c.greaterImportance(randomArr);
        c.sumPairedValues(randomArr);
        c.firstTwentyASCI();

    }




}
