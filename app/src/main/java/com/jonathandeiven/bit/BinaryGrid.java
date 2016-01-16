package com.jonathandeiven.bit;
import java.util.Random;
import android.util.Log;

/**
 * Created by jonathan on 2016-01-16.
 */
public class BinaryGrid {
    public final String TAG = this.getClass().getSimpleName();
    public String binaryString;
    public int binaryNumber;

    public BinaryGrid(int levelDifficulty){
        generateBinaryString(levelDifficulty);
    }

    public void generateBinaryString(int levelDifficulty){
        Random rand = new Random();
        int binaryLimit = (int)Math.pow(2, levelDifficulty); //limit int to highest number possible
        binaryNumber = rand.nextInt(binaryLimit);
        binaryString = Integer.toBinaryString(binaryNumber);

        Log.d(TAG, binaryString);
    }
}
