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
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Futbolista futbolista = new Futbolista();
        Entrenador entrenador = new Entrenador();
        Masajista masajista = new Masajista();
        Seleccionador seleccionador = new Seleccionador();

        //Futbolista
        System.out.println("***FUTBOLISTA***");
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.entrenar();
        futbolista.jugarPartido();
        futbolista.entrevista();
        System.out.println(futbolista.toString());

        //Entrenador
        System.out.println("\n\n***ENTRENADOR***");
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.entrenar();
        entrenador.jugarPartido();
        entrenador.planificarEntrenamiento();
        System.out.println(entrenador.toString());

        //Masaxista
        System.out.println("\n\n***MASAXISTA***");
        masajista.concentrarse();
        masajista.viajar();
        masajista.entrenar();
        masajista.jugarPartido();
        masajista.darMasaje();
        System.out.println(masajista.toString());

        //Seleccionador
        System.out.println("\n\n***SELECCIONADOR***");
        seleccionador.concentrarse();
        seleccionador.viajar();
        seleccionador.entrenar();
        seleccionador.jugarPartido();
        seleccionador.seleccionarXogador();
        System.out.println(seleccionador.toString());
    }

}
