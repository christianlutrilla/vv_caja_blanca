package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class TestSustituirPalabras {

    private Editor editor = new Editor();

    @BeforeEach
    public void setUp() {
        this.editor = new Editor();
    }

    //Test para el camino 2
    @Test
    public void emptySustituirPalabra(){
        editor.sustituirPalabra("Tortilla francesa", "Tortilla española");
        assertEquals(comprobarPalabra(editor), comprobarPalabra(new Editor()));
    }

    //Test para el camino 3
    @Test
    public void emptyListsSustituirPalabra(){
        editor.leerFichero("FicheroLeerVacioConVariosSaltosDeLinea.txt");
        editor.sustituirPalabra("Tortilla francesa", "Tortilla española");
        assertEquals(comprobarPalabra(editor), comprobarPalabra(new Editor()));
    }

    //Test para el camino 4
    @Test
    public void SustituirAlgunaPalabra(){
        editor.leerFichero("FicheroParaLeer.txt");
        editor.sustituirPalabra("personas", "estudiantes");
        assertEquals(comprobarPalabra(editor), "BuenosdíasatodaslasestudiantespresentesMealegracomunicarlesquetodoslosdíasapartirdeahoravanaserpresencialesSéqueosencantaelnuevocambioperonohacefaltaqueosemocionéistantoAsíquedeestaformaahoratodosfelizmentevaisatenerqueasistiraclasetodoslosdíasAdiósatodaslasestudiantesquehabéisasistido");
    }

    //Test para el camino 5
    @Test
    public void NOSustituirAlgunaPalabra(){
        editor.leerFichero("FicheroParaLeer.txt");
        editor.sustituirPalabra("payasos", "estudiantes");
        assertEquals(comprobarPalabra(editor), "BuenosdíasatodaslaspersonaspresentesMealegracomunicarlesquetodoslosdíasapartirdeahoravanaserpresencialesSéqueosencantaelnuevocambioperonohacefaltaqueosemocionéistantoAsíquedeestaformaahoratodosfelizmentevaisatenerqueasistiraclasetodoslosdíasAdiósatodaslaspersonasquehabéisasistido");
    }

    //Test para el camino 6
    @Test
    public void NOSustituirUnaPalabra(){
        editor.leerFichero("UnaLinea.txt");
        editor.sustituirPalabra("payasos", "estudiantes");
        assertEquals(comprobarPalabra(editor), "Buenosdíasatodaslaspersonaspresentes.");
    }

    public void SustituiruNAPalabra(){
        editor.leerFichero("UnaLinea.txt");
        editor.sustituirPalabra("personas", "estudiantes");
        assertEquals(comprobarPalabra(editor), "Buenosdíasatodaslasestudiantespresentes.");
    }

    public String comprobarPalabra(Editor editor)  {

        String s = "";
        if(editor.size() > 0){
            try {
                for(int i=1;i<=editor.size();i++){
                    for(int j=1;j<=editor.getLinea(i).size();j++){
                        s+=editor.getLinea(i).getAtPos(j);
                    }
                }
            } catch (EmptyCollectionException e){

            }
        }

        return s;
    }

}
