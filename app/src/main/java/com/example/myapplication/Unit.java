package com.example.myapplication;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public abstract class Unit implements Runable, Printable {
    protected String name;
    private int health;
    protected TextView outputText;

    public Unit(String name, int health, TextView outputText){
        this.name = name;
        this.health = health;
        this.outputText = outputText;
    }

    public void printInfo(){
        outputText.append("Hello, my name is " + name + " and I have got "+ health + " health points\n" );
    }

    public abstract void run();
}
