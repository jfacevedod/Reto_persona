
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class PersonaTest {

   /* @Test
    public void testCuandoPersonaFelipeAcevedo26SePresentaRetornaEstosValores() throws Exception{
        String resultadoEsperado = "Hola, soy Felipe Acevedo de edad: 26";
        String resultado = persona.presentarPersona();
        assertEquals(resultadoEsperado, resultado );
    }

    @Test
    public void testPresentarPersonaRetornaNullCuandoPersonaEsNull() throws Exception{
        String resultadoEsperado = "Hola, soy null null de edad: 26";
        String resultado = persona.presentarPersona();
        assertEquals(resultadoEsperado, resultado);

    }*/

    @Test
    public void testCalcularaAnioDeNacimientoDePersona()  throws Exception{
        Persona persona = new Persona(null, null, 26);
        int resultadoEsperado = 1992;
        int resultado = persona.calcularAnioNacimiento();
        assertEquals(resultadoEsperado, resultado);
    }


    @Test
    public void testCrearPersonaMayorA125()  throws Exception{
        try{
            Persona persona = new Persona("uno", "uno", 126);
            fail();
        } catch (Exception e){
            assertTrue(true);
        }

    }

    @Test
    public void testCrearPersonaMenorA0()  throws Exception{
        try{
            Persona persona = new Persona("uno", "uno", -2);
            fail();
        } catch (Exception e){
            assertTrue(true);
        }

    }

    @Test
    public void testModificarEdadPersonaInvalida()  throws Exception{
        try{
            Persona persona = new Persona("uno", "uno", 20);
            persona.setEdad(126);
            fail();
        } catch (Exception e){
            assertTrue(true);
        }

    }
}

