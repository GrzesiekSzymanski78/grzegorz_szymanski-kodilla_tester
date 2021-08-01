package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car {

    public int speed;

    public Ferrari(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 50;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }
}