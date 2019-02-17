package prueba3.munozjose;


public class Texto {

    public static String minusculas(String texto) {
        return texto.toLowerCase();
    }

    
    public static String mayusculas(String texto) {
        return texto.toUpperCase();
    }

    
    public static String textoInvertido(String texto) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i=texto.length()-1; i>=0; i--) {
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }

}
