/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author jdominguezdominguez
 */
public class Futbolista extends SeleccionFutbol implements IntegranteSeleccionFutbol {

    Integer dorsal;
    String demarcacion;

    public Futbolista() {
    }

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("Entrevistan o futbolista");
    }

    //Interface begin
    @Override
    public void concentrarse() {
        System.out.println("Centrase o futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o futbolista");
    }
    //Interface end

    @Override
    public String toString() {
        return "Futbolista{" + super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
