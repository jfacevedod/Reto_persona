import java.util.Calendar;
import java.util.concurrent.ExecutionException;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre,String  apellido, int edad) throws Exception{
        this.validarLimitesEdad(edad);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) throws Exception{
        this.validarLimitesEdad(edad);
        this.edad = edad;
    }


    public String presentarPersona(Persona persona)  {
        return "Hola, soy " + this.nombre + " "  + this.apellido + " de edad: " + this.edad ;
    }

    public void validarLimitesEdad(int edad) throws Exception{
        if (edad > 125 ) {
            throw new Exception("La persona sobrepasa la maxima edad");
        } else if (edad < 0 ) {
            throw new Exception("la edad de la persona no es valida");
        }
    }

    public int calcularAnioNacimiento(){
        Calendar calendario = Calendar.getInstance();
        int anioActual = calendario.get(Calendar.YEAR);
        return anioActual - this.edad;
    }
}

