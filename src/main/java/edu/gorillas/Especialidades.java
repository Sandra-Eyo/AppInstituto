package edu.gorillas;

public class Especialidades {

    //Atributos:
    public int identificador;
    public String nombre;

    //Constructor:
    public Especialidades(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    //Getters y setters:

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
