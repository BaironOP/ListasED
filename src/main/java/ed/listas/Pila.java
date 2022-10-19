/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.listas;

/**
 *
 * @author Usuario
 */
public class Pila <T>{
    
    private Node<T> top;
    private int size;

    public Pila() {
        top = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return top==null && size==0;
    }
    
    public void push(T data){
        Node<T> n = new Node(data);
        if (isEmpty()){
            top = n;
            size++;
        }else{
            n.setNext(top);
            top = n;
        }
    }
    
    public T pop(){
        Node<T> p;
        if (!isEmpty()){
            return null;
        }else{
            p = top;
            top = top.getNext();
            size--;
            return p.getData();
        }
    }
    
    public void clear(){
        top = null;
        size = 0;
    }
    
    public T getTop(){
        if (!isEmpty()){
            return null;
        }else{
            return top.getData();
        }
    }
    
    public int getSize(){
        return size;
    }
}
