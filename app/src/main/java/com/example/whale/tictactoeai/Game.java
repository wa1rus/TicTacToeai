package com.example.whale.tictactoeai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Random;


public class Game extends AppCompatActivity {

    String message = "";
    String message1 = "";
    String winner = "";
    int turnCounter = 0;
    TextView pressed ;
    TextView pressed2;

    TextView button1;
    TextView button2;
    TextView button3;
    TextView button4;
    TextView button5;
    TextView button6;
    TextView button7;
    TextView button8;
    TextView button9;

    TextView[] corner = {button1, button3, button7, button9};
    TextView[] sidepiece = {button2, button4, button6, button8};
    TextView[] center = {button5};

    TextView[] row1 = {button1, button2, button3};
    TextView[] row2 = {button4, button5, button6};
    TextView[] row3 = {button7, button8, button9};

    TextView[] column1 = {button1, button4, button7};
    TextView[] column2 = {button2, button5, button8};
    TextView[] column3 = {button3, button5, button9};

    TextView[] diag1 = {button1, button5, button9};
    TextView[] diag2 = {button3, button5, button7};

    TextView[] all = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
    TextView[][] all2 = {row1, row2, row3, column1, column2, column3, diag1, diag2};
    TextView[][]rows={row1,row2,row3};
    TextView[][]columns={column1,column2,column3};
    TextView[][]diags={diag1,diag2};
    String AIside="";

    private class button{
        int diagonal;
        int column;
        int row;
        private button(int diagonal, int column,int row){
            this.diagonal=diagonal;
            this.column=column;
            this.row=row;
        }
        private TextView[] tellDiag() {
            switch (diagonal) {
                case 1:
                    return diag1;

                case 2:
                    return diag1;
                default:
                    return null;
            }

        }
        private TextView[] tellCol() {
            switch (column) {
                case 1:
                    return column1;
                case 2:
                    return column2;
                case 3:
                    return column3;
                default:
                    return null;
            }
        }
        private TextView [] tellRow() {
            switch (row) {
                case 1:
                    return row1;

                case 2:
                    return row2;
                case 3:
                    return row3;
                default:
                    return null;
            }
        }

