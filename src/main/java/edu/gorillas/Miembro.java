package edu.gorillas;

public class Miembro extends Persona {

    //Atributos propios:
    private String fechaIncorporacion;


    //Constructor por defecto:
    public Miembro()
    {
        super("12345678X", "nombre", 30, "nunca jamas num 1");
        this.fechaIncorporacion = "01/01/2024";
    }

    //Constructor parametrizado:
    public Miembro(String dni, String nombre, int edad, String direccion, String fechaIncorporacion) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    //Getters y setters:
    public String getFechaIncorporacion() { return fechaIncorporacion; }
    public void setFechaIncorporacion(String fechaIncorporacion) { this.fechaIncorporacion = fechaIncorporacion; }


}
