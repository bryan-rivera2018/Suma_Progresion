/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Suma.Suma;
import java.util.Scanner;

/**
 *
 * @author Equipo Lollipop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bCap = new Scanner(System.in);
        int bKml, bKml1, bKml2, bKml3;
        
        Suma pSerie = new Suma();
        System.out.println("Ingrese el valor de A1: ");
        bKml = bCap.nextInt();
        pSerie.setA1(bKml);
        
        System.out.println("Ingrese el valor de n: ");
        bKml1 = bCap.nextInt();
        pSerie.setN(bKml1);
        bKml2 = bKml;
        
        System.out.println("La serie es la siguiente: ");
        System.out.print(bKml2+", ");
        for(int i=0; i<bKml; i++);
        {
            bKml2 = bKml2+3;
            System.out.print(bKml2+", ");
        }
        System.out.println("");
        pSerie.setAn(bKml2);
        bKml3 = ((bKml+bKml2)*(bKml1))/(2);
        pSerie.setSerie(bKml3);
        
        System.out.print("A1 = " + pSerie.getA1() + " ");
        System.out.print("n = " + pSerie.getN() + " ");
        System.out.print("An = " + pSerie.getAn() + " ");
        System.out.println("La sumatoria total de la serie es: " + pSerie.getSerie() + " ");
    }
    
}
