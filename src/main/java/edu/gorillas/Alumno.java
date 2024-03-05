package edu.gorillas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno  extends Miembro{

    //Atributos:
    private String ciclo;
    private double mediaNotas;
    private double importeMatricula;

    //Constructor por defecto:
    public Alumno() {
        super();
        this.ciclo = "DAW";
        this.mediaNotas = 7.5;
        this.importeMatricula = 150;
    }

    //Constructor parametrizado:
    public Alumno(String dni, String nombre, int edad, String direccion, String fechaIncorporacion, String ciclo, double mediaNotas, double importeMatricula) {
        super(dni, nombre, edad, direccion, fechaIncorporacion);
        this.ciclo = ciclo;
        this.mediaNotas = mediaNotas;
        this.importeMatricula = importeMatricula;
    }

    //Getters y setters:
    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
    public double getMediaNotas() { return mediaNotas; }
    public void setMediaNotas(double mediaNotas) { this.mediaNotas = mediaNotas; }
    public double getImporteMatricula() { return importeMatricula; }
    public void setImporteMatricula(double importeMatricula) { this.importeMatricula = importeMatricula; }

    //Metodos:
    public void aplicarBonificacion(String fechaIncorporacion) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaIncorporacionA = LocalDate.parse(fechaIncorporacion, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaActual = LocalDate.now();
        if (fechaActual.minusYears(2).isAfter(fechaIncorporacionA)) {
            // Si hace más de 2 años que el alumno se incorporó al centro, el importe de la matricula se reducirá un 10%
            this.importeMatricula -= this.importeMatricula * 0.10;
        }

    };

}
