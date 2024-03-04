package edu.gorillas;

public class Profesor extends Miembro {

    //Atributos:
    private String tipoJornada;
    private double salario;
    private Especialidad especialidad;

    //Constructor por defecto:
    public Profesor()
    {
        super();
        this.tipoJornada = "completa";
        this.salario = 1560.50;
        this.especialidad = new Especialidad();
    }

    //Constructor parametrizado:
    public Profesor(String dni, String nombre, int edad, String direccion, String fechaIncorporacion, String tipoJornada, double salario, Especialidad especialidad) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.tipoJornada = tipoJornada;
        this.salario = salario;
        this.especialidad = especialidad;
    }

    //Getters y setters:


    public String getTipoJornada() { return tipoJornada; }
    public void setTipoJornada(String tipoJornada) { this.tipoJornada = tipoJornada; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public Especialidad getEspecialidad() { return especialidad; }
    public void setEspecialidad(Especialidad especialidad) { this.especialidad = especialidad; }


}
