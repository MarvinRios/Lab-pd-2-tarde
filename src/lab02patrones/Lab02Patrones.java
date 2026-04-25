/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02patrones;

public class Lab02Patrones {

    public static void main(String[] args) {
        Cuaqueable cuaqueable = new Cuaqueo();

        PatoReal p1 = new PatoReal();
        p1.setCuaqueable(cuaqueable);
        p1.mostrar();
        p1.nadar();
        System.out.println("\n");
        
        PatoDeGoma p2 = new PatoDeGoma();
        p2.mostrar();
        p2.volar();
        p2.nadar();
        p2.cuaquear();
        System.out.println("\n");
        
        PatoSeñuelo p3 = new PatoSeñuelo();
        p3.mostrar();
        p3.volar();
        p3.nadar();
        p3.cuaquear();
        System.out.println("\n");
        
        PatoCabezaRoja p4 = new PatoCabezaRoja();
        p4.mostrar();
        p4.volar();
        p4.nadar();
        p4.cuaquear();
        System.out.println("\n");
    }
    
}
