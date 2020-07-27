/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enCosola;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ADN {

    public static Scanner scanner = new Scanner(System.in);
    private String adn1;
    private String adn2;

    private String[] arreglo1 = new String[100];
    private String[] arreglo2 = new String[100];

    public ADN(String adn1, String adn2) {
        this.adn1 = adn1;
        this.adn2 = adn2;
    }

    public ADN() {

        System.out.print("INgrese el primer ADN: ");
        adn1 = scanner.next();
        System.out.print("INgrese el segundo ADN: ");
        adn2 = scanner.next();

        char[] c1 = adn1.toCharArray();
        char[] c2 = adn2.toCharArray();

        //System.out.println("Patron repetido " + verifcarPatronRepetido(adn1, adn2));
        for (int i = 0; i < c1.length; i++) {
            verifcarCombinaciones(c1[i] + "", i, c1, arreglo1);

        }
        for (int i = 0; i < c2.length; i++) {
            verifcarCombinaciones(c2[i] + "", i, c2, arreglo2);

        }
        System.out.println("CADENA: " + cadenaRepetida(arreglo1, adn2));

    }

    public String repiticion(String[] arreglo1, String[] arreglo2) {
        String repetido = "";

        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != null) {
                for (int j = 0; j < arreglo2.length; j++) {
                    if (arreglo2[j] != null && (arreglo1[i].equals(arreglo2[j])) && (arreglo1[i].length() > arreglo2[j].length())) {
                        return arreglo1[i];
                    }
                }
            }

        }
        return repetido;
    }

    public String cadenaRepetida(String[] cadena, String ad2) {
        String masGrande = "";
        for (int i = 0; i < cadena.length; i++) {
            if (ad2.contains(cadena[i]) && (cadena[i] != null)) {
               return cadena[i];
            }

        }
        return masGrande;
    }

    public String verifcarPatronRepetido(String adn1, String adn2) {
        char[] a = adn1.toCharArray();
        char[] b = adn2.toCharArray();
        String patronRepetido = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    patronRepetido += a[i];
                }

            }

        }
        return patronRepetido;
    }

    public void verifcarCombinaciones(String caracter, int indice, char[] cadena, String[] arreglo) {
       
        for (int i = indice; i < cadena.length; i++) {
            String combinacion = caracter + cadena[i];
            System.out.println(combinacion);
            insertarCadena(combinacion, arreglo);
            verifcarCombinaciones(combinacion, ++indice, cadena, arreglo);
        }
    }

    public void insertarCadena(String cad, String[] cadena) {
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == null) {
                cadena[i] = cad;
                return;
            }

        }
    }

    public String getAdn1() {
        return adn1;
    }

    public void setAdn1(String adn1) {
        this.adn1 = adn1;
    }

    public String getAdn2() {
        return adn2;
    }

    public void setAdn2(String adn2) {
        this.adn2 = adn2;
    }

}
