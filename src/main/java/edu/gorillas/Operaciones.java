package edu.gorillas;

import java.util.Scanner;

public class Operaciones {
    public static Miembro recogerDatosMiembro(int c) {

        String dni = ""; //DNI del miembro
        String nom = ""; //Nombre del miembro
        int edad = 0; //Edad del miembro
        String direccion = "";//Dirección del miembro
        String fecha = "";
        double salario = 0;
        String tipoJornada;
        int especialidadId = 0;
        String especialidadNom = "";
        double importeMatricula = 0;
        double mediaNotas;
        String ciclo;

        Scanner scan = new Scanner(System.in);

        //Pedimos el dni
        System.out.println("Introduzca el DNI de:");
        dni = Validar.dni(scan.next());

        //Pedimos el nombre
        System.out.println("Introduzca el nombre del empleado " + c + ": ");
        nom = Validar.nombre(scan.next());

        //Pedimos la edad
        System.out.println("Introduzca la edad de " + nom + ": ");
        edad = Validar.edad(scan.nextInt());

        //Pedimos la direccion
        System.out.println("Introduzca la direccion de " + nom + ": ");
        direccion = scan.nextLine();

        //Pedimos la fecha
        System.out.println("Introduzca la fecha de incorporacion de " + nom + ": ");
        fecha = Validar.fecha(scan.nextLine());

        //Pedimos el salario
        System.out.println("Introduzca el salario de " + nom + ": ");
        salario = scan.nextDouble();

        //Pedimos el tipo de jornada
        System.out.println("Introduzca el tipo de jornada de " + nom + ": ");
        tipoJornada = scan.nextLine();

        //Pedimos la especialidadId
        System.out.println("Introduzca la especialidad de " + nom + ": ");
        especialidadId = scan.nextInt();

        //Pedimos la especialidadNom
        System.out.println("Introduzca la especialidad de " + nom + ": ");
        especialidadNom = scan.nextLine();

        //Pedimos importe matrícula
        System.out.println("Introduzca el importe de matrícula de " + nom + ": ");
        importeMatricula = scan.nextDouble();

        //Pedimos la media de notas
        System.out.println("Introduzca la media de notas de " + nom + ": ");
        mediaNotas = scan.nextDouble();

        //Pedimos el ciclo
        System.out.println("Introduzca el ciclo de " + nom + ": ");
        ciclo = scan.nextLine();

        System.out.println("¿Qué tipo de empleado es? Comercial:1, Repartidor:2");
        int tipo = scan.nextInt();

        Miembro m = null;
        if (tipo == 1) {
            m = new Profesor(nom, dni, edad, direccion, fecha, tipoJornada, salario, new Especialidad(especialidadId, especialidadNom));

        } else {
            m = new Alumno(nom, dni, edad, direccion, fecha, ciclo, importeMatricula, mediaNotas);
        }

        // FALTA PROBAR QUE AL SALARIO SE LE ASIGNAN LOS PLUSES CORRECTAMENTE
        m.aplicarBonificacion();
        return m;
    }
}
