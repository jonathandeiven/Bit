package com.jonathandeiven.bit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int difficulty = 7;

    BinaryGrid definedGrid = new BinaryGrid(difficulty);
    BinaryGrid playGrid1 = new BinaryGrid(difficulty);
    BinaryGrid playGrid2 = new BinaryGrid(difficulty);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) this.findViewById(R.id.definedBinary);
        textView.setText(definedGrid.binaryString);
    }
}

