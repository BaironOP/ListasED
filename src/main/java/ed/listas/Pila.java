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
public class Pila {
    
    private int top;
    private Libro[] list;

    public Pila(int size) {
        top = -1;
        list = new Libro[size];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return (top+1)==list.length;
    }
    
    public void push(Libro elemento){
        if (isEmpty()){
            top = 0;
            list[top]=elemento;
        } else {
            if (!isFull()){
                top++;
                list[top] = elemento;
            }
        }
    }
    
    public Libro pop(){
        Libro l=null;
        if (!isEmpty()){
            l = list[top];
            list[top]=null;
            top--;
        }
        return l;
    }
    
    public void clear(){
        while(top>=0){
            list[top] = null;
            top--;
        }
    }
    
    public Libro getTop(){
        return list[top];
    }
}
