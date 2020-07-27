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

        System.out.println("Patron repetido " + verificarPatronRepetido(adn1, adn2));

    }

    /**
     * Método que se encarga de verificar si hay algún patrón repetido
     *
     * @param cadena1
     * @param cadena2
     * @return
     */
    public String verificarPatronRepetido(String cadena1, String cadena2) {
        
        int m = cadena1.length();
        int n = cadena2.length();
        //Guardar las longitudes mas largas
        int[][] longitudes = new int[m + 1][n + 1];

        //la longitud mas grande y común entre las dos cadenas
        int masGrande = 0;

        int fila = 0;
        int columna = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    longitudes[i][j] = 0;
                } else if (cadena1.charAt(i - 1) == cadena2.charAt(j - 1)) {
                    longitudes[i][j] = longitudes[i - 1][j - 1] + 1;
                    if (masGrande < longitudes[i][j]) {
                        masGrande = longitudes[i][j];
                        fila = i;
                        columna = j;
                    }
                } else {
                    longitudes[i][j] = 0;
                }
            }
        }

        String noHay = "";
        if (masGrande == 0) {
            System.out.println("NO HAY PATRON REPETIDO");
            return noHay;
        }

        String patronRepetido = "";
        while (longitudes[fila][columna] != 0) {
            patronRepetido = cadena1.charAt(fila - 1) + patronRepetido;
            --masGrande;
            fila--;
            columna--;
        }

        System.out.println(patronRepetido);
        return patronRepetido;
    }

    /**
     * Método que se encarga de verificar las combinaciones posibles de una
     * cadena
     *
     * @param caracter
     * @param indice
     * @param cadena
     * @param arreglo
     */
    public void verifcarCombinaciones(String caracter, int indice, char[] cadena, String[] arreglo) {

        for (int i = indice; i < cadena.length; i++) {
            String combinacion = caracter + cadena[i];
            System.out.println(combinacion);
            insertarCadena(combinacion, arreglo);
            verifcarCombinaciones(combinacion, ++indice, cadena, arreglo);
        }
    }

    /**
     * Me sirvió para guardar una combinación
     *
     * @param cad
     * @param cadena
     */
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
