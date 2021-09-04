import java. util.*;

    public class ClassIterator<E> implements Iterator<E> {
    Node<E> next;

    public ClassIterator(Node<E> node)
    {
        next = node;   
    }
    public boolean hasNext(){
        if(next.getNext() != null){

            return true;
        }
        else{
            return false;
        }
        
        
    }

    public E next(){
        if(hasNext() == true){
            E element = next.getData();
            next = next.getNext();

            return element;
        }
        else{
            throw new UnsupportedOperationException("Nope");
        }
    } 
    
}