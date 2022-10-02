package org.example;

public class ShakeTruskawkowy extends Shake implements Smak {


    @Override
    public void pij() {
        System.out.println("pij");
    }

    @Override
    public void smak() {
        System.out.println("truskawka");
    }
}
