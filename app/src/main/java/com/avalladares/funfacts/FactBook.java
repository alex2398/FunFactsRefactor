package com.avalladares.funfacts;

import java.util.Random;

/**
 * Created by avalladares on 15/06/2015.
 * Esta clase creará las frases disponibles y una función para devolver una frase aleatoria
 * de entre las asignadas en el array
 */
public class FactBook {

    // Member variable (properties about the object)

    public int[] mFacts = {
            R.string.fact1,
            R.string.fact2,
            R.string.fact3,
            R.string.fact4,
            R.string.fact5,
            R.string.fact6,
            R.string.fact7,
            R.string.fact8,
            R.string.fact9,
            R.string.fact10
            };

    // Method (abilities: things the object can do)

    public int getFact() {


        // Este método devuelve un entero con el código de color aleatorio

        // Creamos un generador de randoms
        Random randomGenerator = new Random();
        // Creamos una variable tipo entero para almacenar un valor entero del
        // generador de randoms con nextInt
        // Le pasamos como argumento el tamaño del array, así siempre limitaremos el rango
        // del número aleatorio al número de colores que tengamos.
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        int fact;


        // Seleccionamos la frase del array que corresponda con el valor
        // del número aleatorio
        fact = mFacts[randomNumber];

        return fact;
    }
}