        public void main(String[] args){
            button button10= new button(1,1,1);
            button button20= new button(0,2,1);
            button button30= new button(2,3,1);
            button button40= new button(0,1,2);
            button button50= new button(3,2,2);
            button button60= new button(0,3,2);
            button button70= new button(2,1,3);
            button button80= new button(0,2,3);
            button button90= new button(1,3,3);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        message = intent.getStringExtra(Sides.EXTRA_MESSAGE);
        message1 = message;
        if (message.equals("o")) {
            turnCounter += 1;
            AIside="x";
        }
        else{
            AIside="o";
        }

        button button10= new button(1,1,1);
        button button20= new button(0,2,1);
        button button30= new button(2,3,1);
        button button40= new button(0,1,2);
        button button50= new button(3,2,2);
        button button60= new button(0,3,2);
        button button70= new button(2,1,3);
        button button80= new button(0,2,3);
        button button90= new button(1,3,3);

        button1 = (TextView) findViewById(R.id.button1);
        button2 = (TextView) findViewById(R.id.button2);
        button3 = (TextView) findViewById(R.id.button3);
        button4 = (TextView) findViewById(R.id.button4);
        button5 = (TextView) findViewById(R.id.button5);
        button6 = (TextView) findViewById(R.id.button6);
        button7 = (TextView) findViewById(R.id.button7);
        button8 = (TextView) findViewById(R.id.button8);
        button9 = (TextView) findViewById(R.id.button9);


        corner[0] = button1;
        corner[1] = button3;
        corner[2] = button7;
        corner[3] = button9;

        sidepiece[0]=button2;
        sidepiece[1]=button4;
        sidepiece[2]=button6;
        sidepiece[3]=button8;

        center[0] = button5;

        row1[0]=button1;
        row1[1]=button2;
        row1[2]=button3;

        row2[0]=button4;
        row2[1]=button5;
        row2[2]=button6;

        row3[0]=button7;
        row3[1]=button8;
        row3[2]=button9;

        column1[0]=button1;
        column1[1]=button4;
        column1[2]=button7;

        column2[0]=button2;
        column2[1]=button5;
        column2[2]=button8;

        column3[0]=button3;
        column3[1]=button6;
        column3[2]=button9;

        diag1[0]=button1;
        diag1[1]=button5;
        diag1[2]=button9;

        diag2[0]=button3;
        diag2[1]=button5;
        diag2[2]=button7;

        all[0]=button1;
        all[1]=button2;
        all[2]=button3;
        all[3]=button4;
        all[4]=button5;
        all[5]=button6;
        all[6]=button7;
        all[7]=button8;
        all[8]=button9;

        all2[0]=row1;
        all2[1]=row2;
        all2[2]=row3;
        all2[3]=column1;
        all2[4]=column2;
        all2[5]=column3;
        all2[6]=diag1;
        all2[7]=diag2;

        rows[0]=row1;
        rows[1]=row2;
        rows[2]=row3;

        columns[0]=column1;
        columns[1]=column2;
        columns[2]=column3;

        diags[0]=diag1;
        diags[1]=diag2;

        TextView[] row1 = {button1, button2, button3};
        TextView[] row2 = {button4, button5, button6};
        TextView[] row3 = {button7, button8, button9};

        TextView[] column1 = {button1, button4, button7};
        TextView[] column2 = {button2, button5, button8};
        TextView[] column3 = {button3, button5, button9};

        TextView[] diag1 = {button1, button5, button9};
        TextView[] diag2 = {button3, button5, button7};

        TextView[] all = {button1, button2, button3, button4, button5, button6, button7, button8, button9};
        TextView[][] all2 = {row1, row2, row3, column1, column2, column3, diag1, diag2};
        TextView[][]rows={row1,row2,row3};
        TextView[][]columns={column1,column2,column3};
        TextView[][]diags={diag1,diag2};
    }
    boolean inCenter=false;
    boolean inSidepiece=false;
    boolean priorityCorner=false;
    boolean weirdthing = false;

    public void AI1(View view) {

        if ((message1.equals("x") && turnCounter == 1) || (message1.equals("o") && turnCounter == 2)) {
            if (Arrays.asList(center).contains(pressed) ) {
                inCenter=true;
                switch1(null);
            } else if (button5.getText().equals("")) {
                if(Arrays.asList(sidepiece).contains(pressed)){
                    Log.d("DEBUG","yo");
                    inSidepiece=true;
                    priorityCorner=true;
                }
                switch5(null);
            }

        } else if ((message1.equals("x") && turnCounter %2 != 0 ) || (message1.equals("o") && turnCounter %2 == 0)){
            int elseCounter=0;
            boolean works=false;
            int weirdCounter=0;
            for(TextView press:sidepiece){
                if (press.getText()!=""){
                    weirdCounter+=1;
                }
            if (weirdCounter<2){

            }
            }
            for (int x = 0; x < all2.length; x++) {
                TextView[] y = all2[x];
                if(message.equals("x")){
                    if ((y[0].getText() + "" + y[1].getText()).equals("OO")) {
                        if(y[2].getText()==""){
                            pressed2 = y[2];
                            press(pressed2);
                            works=true;
                        }
                    }
                    else if ((y[1].getText() + "" + y[2].getText()) .equals("OO")) {
                        if(y[0].getText()==""){
                            pressed2 = y[0];
                            press(pressed2);
                            works=true;
                        }
                    }
                    else if ((y[0].getText() + "" + y[2].getText()) .equals("OO")) {
                        if(y[1].getText()==""){
                            pressed2 = y[1];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[0].getText() + "" + y[1].getText()) .equals("XX")) {
                        if(y[2].getText()==""){
                            pressed2 = y[2];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[0].getText() + "" + y[2].getText()) .equals("XX")) {
                        if(y[1].getText()==""){
                            pressed2 = y[1];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[1].getText() + "" + y[2].getText()) .equals("XX")) {
                        if(y[0].getText()==""){
                            pressed2 = y[0];
                            press(pressed2);
                            works=true;}
                    }
                    else {
                        elseCounter+=1;
                    }
                }
                else if(message.equals("o")){
                    if ((y[0].getText() + "" + y[1].getText()) .equals("XX")) {
                        if(y[2].getText()==""){
                            pressed2 = y[2];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[0].getText() + "" + y[2].getText()) .equals("XX")) {
                        if(y[1].getText()==""){
                            pressed2 = y[1];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[1].getText() + "" + y[2].getText()) .equals("XX")) {
                        if(y[0].getText()==""){
                            pressed2 = y[0];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[0].getText() + "" + y[1].getText()).equals("OO")) {
                        if(y[2].getText()==""){
                            pressed2 = y[2];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[1].getText() + "" + y[2].getText()) .equals("OO")) {
                        if(y[0].getText()==""){
                            pressed2 = y[0];
                            press(pressed2);
                            works=true;}
                    }
                    else if ((y[0].getText() + "" + y[2].getText()) .equals("OO")) {
                        if(y[1].getText()==""){
                            pressed2 = y[1];
                            press(pressed2);
                            works=true;}
                    }
                    else {
                        elseCounter+=1;
                    }
                }

            }
            if(!works){
                randomPress(null);
            }
            if (elseCounter>=7){
                randomPress(null);
            }

        }
    }

