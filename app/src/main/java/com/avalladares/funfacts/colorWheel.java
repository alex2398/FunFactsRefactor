package com.avalladares.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by avalladares on 15/06/2015.
 * Esta clase creará los colores disponibles y una función para devolver un color aleatorio
 * de entre los asignados en el array
 */
public class colorWheel {

    // Member variable (properties about the object)

    // Creamos el array con los colores
    public int[] mColors = {
            R.string.color1,
            R.string.color2,
            R.string.color3,
            R.string.color4,
            R.string.color5,
            R.string.color6,
            R.string.color7,
            R.string.color8,
            R.string.color9,
            R.string.color10,
    };

    // Method (abilities: things the object can do)

    public int getColor() {


        // Este método devuelve un entero con el código de color aleatorio

        // Creamos un generador de randoms

        Random randomGenerator = new Random();
        // Creamos una variable tipo entero para almacenar un valor entero del
        // generador de randoms con nextInt
        // Le pasamos como argumento el tamaño del array, así siempre limitaremos el rango
        // del número aleatorio al número de colores que tengamos.

        int randomNumber = randomGenerator.nextInt(mColors.length);

        int color;
        // En la variable en la que hemos almacenado la vista, cambiamos el texto por el número aleatorio


        // Seleccionamos la frase del array que corresponda con el valor
        // del número aleatorio
        // Guardamos el valor del color cogido del array en la variable color
        color = mColors[randomNumber];


        // Devolvemos el valor al método
        return color;
    }
}
