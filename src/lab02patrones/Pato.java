
package lab02patrones;

public abstract class Pato{
Cuaqueable cuaqueable = new Cuaqueo();
Chirreo chirreo = new Chirreo();
    
public void setCuaqueable (Cuaqueable cuaqueable){
    
    }
public void setChrreo (Chirreo chirreo){
    
    }

 public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
 
    public abstract void mostrar();     
    
}
