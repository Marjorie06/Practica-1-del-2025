/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.abstracta;

import ec.edu.espoch.abstracta.Clases.Animal;
import ec.edu.espoch.abstracta.Clases.Gato;
import ec.edu.espoch.abstracta.Clases.Leon;
import ec.edu.espoch.abstracta.Clases.Lobo;
import ec.edu.espoch.abstracta.Clases.Perro;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Abstracta {

    public static void main(String[] args) {
     
        //Declarar un array de animales 
        Animal [] animales = new Animal [4];
        
        animales [0] = new Gato ();
        animales [1] = new Perro ();
        animales [2] = new Lobo ();
        animales [3] = new Leon ();
        
        
       for (int i = 0; i < animales.length; i++){
           System.out.println("Nombre cientifico:" + animales[i].getNombreCientifico());
           System.out.println("Su  Alimentacion es:" + animales[i].getAlimentacion());
           System.out.println("su habitad es:" + animales[i].getHabitad());
           System.out.println("El sonido que hace es :" + animales[i].getSonido());
       }
       
 }
}