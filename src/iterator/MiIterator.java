
package iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MiIterator <T> implements Iterator {

 //atributos
    private ArrayList<T> datos;
    private int pos;
 //constructor
    public MiIterator(Nodo<T> actual){
        datos=new ArrayList();
        actual=actual.getSiguiente();
        while(actual!=null){
            datos.add(actual.getElemento());
            actual=actual.getSiguiente();
        }
        pos=0;
              
    }
    
    
    //si tiene elementos
    public boolean hasNext() {
        return pos<datos.size();
    }

      
    public T next() {
        T resp;
        if(!hasNext())
            throw new NoSuchElementException();
         resp=datos.get(pos);
         pos++;
         return resp;
        
    }

    
    
}
