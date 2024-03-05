package edu.gorillas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    //Métodos:
    public void aplicarBonificacion(String fechaIncorporacion) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIncorporacionP = LocalDate.parse(fechaIncorporacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.minusYears(3).isAfter(fechaIncorporacionP)) {
            // Si el profesor se incorporó hace más de 3 años, incrementar el sueldo en un 15%
            this.salario += this.salario * 0.15;
        }

    };


}
