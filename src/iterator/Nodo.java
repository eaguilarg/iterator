
package iterator;

public class Nodo <T> {
   
//atributos
   private T elemento;
   private Nodo <T> siguiente;
   private Nodo <T> anterior;
   private int prioridad;
   
//constructores
   public Nodo(T elemento){
         this.elemento=elemento;
         siguiente=null;
         anterior=null;
    }
   public Nodo(){
       
   }
    public Nodo(T elemento,int prior){
         this.elemento=elemento;
         siguiente=null;
         anterior=null;
         this.prioridad=prior;
    }
   
   
 //gets y sets
   public Nodo<T> getSiguiente(){
       return siguiente;
   }
   public Nodo<T> getAtras(){
       return anterior;
   }
   
   public void setSiguiente(Nodo<T> siguiente){
       this.siguiente=siguiente;
   }
   public void setAtras(Nodo<T> anterior){
       this.anterior=anterior;
   }
   public int getPrioridad(){
       return prioridad;
   }
   
 //toString
   public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append("Elemento: "+elemento);
       return sb.toString();
     }

    public T getElemento() {
        return elemento;
    }
    
    public void setElemento(T elemento){
            this.elemento=elemento;
         }
    
   
           
   
    
}
