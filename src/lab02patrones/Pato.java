
package lab02patrones;

public abstract class Pato {
    
    Cuaqueable cuaqueable;
    
    public void setCuaqueable (Cuaqueable cuaqueable){
            this.cuaqueable = cuaqueable;
    }
 public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
 
    public abstract void mostrar();     
    
}
