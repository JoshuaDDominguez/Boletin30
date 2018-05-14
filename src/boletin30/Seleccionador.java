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
public class Seleccionador extends SeleccionFutbol implements IntegranteSeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarXogador() {
        System.out.println("O seleccionador selecciona un xogador");
    }

    //Interface begin
    @Override
    public void concentrarse() {
        System.out.println("Centrase o seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o seleccionador");
    }
    //Interface end

    @Override
    public String toString() {
        return "Seleccionador{" + super.toString() + '}';
    }

}
