package com.example;

import java.util.Arrays;

/**
 * Point d'entrée de l'application
 */
public class App 
{
    /**
     * Processus principal de l'applcation
     * @param args
     */
    public static void main( String[] args )
    {
        // Transforme un code de couleur hexadécimal en rouge, vert, bleu, et affiche le résultat
        String hexString = "ffcc00";
        int[] rgbArray = new int[] {
            Integer.valueOf( hexString.substring( 0, 2 ), 16 ),
            Integer.valueOf( hexString.substring( 2, 4 ), 16 ),
            Integer.valueOf( hexString.substring( 4, 6 ), 16 ),
        };
        System.out.println( Arrays.toString(rgbArray) );

        // Transforme des valeurs de rouge, vert, bleu en code hexadécimal et affiche le résultat
        int red = 255;
        int green = 204;
        int blue = 0;
        hexString = String.format("#%02X%02X%02X", red, green, blue);
        System.out.println( hexString );
    }
}
