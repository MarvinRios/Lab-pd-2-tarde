/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02patrones;

/**
 *
 * @author sistemas
 */
public class PatoDeGoma extends Pato implements Volable,Cuaqueable {

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATITO DE GOMA");
    }

    @Override
    public void volar() {
        System.out.println("INCAPAZ DE VOLAR");        
    }

    @Override
    public void cuaquear() {
        System.out.println("Chir Chir");
    }
    
}
