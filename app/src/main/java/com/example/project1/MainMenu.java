package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button mButtonSpace;
    private Button mButtonOcean;
    private Button mButtonGrowing;
    private Button mButtonAnimals;
    private Button mButtonAnathomy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mButtonSpace = findViewById(R.id.ButtonTheme1);
        mButtonOcean = findViewById(R.id.ButtonTheme2);
        mButtonGrowing = findViewById(R.id.ButtonTheme3);
        mButtonAnimals = findViewById(R.id.ButtonTheme4);
        mButtonAnathomy = findViewById(R.id.ButtonTheme5);
        mButtonSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity.newIntent(MainMenu.this, 1);
                startActivity(intent);
            }
        });
        mButtonOcean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity.newIntent(MainMenu.this, 2);
                startActivity(intent);
            }
        });
        mButtonGrowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity.newIntent(MainMenu.this, 3);
                startActivity(intent);
            }
        });
        mButtonAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity.newIntent(MainMenu.this, 4);
                startActivity(intent);
            }
        });
        mButtonAnathomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = MainActivity.newIntent(MainMenu.this, 5);
                startActivity(intent);
            }
        });

    }
}