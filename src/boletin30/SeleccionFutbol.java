package boletin30;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdominguezdominguez
 */
abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    Integer id;
    String nombre, apellidos;
    Integer edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

}
