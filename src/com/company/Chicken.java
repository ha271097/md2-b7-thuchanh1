package com.company;

public class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat() {
        return "chet toi";
    }

    @Override
    public String makeSound() {
        return "Cuc Cuc";

    }
}
