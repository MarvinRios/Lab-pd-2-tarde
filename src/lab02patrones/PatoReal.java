/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02patrones;

public class PatoReal extends Pato{

    public PatoReal(){
        Cuaqueable c1 = new Cuaqueo();
        super.setCuaqueable(c1);

        Volable v1 = new VuelaConAlas();
        super.setVolable(v1);
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }
  
}
