package com.jonathandeiven.bit;

/**
 * Created by jonathan on 2016-01-16.
 */
public class BinaryActions {

    public static void binaryAnd(BinaryGrid grid1, BinaryGrid grid2){
        grid1.binaryNumber &= grid2.binaryNumber;
        grid1.updateBinaryString();
    }

    public static void binaryOr(BinaryGrid grid1, BinaryGrid grid2){
        grid1.binaryNumber |= grid2.binaryNumber;
        grid1.updateBinaryString();
    }

    public static void binaryXor(BinaryGrid grid1, BinaryGrid grid2){
        grid1.binaryNumber ^= grid2.binaryNumber;
        grid1.updateBinaryString();
    }

    public static void binaryNot(BinaryGrid grid){
        grid.binaryNumber = ~grid.binaryNumber;
        grid.updateBinaryString();
        grid.binaryString = grid.binaryString.substring(grid.binaryString.length() - 7);
    }

    public static void binaryLeftShift(BinaryGrid grid){
        if (grid.binaryNumber < (int) (Math.pow(2, MainActivity.difficulty - 1))) {
            grid.binaryNumber <<= 1;
        }
        grid.updateBinaryString();
    }

    public static void binaryRightShift(BinaryGrid grid){
        grid.binaryNumber >>= 1;
        grid.updateBinaryString();
    }

    public static void binaryPlusOne(BinaryGrid grid){
        if (grid.binaryNumber < (int) (Math.pow(2, MainActivity.difficulty) - 1)) {
            grid.binaryNumber += 1;
        }
        grid.updateBinaryString();
    }
}
