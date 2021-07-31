package com.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        String hexString = "ffcc00";
        int[] rgbArray = hexToRgb(hexString);
        System.out.println( Arrays.toString(rgbArray) );

        int red = 255;
        int green = 204;
        int blue = 0;
        hexString = rgbToHex(red, green, blue);
        System.out.println( hexString );
    }

    static int[] hexToRgb(String hexString)
    {
        return new int[] {
            Integer.valueOf( hexString.substring( 0, 2 ), 16 ),
            Integer.valueOf( hexString.substring( 2, 4 ), 16 ),
            Integer.valueOf( hexString.substring( 4, 6 ), 16 ),
        };
    }

    static String rgbToHex(int red, int green, int blue)
    {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}
