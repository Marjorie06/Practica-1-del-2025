/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.Clases;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Gato extends Animal{
    
        @Override
    public  String getNombreCientifico() {
    return "Felis silvestris catus";
}
    @Override
    public String getSonido() {
    return "maullido";
}
    @Override
    public  String getAlimentacion() {
    return "ratones";
}
    @Override
    public String getHabitad(){
     return "felinos";
}
}
