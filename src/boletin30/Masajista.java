/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezdominguez
 */
public class Masajista extends SeleccionFutbol implements IntegranteSeleccionFutbol {

    String titulacion;
    Integer añosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, Integer añosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje() {
        System.out.println("A masaxista da un masaxe");
    }

    //Interface begin
    @Override
    public void concentrarse() {
        System.out.println("Centrase a masaxista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa a masaxista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena a masaxista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga a masaxista");
    }
    //Interface end

    @Override
    public String toString() {
        return "Masajista{" + super.toString() + "titulacion=" + titulacion + ", a\u00f1osExperiencia=" + añosExperiencia + '}';
    }

}
