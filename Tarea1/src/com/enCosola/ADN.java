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

    public ADN(String adn1, String adn2) {
        this.adn1 = adn1;
        this.adn2 = adn2;
    }

    public ADN() {

        System.out.print("INgrese el primer ADN :");
        adn1 = scanner.next();
        System.out.print("INgrese el segundo ADN :");
        adn2 = scanner.next();
        System.out.println("Patrón repetido " + verifcarPatronRepetido(adn1, adn2));
        System.out.println("trabajando en la rama en consola");
    }

    public String verifcarPatronRepetido(String adn1, String adn2) {

        String patronRepetido = "";
        return patronRepetido;
    }
}
