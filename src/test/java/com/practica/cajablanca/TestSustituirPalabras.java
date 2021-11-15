package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSustituirPalabras {

    @Test
    public void emptySustituirPalabra(){
        Editor editor = new Editor();
        editor.sustituirPalabra("Tortilla francesa", "Tortilla española");
        assertEquals(comprobarPalabra(editor), comprobarPalabra(new Editor()));
    }

    public String comprobarPalabra(Editor editor)  {

        String s = "";
        if(editor.size() > 0){
            try {
                for(int i=0;i<=editor.size();i++){
                    for(int j=0;j<=editor.getLinea(i).size();j++){
                        s+=editor.getLinea(i).getAtPos(j);
                    }
                }
            } catch (EmptyCollectionException e){

            }
        }

        return s;
    }

}
