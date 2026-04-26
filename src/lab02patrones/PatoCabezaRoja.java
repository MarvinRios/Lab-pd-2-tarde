/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02patrones;

public class PatoCabezaRoja extends Pato{

    public PatoCabezaRoja(){
        Cuaqueable c2= new Cuaqueo();
        super.setCuaqueable(c2);
    }

    @Override
    public void mostrar() {
        System.out.println("Soy un real PATO CABEZA ROJA");
    }

    
}
