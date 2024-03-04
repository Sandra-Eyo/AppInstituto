package edu.gorillas;

public class Persona {

    //Atributos:
    private String dni;
    private String nombre;
    private int edad;
    private String direccion;


    //Constructor por defecto:
    public Persona()
    {
        this.dni = "12345678X";
        this.nombre = "nombre";
        this.edad = 30;
        this.direccion = "nunca jamas num 1";
    }

    //Constructor parametrizado:
    public Persona(String dni, String nombre, int edad, String direccion)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
}
