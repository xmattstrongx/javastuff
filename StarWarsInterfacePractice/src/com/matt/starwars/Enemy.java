package com.matt.starwars;

public class Enemy implements Character {

    public String weapon = "lightsaber";

    public Enemy() {

    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks you!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    public void weaponDraw() {
        System.out.println("draw out weapon");
    }
}
