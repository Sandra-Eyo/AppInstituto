package edu.gorillas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MiembroExcep {

    public static void main(String[] args) {

        int c = 1, opcion = 0; //Contador y registro de opcion

        //Objeto lector
        Scanner scan = new Scanner(System.in);

        //Creamos un arraylist de empleados
        ArrayList<Miembro> miembros = new ArrayList<Miembro>();

        //Bucle de menú
        do {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    miembros.add(Operaciones.recogerDatosMiembro(c));
                    c++;
                    break;
                case 2:
                    eliminarMiembro(miembros);
                    break;
                case 3:
                    listarMiembros(miembros);
                    break;
            }
        } while (opcion != 7);
    }


    private static void menu() {
        //Encabezado
        System.out.println("--------------------");
        System.out.println("Menú de Miembro");
        System.out.println("--------------------");

        System.out.println("Seleccione lo que desea realizar:");
        System.out.println("1: Anhadir miembro");
        System.out.println("2: Eliminar miembro");
        System.out.println("3: Listar miembros");
        System.out.println("4: Mostrar edad media de Profesores");
        System.out.println("5: Mostrar nota media de Alumnos del ciclo DAM");
        System.out.println("6: Calcular salario medio de profesores");
        System.out.println("7: Salir");
    }

    private static void listarMiembros(ArrayList<Miembro> miembros) {
        //Listado de Empleados
        System.out.println("----------------------");
        System.out.println("Miembros comprobados");
        System.out.println("----------------------");
        for (int i = 0; i < miembros.size(); i++) {
            System.out.println("DNI: " + miembros.get(i).getDni());
            System.out.println("Nombre Empleado " + (i + 1) + ": " + miembros.get(i).getNombre());
            System.out.println("Edad: " + miembros.get(i).getEdad());
            System.out.println("Dirección: " + miembros.get(i).getDireccion());
            System.out.println("Fecha de incorporación: " + miembros.get(i).getFechaIncorporacion());
            System.out.println("-----------------------------------");
        }
    }

    private static void eliminarMiembro(ArrayList<Miembro> miembros) {
        System.out.println("Intruzca el DNI del miembro que desea eliminar:");
        Scanner scan = new Scanner(System.in);
        String dniEliminar = scan.nextLine();

        for (Miembro miembro : miembros) {
            if (miembro.getDni().equals(dniEliminar)) {
                miembros.remove(miembro);
                System.out.println("El miembro con el dni " + dniEliminar + " ha sido eliminado. ");
                break;
            }
        }

    }

}
