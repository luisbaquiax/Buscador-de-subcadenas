/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enCosola;

import java.util.Scanner;
import javax.swing.JTextField;

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

        System.out.println("Patron repetido " + verifcarPatronRepetido(adn1, adn2));

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

    public void verifcarPatronRepetido(String caracter, int indice, char[] cadena) {
        String patronRepetido = "";
        for (int i = indice; i < cadena.length; i++) {
            String combinacion = caracter + cadena[i];
            System.out.println(combinacion);
            insertarCadena(combinacion, this.arreglo1);
            verifcarPatronRepetido(combinacion, ++indice, cadena);
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
