package com.bridge.labz;

public class OperatorPrograms {
    static void MinimumValue(int x, int y)
    {

        if (x > y)
        {
            int temp = x;
            x = y;
            y = temp;
        }

        int a = 1;
        int b = x - 1;
        int c = y - b;

        System.out.print( a + " " + b + " " + c);
    }

    public static void main (String[] args)
    {
        int x = 123, y = 13;

        MinimumValue(x, y);
    }
}

