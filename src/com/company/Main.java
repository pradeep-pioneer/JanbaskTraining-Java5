package com.company;

import java.util.List;

public class Main {
    public static String ProgramName = "MyProgram";
    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,4,6,3,8,7};
        for(int val : array)
        {
            int sqr = val*val;
            System.out.println( sqr );
        }
        Drawing test = new Drawing();
        test.dataSignature(2,3);
    }
}
