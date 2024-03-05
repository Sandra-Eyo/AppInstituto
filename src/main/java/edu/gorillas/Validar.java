package edu.gorillas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
    public static String nombre(String nom) {
        //REVISA QUE EL NOMBRE ESTE FORMADO UNICAMENTE POR LETRAS

        //Creamos objeto lector
        Scanner scan = new Scanner(System.in);

        do {
            try {

                Pattern pat = Pattern.compile("[a-zA-Z]{1,20}");
                Matcher mat = pat.matcher(nom);
                //Si la comparación no se cumlple lanza la excepción
                if (!mat.matches())
                    throw new Excep(Excep.NOMBRE_NOTEXTO);
                //Devolvemos el nombre
                return nom;
            } catch (Excep e) {
                e.getMessage();
                System.out.println("Introduzca un nombre de empleado correcto: ");
                nom = nombre(scan.next());
            }
        } while (true);
    }

    public static String dni(String d) {
        //REVISA QUE EL DNI ESTE BIEN FORMADO

        //Creamos objeto lector
        Scanner scan = new Scanner(System.in);

        do {
            try {
                Pattern pat2 = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
                Matcher mat2 = pat2.matcher(d);

                if (d.length() != 9)
                    throw new Excep(Excep.DNI_TAMANIO_MAL);
                if (!mat2.matches())
                    throw new Excep(Excep.DNI_LETRA_MAL);
                //Devolvemos el DNI
                return d;
            } catch (Excep e) {
                e.getMessage();
                System.out.println("Introduzca un DNI correcto: ");
                d = dni(scan.next());
            }
        } while (true);
    }

    public static int edad(int ed) {
        //REVISA QUE LA EDAD ESTE FORMADA UNICAMENTE POR NUMEROS

        //Creamos variable String
        String anos = "";
        anos = Integer.toString(ed);
        //Creamos objeto lector
        Scanner scan = new Scanner(System.in);

        do {
            try {
                Pattern pat = Pattern.compile("[1-9]{1,3}");
                Matcher mat = pat.matcher(anos);
                //Si la comparación no se cumple lanza la excepción
                if (!mat.matches())
                    throw new Excep(Excep.EDAD_NUMERO_MAL);
                //Devolvemos el nombre
                return ed;
            } catch (Excep e) {
                e.getMessage();
                System.out.println("Introduzca una edad de empleado correcta: ");
                ed = edad(scan.nextInt());
            }
        } while (true);
    }

    public static String fecha(String fecha) {
        //REVISA QUE LA FECHA SEA TRING CON EL FORMATO CORRECTO

        //Creamos objeto lector
        Scanner scan = new Scanner(System.in);

        do {
            try {

                Pattern pat = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
                Matcher mat = pat.matcher(fecha);
                //Si la comparación no se cumlple lanza la excepción
                if (!mat.matches())
                    throw new Excep(Excep.FECHA_INCORRECTA);
                //Devolvemos el nombre
                return fecha;
            } catch (Excep e) {
                e.getMessage();
                System.out.println("Introduzca la fecha con el formato dd/mm/yyyy");
                fecha = fecha(scan.next());
            }
        } while (true);
    }

}
