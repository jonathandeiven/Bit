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

    public BinaryGrid(int levelDifficulty, int seed){
        generateBinaryString(levelDifficulty, seed);
    }

    /**
     * Generates a random number and its binary representation
     * @param levelDifficulty: Number of binary places
     */
    public void generateBinaryString(int levelDifficulty, int seed){
        Random rand = new Random(seed);
        int binaryLimit = (int)Math.pow(2, levelDifficulty); //limit int to highest number possible

        binaryNumber = rand.nextInt(binaryLimit);
        binaryString = String.format("%7s", Integer.toBinaryString(binaryNumber)).replace(" ", "0");
        Log.d(TAG, "Number is " + Integer.toString(binaryNumber) + " and Random is " + binaryString);
    }

    public void updateBinaryString(){
        binaryString = String.format("%7s", Integer.toBinaryString(binaryNumber)).replace(" ", "0");
    }
}