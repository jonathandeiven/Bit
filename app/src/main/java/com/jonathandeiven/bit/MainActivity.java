package com.jonathandeiven.bit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View.OnClickListener;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    static final int difficulty = 7;
    Random seed = new Random();

    BinaryGrid playGridGreen = new BinaryGrid(difficulty, seed.nextInt());
    BinaryGrid playGridBlue = new BinaryGrid(difficulty, seed.nextInt());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RelativeLayout layoutBlue = (RelativeLayout) findViewById(R.id.blueButtons);
        final RelativeLayout layoutGreen = (RelativeLayout) findViewById(R.id.greenButtons);

        updateGrid(playGridGreen, R.id.playGridGreen);
        updateGrid(playGridBlue, R.id.playGridBlue);

        Button switchToGreenBtn = (Button)findViewById(R.id.switchGreen);
        switchToGreenBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                layoutBlue.setVisibility(View.INVISIBLE);
                layoutGreen.setVisibility(View.VISIBLE);
            }
        });

        Button switchToBlueBtn = (Button)findViewById(R.id.switchBlue);
        switchToBlueBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                layoutGreen.setVisibility(View.INVISIBLE);
                layoutBlue.setVisibility(View.VISIBLE);
            }
        });

        layoutGreen.setVisibility(View.INVISIBLE);
    }

    private void updateGrid(BinaryGrid grid, int resourceId) {
        TextView textView = (TextView) this.findViewById(resourceId);
        textView.setText(grid.binaryString);
    }

    public void blueAnd(View view){
        BinaryActions.binaryAnd(playGridBlue, playGridGreen);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void blueOr(View view){
        BinaryActions.binaryOr(playGridBlue, playGridGreen);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void blueXor(View view){
        BinaryActions.binaryXor(playGridBlue, playGridGreen);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void blueNot(View view){
        BinaryActions.binaryNot(playGridBlue);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void blueLeftShift(View view){
        BinaryActions.binaryLeftShift(playGridBlue);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void blueRightShift(View view) {
        BinaryActions.binaryRightShift(playGridBlue);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void bluePlusOne(View view) {
        BinaryActions.binaryPlusOne(playGridBlue);
        updateGrid(playGridBlue, R.id.playGridBlue);
    }

    public void greenAnd(View view){
        BinaryActions.binaryAnd(playGridGreen, playGridBlue);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenOr(View view){
        BinaryActions.binaryOr(playGridGreen, playGridBlue);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenXor(View view){
        BinaryActions.binaryXor(playGridGreen, playGridBlue);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenNot(View view){
        BinaryActions.binaryNot(playGridGreen);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenLeftShift(View view){
        BinaryActions.binaryLeftShift(playGridGreen);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenRightShift(View view) {
        BinaryActions.binaryRightShift(playGridGreen);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }

    public void greenPlusOne(View view) {
        BinaryActions.binaryPlusOne(playGridGreen);
        updateGrid(playGridGreen, R.id.playGridGreen);
    }
}

