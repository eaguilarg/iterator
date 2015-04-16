
package iterator;


public class ListaOrdenada <T extends Comparable > implements Iterable {
   
//atributos
     Nodo <T> cabeza;
     int cont;
//constructor
     public ListaOrdenada(){
         cabeza=new Nodo();
         cont=0;
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
     
     private Nodo<T> buscar(T elem) throws Unchecked{
         Nodo<T> nuevo=new Nodo<T>(elem);
         Nodo<T> actual=cabeza;
         
         while(actual.getSiguiente()!=null && actual.getSiguiente()!=nuevo)
             actual=actual.getSiguiente();
                   
         if(actual.getSiguiente()==null)
             new Unchecked("No existe elemento");
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
    
    public void imprimeLista(){
        Nodo<T> temp=cabeza.getSiguiente();
        System.out.println(""+"     cabeza"+"↓");
        while(temp!=null){
            System.out.print(""+temp.toString());
            System.out.print("↓"+"\n");
            temp=temp.getSiguiente();
        }
        System.out.println(""+"        null");
    }

     public Iterator Iterator() {
        return new MiIterator(cabeza);
    } 
     public static void main(String args[]){
         ListaOrdenada<Integer> lista=new ListaOrdenada<Integer>();
         
         
         lista.inserta(5);
         lista.inserta(3);
         lista.inserta(6);
         System.out.println(lista.busca(0));
         lista.imprimeLista();
         
         lista.Iterator();
         
                 
     }

    @Override
    public java.util.Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
