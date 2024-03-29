package edu.gorillas;

public class Especialidad {

    //Atributos:
    private int identificador;
    private String nombre;

    //Constructor por defecto:
    public Especialidad() {
        this.identificador = 1;
        this.nombre = "Lengua";
    }

    //Constructor parametrizado:
    public Especialidad(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    //Getters y setters:
    public int getIdentificador() { return identificador; }
    public void setIdentificador(int identificador) { this.identificador = identificador; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }



}
