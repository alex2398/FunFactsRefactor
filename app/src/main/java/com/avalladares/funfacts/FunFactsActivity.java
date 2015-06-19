package com.avalladares.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class FunFactsActivity extends Activity {

    // Instanciamos un objeto FactBook
    private FactBook mFactBook = new FactBook();
    // Instanciamos un objeto colorWheel
    private colorWheel mColor = new colorWheel();

    // Definimos una constante para el log
    public static final String TAG=FunFactsActivity.class.getSimpleName();


    // Este es el método principal, en el que desarrollaremos la mayor parte del código

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Creamos las variables para almacenar las dos vistas
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);

        // Creamos una variable para almacenar la vista principal
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        //Creamos el listener para el evento onclick
        View.OnClickListener buttonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // En este método establecemos lo que queremos que se haga en ese listener
                // Creamos un array de Strings con las frases

                // Obtenemos una frase aleatoria llamando la método getFact
                String fact=getString(mFactBook.getFact());
                // El resultado lo asignamos a la vista factLabel con setText
                factLabel.setText(fact);


                // Obtenemos un color aleatorio con el método getColor
                int idColor=mColor.getColor();
                // Usamos el método de la clase Color parseColor para convertirlo a entero
                int bgColor = Color.parseColor(getString(idColor));

                // Asignamos el mismo color que hemos obtenido como fondo de la vista
                relativeLayout.setBackgroundColor(bgColor);

                // ...y como color del texto del botón
                showFactButton.setTextColor(bgColor);
            }
        };
        // Establecemos lo que haremos al hacer clic en el botón
        // Es decir, le asignamos el lo que hemos definido hacer en el listener buttonListener
        showFactButton.setOnClickListener(buttonListener);

        // Ejemplo de Toast: Pequeño mensaje no invasivo de duración determinada que aparece en
        // la activity
        //Toast.makeText(this, "Hola!!! Perrete!!", Toast.LENGTH_LONG).show();

        // Ejemplo de entrada en log (debug)
        Log.d(TAG,"We are logging from the onCreate() method!");



    }

}
