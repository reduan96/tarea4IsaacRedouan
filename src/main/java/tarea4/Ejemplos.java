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
public class Ejemplos {

    private int atributo1;
    private int atributo2;
    private int atributo3;

    public Ejemplos() {
        
    }

    public Ejemplos(int atributo1, int atributo2, int atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public int getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(int atributo3) {
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
        return "Ejemplos{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + '}';
    }
    
}
