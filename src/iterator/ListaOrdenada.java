
package iterator;


public class ListaOrdenada <T extends Comparable <T> > {
   
//atributos
     Nodo <T> cabeza;
     int cont=0;
     
//constructor
     public ListaOrdenada(){
         cabeza=new Nodo();
         
     }
     
     public void inserta(T elem){
         Nodo<T> nuevo=new Nodo(elem);
         Nodo<T> actual=cabeza.getSiguiente(),temp=cabeza;
         while(actual!=null && elem.compareTo(actual.getElemento())<0){
             temp=actual;
             actual=actual.getSiguiente();
         }
         nuevo.setSiguiente(actual);
         nuevo.setAtras(temp);
         temp.setSiguiente(nuevo);
         if(actual!=null)
             actual.setAtras(nuevo);
         cont++;
     }
     
     private Nodo<T> buscar(T elem){
         Nodo<T> nuevo=new Nodo<T>(elem);
         Nodo<T> actual=cabeza;
         
         while(actual.getSiguiente()!=null && actual.getSiguiente()!=nuevo)
             actual=actual.getSiguiente();
                   
         if(actual.getSiguiente()==null)
             throw new Unchecked("No existe elemento");
         return nuevo;
                 
     }
     public T busca(T elem){
         Nodo<T> temp=buscar(elem);
         return temp.getElemento();
         
     }
     public void borrar(T elem){
         Nodo<T> siguiente, pasado;
         Nodo<T> busca;
         busca=buscar(elem);
         
         siguiente=busca.getSiguiente();
         pasado=busca.getAtras();
         
         pasado.setSiguiente(siguiente);
         siguiente.setAtras(pasado);
                 
     }
     public void imprimeLista(Nodo<T> actual){
      if(actual!=null){
          System.out.print(actual.getElemento());
          imprimeLista(actual.getSiguiente());
      }
  }
     
     
     public static void main(String args[]){
         ListaOrdenada<Integer> lista=new ListaOrdenada<Integer>();
         
         
         lista.inserta(5);
         lista.inserta(3);
         lista.inserta(6);
         lista.imprimeLista(null);
         
         
         
     }

   
      
    
}
