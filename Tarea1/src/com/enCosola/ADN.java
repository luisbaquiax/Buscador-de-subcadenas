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
//        arreglo1 = new String[100];
//        arreglo2 = new String[100];

        System.out.print("INgrese el primer ADN: ");
        adn1 = scanner.next();
        System.out.print("INgrese el segundo ADN: ");
        adn2 = scanner.next();

        char[] c1 = adn1.toCharArray();
        char[] c2 = adn2.toCharArray();

        for (int i = 0; i < c1.length; i++) {

            insertarCadena(verifcarPatronRepetido(c1[i] + "", i, c1), arreglo1);

        }
        System.out.println("*******************");
        for (int i = 0; i < c2.length; i++) {
            insertarCadena(verifcarPatronRepetido(c2[i] + "", i, c2), arreglo2);
        }
        String patronReptido = "";
        System.out.println("++++++ arreglod 1");
        for (int i = 0; i < arreglo1.length; i++) {
            if (this.arreglo1[i] != null) {
                System.out.println(arreglo1[i]);
            }

        }
        System.out.println("++++++ arreglod 2");
        for (int i = 0; i < arreglo2.length; i++) {
            if (this.arreglo1[i] != null) {
                System.out.println(arreglo1[i]);
            }

        }
        System.out.println("fin ");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {

                if (arreglo1[i].equals(arreglo2[j])) {
                    arreglo1[i] = patronReptido;
                    System.out.println(patronReptido);
                    return;

                }

            }

        }

    }

    public String verifcarPatronRepetido(String caracter, int indice, char[] cadena) {
        String patronRepetido = "";
        for (int i = indice; i < cadena.length; i++) {
            String combinacion = caracter + cadena[i];
            System.out.println(combinacion);
            return combinacion;
            verifcarPatronRepetido(combinacion, indice++, cadena);
            
        }
        return patronRepetido;
    }

    public void insertarCadena(String cad, String[] cadena) {
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i] == null) {
                cadena[i] = cad;
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
