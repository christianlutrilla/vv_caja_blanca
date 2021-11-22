package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMayorLongitud {

    @Test   //Path: 1-2-3-16
    public void firstPath() throws com.cajanegra.EmptyCollectionException{
        Editor editor = new Editor();
        assertEquals(editor.mayorLongitud(), null);
    }

    @Test   //Path: 1-2-3-4-5-6-4-16
    public void secondPath() throws com.cajanegra.EmptyCollectionException{
        Editor editor = new Editor();
        editor.leerFichero("FicheroLeerVacioConVariosSaltosDeLinea.txt");
        assertEquals(editor.mayorLongitud(), "");
    }

    @Test   //Path: 1-2-3-4-5-6-7-8-9-6-4-16
    public void thirdPath() throws com.cajanegra.EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("UnaPalabra.txt");
        assertEquals(editor.mayorLongitud(), "hola");
    }

    @Test   //Path: 1-2-3-4-5-6-7-8-10-6-4-16
    public void forthPath() throws com.cajanegra.EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("DosPalabrasPrimeraMayor.txt");
        assertEquals(editor.mayorLongitud(), "hola");
    }

    @Test   //Path: 1-2-3-4-5-6-7-8-10-11-6-4-16
    public void fifthPath() throws com.cajanegra.EmptyCollectionException {
        Editor editor = new Editor();
        editor.leerFichero("DosPalabrasSegundaMayor.txt");
        assertEquals(editor.mayorLongitud(), "adios");
    }
}
