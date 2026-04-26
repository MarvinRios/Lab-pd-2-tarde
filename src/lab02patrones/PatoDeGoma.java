/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02patrones;

public class PatoDeGoma extends Pato{

    public PatoDeGoma(){
        Cuaqueable c3 = new Chirreo();
        super.setCuaqueable(c3);
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATITO DE GOMA");

    }  
}
