/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02patrones;

public class Lab02Patrones {

    public static void main(String[] args) {

        PatoReal p1 = new PatoReal();
        p1.mostrar();
        p1.nadar();
        p1.cuaqueable.cuaquear();
        System.out.println("\n");
        
        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();
        p2.nadar();
        p2.cuaqueable.cuaquear();
        System.out.println("\n");
        
        PatoSeñuelo p3 = new PatoSeñuelo();
        p3.mostrar();
        p3.volar();
        p3.nadar();
        p3.cuaquear();
        System.out.println("\n");
        
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.nadar();
        p4.cuaqueable.cuaquear();
        System.out.println("\n");
    }
    
}
