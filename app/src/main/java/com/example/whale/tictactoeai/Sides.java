package com.example.whale.tictactoeai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class Sides extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.aryans.tictactoe.Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sides);
        Intent replay = getIntent();
    }
    public void sendX(View view){
        Intent Intent = new Intent(this, Game.class);
        String side ="x";
        Intent.putExtra(EXTRA_MESSAGE,side);
        startActivity(Intent);
    }

    public void sendO(View view){
        Intent Intent = new Intent(this, Game.class);
        String side="o";
        Intent.putExtra(EXTRA_MESSAGE,side);
        startActivity(Intent);
    }
}

