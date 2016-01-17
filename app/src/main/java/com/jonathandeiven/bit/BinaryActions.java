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

    public static void binaryLeftShift(BinaryGrid grid){
        grid.binaryNumber <<= 1;
        grid.updateBinaryString();
    }

    public static void binaryRightShift(BinaryGrid grid){
        grid.binaryNumber >>= 1;
        grid.updateBinaryString();
    }
}
