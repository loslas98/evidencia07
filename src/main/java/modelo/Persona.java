package modelo;

public class Persona {
    String nombre;
    String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;

    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
