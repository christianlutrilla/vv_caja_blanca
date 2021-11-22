package com.practica.cajablanca;


import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class NumPalabras {

    @Test
    public void PathOne(){
        Editor editor = new Editor();
        assertThrows(java.lang.IllegalArgumentException.class, () -> {editor.numPalabras(-1, 4, "hola");});

    }

    @Test
    public void PathTwo(){
        Editor editor = new Editor();
        assertThrows(java.lang.IllegalArgumentException.class, () -> {editor.numPalabras(1, -4, "hola");});

    }

    @Test
    public void PathThree(){
        Editor editor = new Editor();
        assertEquals(0, editor.numPalabras(0, 1, "hola"));
    }

    @Test
    public void PathFourth(){
        Editor editor = new Editor();
        assertEquals(0, editor.numPalabras(2, 1, "hola"));

    }

    @Test
    public void PathFive(){
        Editor editor = new Editor();
        editor.leerFichero("FicheroParaLeer.txt");
        assertEquals(0, editor.numPalabras(1, 10, "hola"));

    }

    @Test
    public void PathSix(){
        Editor editor = new Editor();
        editor.leerFichero("FicheroParaLeer.txt");
        assertEquals(2, editor.numPalabras(1, 30, "día"));

    }
}
