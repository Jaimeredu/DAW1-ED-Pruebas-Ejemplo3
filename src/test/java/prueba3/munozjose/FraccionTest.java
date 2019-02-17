package prueba3.munozjose;


import org.junit.*;


public class FraccionTest {

    static int num1, num2, num3, num4;
    

    @BeforeClass
    public static void inicio() {
        Fraccion f = new Fraccion();
        num1 =   5;
        num2 =   6;
        num3 = -12;
        num4 = -15;
    }

    @Test
    public void testMitad() {
        // 4 casos de prueba
        Assert.assertEquals("Mitad de " + num1, num1/2.0, Fraccion.mitad(num1), 0.1);
        Assert.assertEquals("Mitad de " + num2, num2/2.0, Fraccion.mitad(num2), 0.1);
        Assert.assertEquals("Mitad de " + num3, num3/2.0, Fraccion.mitad(num3), 0.1);
        Assert.assertEquals("Mitad de " + num4, num4/2.0, Fraccion.mitad(num4), 0.1);
    }

    @Test
    public void testTercio() {
        // 4 casos de prueba
        Assert.assertEquals("Tercio de " + num1, num1/3.0, Fraccion.tercio(num1), 0.1);
        Assert.assertEquals("Tercio de " + num2, num2/3.0, Fraccion.tercio(num2), 0.1);
        Assert.assertEquals("Tercio de " + num3, num3/3.0, Fraccion.tercio(num3), 0.1);
        Assert.assertEquals("Tercio de " + num4, num4/3.0, Fraccion.tercio(num4), 0.1);
    }

}
 
