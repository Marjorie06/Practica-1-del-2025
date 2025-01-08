/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.abstracta.Clases;



public class Perro extends Caninos{
 
    
    @Override
    public  String getNombreCientifico() {
    return "Canis lupus familiaris";
}
    @Override
    public String getSonido() {
    return "Ladrido";
}
    @Override
    public  String getAlimentacion() {
    return "Carnivoro";
}
    @Override
    public String getHabitad(){
     return "Domestica";
}
}
