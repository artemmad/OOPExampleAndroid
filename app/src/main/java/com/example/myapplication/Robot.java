package com.example.myapplication;

import android.widget.TextView;

public class Robot extends Unit {

    private int energy = 100;

    public Robot(String name, int health, TextView text) {
        super(name, health,text);
    }

    @Override
    public void run() {
        outputText.append(name + " "+"is rolling... \n");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        outputText.append( "and " +energy + " points of energy");
    }
}
