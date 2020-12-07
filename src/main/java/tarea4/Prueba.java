/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author isaac
 */
public class Prueba {
    public static void main(String[] args) {
        
        Ejemplos objeto1 = new Ejemplos();
        System.out.println(objeto1.toString());
        
        Ejemplos objeto2 = new Ejemplos(4, 7, 3);
        System.out.println(objeto2.toString());
    }
}
