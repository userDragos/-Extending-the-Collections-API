import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Node<E>{

    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss yyyy");
    
    private E data;
    private Node<E> nextElement;
    private String addedAt = time.format(myFormat);
    private int duplicate=1;

    public E getData(){
        return data;
    }
    public String getTaD(){
        return addedAt;
    }
    public int getDuplicates(){
        return duplicate;
    }
    public void setDuplicates(){
        duplicate++;
    }

    public Node<E> getNext(){
        return nextElement;
    }
    public void setNext(Node<E> n){
        nextElement = n;
    }

    public Node(E d){
        data = d;
        nextElement = null;
         
    }
}