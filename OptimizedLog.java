import java.util.*;

public class OptimizedLog<E> implements Collection<E>{

    private int size;
    public Node<E> head=null;
    private Node<E> last;
    private Node<E> round;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }

    public boolean contains(Object o){
        Node<E> contain = head;
        while(contain != null){
            contain = contain.getNext();
            if(contain.getData() ==o) return true;
        }
        return false;
    }
    public boolean containsAll(Collection<?> c){
        Node<E> allItems = head;
        while(allItems !=null){
            if(c.contains(allItems.getData())){
                allItems = allItems.getNext();
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    public Iterator<E> iterator(){
    return new ClassIterator<E>(round);
        
    }
    public String toString(){
        Node<E> fill = head;
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("\n");
        do{
            if(fill.getDuplicates()==1){
                strBuff.append("[" + fill.getTaD() +"]: "+ fill.getData().toString()+" "+ "\n");
            }
            else{
                strBuff.append("[" + fill.getTaD() +"]"+"["+ fill.getDuplicates()+ " TIMES]: "+ fill.getData().toString()+" " + "\n");
            }
            
            fill = fill.getNext();
        }while(fill!=null);
        return strBuff.toString();
    }
    
    public Object[] toArray(){
        Object[] object = new Object[size];
        Node<E> transform = head;
        for(int i = 0; i<size; i++){
            object[i] = transform.getData();
            if(transform.getNext()!=null){
                transform = transform.getNext();
            }  
        }
        return object;
    }

    public <T> T[] toArray(T[] a){
        
        return null;
    }

    public boolean add(E o){
        Node<E> Node = new Node<E>(o);
        Node.setNext(null);
        size++;
            if(head == null){
                head = Node;
                round = head;
            }
            else{
                last = head;
                while(last.getNext() != null ){
                    if(last.getData()==o){
                        last.setDuplicates();
                        return false;
                    }
                    last = last.getNext();
                }
                last.setNext(Node);
            }
        return true;
    }

    public void printList(){

        Node<E> test = head;
        while(test.getNext()!=null){
            System.out.println(test.getData()); 
            test = test.getNext();
        }
    }

    public boolean remove(Object o){
        return false;
    }    

    public boolean addAll(Collection <? extends E> c){

        return true;
    }

    public void clear(){
        head=null;
    }
    public boolean equals(Object o){
        return true;
    }   

    public int hashCode(){
        return 1;
    }

    public boolean removeAll(Collection<?> c){
        
        return false;
    }

    public boolean retainAll(Collection<?> c){
        return false;
    }

}