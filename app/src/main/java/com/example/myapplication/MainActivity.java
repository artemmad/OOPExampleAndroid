package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     public TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        debugText=(TextView) findViewById(R.id.debugText);
        Robot Arni = new Robot("Arnold Shwarzneager", 10000, debugText);
        Arni.run();
        Arni.printInfo();
        Unit Valdemar = new Robot("Valdemar", 100, debugText);
        Valdemar.printInfo();
    }
}
