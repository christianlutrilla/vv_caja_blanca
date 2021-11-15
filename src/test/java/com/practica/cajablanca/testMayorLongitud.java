package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testMayorLongitud {

    @Test
    public void pathOne() throws com.cajanegra.EmptyCollectionException{
        Editor editor = new Editor();
        assertEquals(editor.mayorLongitud(), null);
    }

}
