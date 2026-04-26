
package lab02patrones;

public abstract class Pato{

private Cuaqueable cuaqueable;

protected void setCuaqueable(Cuaqueable cuaqueable){
    this.cuaqueable = cuaqueable;
}

public void realizarCuaqueo(){
    cuaqueable.cuaquear();
}

private Volable volable;    

protected void setVolabele(Volable volable){
    this.volable = volable;
}

public void realizarVuelo(){
    volable.volar();
}

 public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
 
    public abstract void mostrar();     
    
}
