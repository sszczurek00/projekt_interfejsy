package org.example;

public abstract class Shake implements Jadalne,Pijalne{
    @Override
    public void jedz() {
        System.out.println("jedz a potem pij");
        pij();
    }
}