    public void randomPress(View view){
        Random random= new Random();
        int r=random.nextInt(9);
        TextView ra=all[r];
        boolean cornerFull =true;
        boolean sidepieceFull=true;
        if(button1.getText().equals("")||button3.getText().equals("")||button7.getText().equals("")||button9.getText().equals("")){
            cornerFull=false;
        }
        if(button2.getText().equals("")||button4.getText().equals("")||button6.getText().equals("")||button8.getText().equals("")){
            sidepieceFull=false;
        }

        if(ra.getText().equals("")){
            if(priorityCorner){
                if(Arrays.asList(corner).contains(ra)){
                    pressed2=ra;
                    press(pressed2);
                }
                else {
                    randomPress(null);
                }
            }
            else if(!inCenter&&!sidepieceFull){
                if(Arrays.asList(sidepiece).contains(ra)){
                    pressed2=ra;
                    press(pressed2);
                }
                else{
                    randomPress(null);
                }
            }
            else if (cornerFull){
                pressed2=ra;
                press(pressed2);
            }
            else{
                if(Arrays.asList(corner).contains(ra)){
                    pressed2=ra;
                    press(pressed2);
                }
                else {
                    randomPress(null);
                }
            }
        }
        else{
            randomPress(null);
        }
    }
    public void press(View view) {
        if ((message1.equals("x") && (turnCounter % 2) != 0) || (message1.equals("o") && (turnCounter % 2) == 0)) {
            if (pressed2 == button1) {
                switch1(null);
            } else if (pressed2 == button2) {
                switch2(null);
            } else if (pressed2 == button3) {
                switch3(null);
            } else if (pressed2 == button4) {
                switch4(null);
            } else if (pressed2 == button5) {
                switch5(null);
            } else if (pressed2 == button6) {
                switch6(null);
            } else if (pressed2 == button7) {
                switch7(null);
            } else if (pressed2 == button8) {
                switch8(null);
            } else if (pressed2 == button9) {
                switch9(null);
            }
        }
    }

