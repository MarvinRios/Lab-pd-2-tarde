/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02patrones;

public class PatoSeñuelo extends Pato{

    public PatoSeñuelo(){
        Cuaqueable c4 = new CuaqueoMudo();
        super.setCuaqueable(c4);

        Volable v4 = new NoVuela();
        super.setVolable(v4);
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATO SEÑUELO");
    }   
}
