package modelo;


import datos.InterfaceDatos;

public class Trabajador extends Persona implements InterfaceDatos {
    String isapre;
    String afp;


    public Trabajador(String nombre, String rut,String isapre,String afp) {
        super(nombre, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    @Override
    public void leer() {

    }

    @Override
    public void abrir() {

    }

    @Override
    public void cerrar() {

    }
}
