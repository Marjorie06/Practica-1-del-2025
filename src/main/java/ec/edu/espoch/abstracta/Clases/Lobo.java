/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.Clases;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Lobo extends Animal{
    
    @Override
    public  String getNombreCientifico() {
    return "Canispulus familiares";
}
    @Override
    public String getSonido() {
    return "Aulla";
}
    @Override
    public  String getAlimentacion() {
    return "Carnivoro";
}
    @Override
    public String getHabitad(){
     return "Salvaje";
}
}
