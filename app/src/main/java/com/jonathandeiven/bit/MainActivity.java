package com.jonathandeiven.bit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    static final int difficulty = 7;
    Random seed = new Random();

    BinaryGrid definedGrid = new BinaryGrid(difficulty, seed.nextInt());
    BinaryGrid playGridGreen = new BinaryGrid(difficulty, seed.nextInt());
    BinaryGrid playGridBlue = new BinaryGrid(difficulty, seed.nextInt());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateGrid(definedGrid, R.id.definedGrid);
        updateGrid(playGridGreen, R.id.playGrid1);
        updateGrid(playGridBlue, R.id.playGrid2);
    }

    private void updateGrid(BinaryGrid grid, int resourceId) {
        TextView textView = (TextView) this.findViewById(resourceId);
        textView.setText(grid.binaryString);
    }

    public void blueAnd(View view){
        BinaryActions.binaryAnd(playGridBlue, playGridGreen);
        updateGrid(playGridBlue, R.id.playGrid2);
    }
}