    public void test(){

    }
    public void switch1(View view){
        TextView button = (TextView) findViewById(R.id.button1);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;
        }
        checkforwin(button);
        pressed=button1;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch2(View view){

        TextView button = (TextView) findViewById(R.id.button2);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button2;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch3(View view){

        TextView button = (TextView) findViewById(R.id.button3);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button3;
        if (!((message1.equals("x") && turnCounter >=8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch4(View view){

        TextView button = (TextView) findViewById(R.id.button4);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button4;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >=9))){
            AI1(null);
        }
    }
    public void switch5(View view){

        TextView button = (TextView) findViewById(R.id.button5);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            }
            else {
                button.setText("O");
            }
            turnCounter += 1;
        }
        checkforwin(button);
        pressed=button5;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch6(View view){

        TextView button = (TextView) findViewById(R.id.button6);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button6;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch7(View view){

        TextView button = (TextView) findViewById(R.id.button7);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;
        }
        checkforwin(button);
        pressed=button7;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch8(View view){

        TextView button = (TextView) findViewById(R.id.button8);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button8;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >= 9))){
            AI1(null);
        }
    }
    public void switch9(View view){

        TextView button = (TextView) findViewById(R.id.button9);

        if (button.getText() == ""){
            if (turnCounter % 2 == 0)
            {
                button.setText("X");
            } else {
                button.setText("O");
            }
            turnCounter += 1;

        }
        checkforwin(button);
        pressed=button9;
        if (!((message1.equals("x") && turnCounter >= 8) || (message1.equals("o") && turnCounter >=9))){
            AI1(null);
        }
    }

    public void checkforwin(View view){
        if((    button1.getText()+""+ button2.getText()+""+button3.getText()).equals("XXX")
                ||(button4.getText()+""+ button5.getText()+""+button6.getText()).equals("XXX")
                ||(button7.getText()+""+ button8.getText()+""+button9.getText()).equals("XXX")
                ||(button1.getText()+""+ button4.getText()+""+button7.getText()).equals("XXX")
                ||(button2.getText()+""+ button5.getText()+""+button8.getText()).equals("XXX")
                ||(button3.getText()+""+ button6.getText()+""+button9.getText()).equals("XXX")
                ||(button1.getText()+""+ button5.getText()+""+button9.getText()).equals("XXX")
                ||(button3.getText()+""+ button5.getText()+""+button7.getText()).equals("XXX")
                ){
            winner="x";
            sendWinner();
        }

        else if((button1.getText()+""+ button2.getText()+""+button3.getText()).equals("OOO")
                ||(button4.getText()+""+ button5.getText()+""+button6.getText()).equals("OOO")
                ||(button7.getText()+""+ button8.getText()+""+button9.getText()).equals("OOO")
                ||(button1.getText()+""+ button4.getText()+""+button7.getText()).equals("OOO")
                ||(button2.getText()+""+ button5.getText()+""+button8.getText()).equals("OOO")
                ||(button3.getText()+""+ button6.getText()+""+button9.getText()).equals("OOO")
                ||(button1.getText()+""+ button5.getText()+""+button9.getText()).equals("OOO")
                ||(button3.getText()+""+ button5.getText()+""+button7.getText()).equals("OOO")
                ){
            winner="o";
            sendWinner();
        }
        else if(!(button1.getText().equals("")
                ||button2.getText().equals("")
                ||button3.getText().equals("")
                ||button4.getText().equals("")
                ||button5.getText().equals("")
                ||button6.getText().equals("")
                ||button7.getText().equals("")
                ||button8.getText().equals("")
                ||button9.getText().equals(""))){
            winner ="none";
            sendWinner();
        }
        else if (turnCounter==11){
            winner="none";
            sendWinner();
        }
    }

    public static final String EXTRA_MESSAGE1 = "Winner";
    public static final String EXTRA_MESSAGE2 = "AIside";
    public void sendWinner(){
        Intent sendWin=new Intent (this, Winner.class);
        sendWin.putExtra(EXTRA_MESSAGE1,winner);
        sendWin.putExtra(EXTRA_MESSAGE2,AIside);
        startActivity(sendWin);
    }
}
