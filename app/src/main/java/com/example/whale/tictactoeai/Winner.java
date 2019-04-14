package com.example.whale.tictactoeai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
    String winner="";
    String AIside="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        Intent getWinner=getIntent();
        winner = getWinner.getStringExtra(Game.EXTRA_MESSAGE1);
        AIside=getWinner.getStringExtra(Game.EXTRA_MESSAGE2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextView textView =(TextView)findViewById(R.id.textView2);
        /*if (winner.equals("x")){
            textView.setText("X wins!");
        }
        else if(winner.equals("o")){
            textView.setText("O wins!");
        }
        else if(winner.equals("none")){
            textView.setText("It's a draw!");
        }*/
        switch (winner){
            case "x":textView.setText("X wins!");
                break;
            case "o":textView.setText("O wins!");
                break;
            case "none":textView.setText("It's a draw!");
                break;
        }
        TextView showAI=(TextView)findViewById(R.id.textView3);
        if(winner.equals(AIside)){
            showAI.setText("AI wins");
        }
        else{
            showAI.setText("You Win!!!");
        }
    }
    public void replay(View view){
        Intent intent = new Intent(this,Sides.class);
        startActivity(intent);
    }
}
