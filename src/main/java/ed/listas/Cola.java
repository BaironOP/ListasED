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
public class Cola <T>{
    private Node<T> inicio;
    private Node<T> fin;
    private int size;
    
    private Cola(){
        inicio = null;
        fin = null;
        size = 0;
    }
    
    public Cola createCola(){
        Cola n = new Cola();
        return n;
    }
    
    public boolean isEmpty(){
        return inicio==null && fin==null && size==0;
    }
    
    public void add(T data){
        Node <T> n = new Node(data);
        if (isEmpty()){
            inicio = n;
            fin = inicio;
            size++;
        }else{
            fin.setNext(n);
            fin = n;
            size++;
        }
    }
    
    public T pop(){
        T p=null;
        if (isEmpty()){
            
        }else{
            p = inicio.getData();
            inicio = inicio.getNext();
        }
        return p;
    }

    public int getSize() {
        return size;
    }
    
    public T front(){
        return inicio.getData();
    }
}
