package prueba3.munozjose;

import org.junit.*;


public class TextoTest {
    
    static String texto1, texto2, texto3, texto4;
    
    @BeforeClass
    public static void inicio() {
        Texto t = new Texto();
        
        texto1 = "Hola";
        texto2 = "Adiós";
        texto3 = "Buenos días";
        texto4 = "Probando";        
    }
    
    @Test
    public void testMayusculas() {
        Assert.assertEquals("Mayúsculas para " + texto1, "HOLA",        Texto.mayusculas(texto1));
        Assert.assertEquals("Mayúsculas para " + texto2, "ADIÓS",       Texto.mayusculas(texto2));
        Assert.assertEquals("Mayúsculas para " + texto3, "BUENOS DÍAS", Texto.mayusculas(texto3));
        Assert.assertEquals("Mayúsculas para " + texto4, "PROBANDO",    Texto.mayusculas(texto4));
    }
    
     @Test
    public void testMinusculas() {
        Assert.assertEquals("Minúsculas para " + texto1, "hola",        Texto.minusculas(texto1));
        Assert.assertEquals("Minúsculas para " + texto2, "adiós",       Texto.minusculas(texto2));
        Assert.assertEquals("Minúsculas para " + texto3, "buenos días", Texto.minusculas(texto3));
        Assert.assertEquals("Minúsculas para " + texto4, "probando",    Texto.minusculas(texto4));
    }
    
    @Test
    public void testTextoInvertido() {
        Assert.assertEquals("Texto invertido para " + texto1, "aloH",        Texto.textoInvertido(texto1));
        Assert.assertEquals("Texto invertido para " + texto2, "sóidA",       Texto.textoInvertido(texto2));
        Assert.assertEquals("Texto invertido para " + texto3, "saíd soneuB", Texto.textoInvertido(texto3));
        Assert.assertEquals("Texto invertido para " + texto4, "odnaborP",    Texto.textoInvertido(texto4));
    }
    
}
