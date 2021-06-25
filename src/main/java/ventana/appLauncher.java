package ventana;

import modelo.Trabajador;

public class appLauncher {
    public static void main(String[] args) {
        GuiTrabajador gui = new GuiTrabajador();
        gui.setVisible(true);
        Trabajador trabajador = new Trabajador("james hetfield","15.456.345-7","mas vida","cuprum");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getRut());
        System.out.println(trabajador.getAfp());
        System.out.println(trabajador.getIsapre());
    }
}
