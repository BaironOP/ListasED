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
public class CircleTwinLinkedList <T> {
    
    private TwinNode<T> head;
    private int size;

    public CircleTwinLinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void add (T data){
        if (isEmpty()){
            head = new TwinNode(data);
            head.setNext(head);
            head.setBack(head);
            size++;
        }else{
            TwinNode n = new TwinNode (data);
            TwinNode p = head.getBack();
            p.setNext(n);
            n.setNext(head);
            n.setBack(p);
            head.setBack(n);
            size++;
        }
    }
    
    public void print(){
        if (isEmpty()){
            System.out.println("The List is Empty");
        }else{
            TwinNode p = head;
            int i = size;
            while (i>0){
                System.out.print(p.getData()+" -> ");
                p = p.getNext();
                i--;
            }
            System.out.println();            
        }
    }
    
    public void deleteLast(){
        if (!isEmpty()){
            TwinNode p = head.getBack();
            p.getBack().setNext(head);
            head.setBack(p.getBack());
            p.setBack(null);
            p.setNext(null);
            size--;
        }
    }
    
    public void deleteFirst(){
        if (!isEmpty()){
            TwinNode p = head.getBack();
            head.setBack(null);
            p.setNext(head.getNext());
            head.setNext(null);
            p.getNext().setBack(p);
            head = p.getNext();
            size--;
        }
    }
    
    public void delete (T data){
        if (!isEmpty()){
            TwinNode p = head;
            TwinNode q = null;
            if (p.getData() == data){
                deleteFirst();
            }else{
                while (p.getNext()!= head){
                    q = p;
                    p = p.getNext();
                    if (p.getData()==data){
                        q.setNext(p.getNext());
                        p.getNext().setBack(q);
                        p.setBack(null);
                        p.setNext(null);
                        size--;
                        break;
                    }
                }
            }
        }
    }
    
    public void addBefore(T newData, T data){
        if (!isEmpty()){
            TwinNode p = head;
            TwinNode q = null;
            TwinNode n = new TwinNode(newData);
            if (p.getData() == data){
                deleteFirst();
            }else{
                while (p.getNext()!= head){
                    q = p;
                    p = p.getNext();
                    if (p.getData()==data){
                        q.setNext(n);
                        n.setBack(q);
                        p.setBack(n);
                        n.setNext(p);
                        size++;
                    }
                }
            }
        }
    }
    
    public void addAfter(T newData, T data){
        if (!isEmpty()){
            TwinNode p = head;
            TwinNode q = null;
            TwinNode n = new TwinNode(newData);
            if (p.getData() == data){
                deleteFirst();
            }else{
                while (p.getNext()!= head){
                    q = p;
                    p = p.getNext();
                    if (p.getData()==data){
                        q = p.getNext();
                        p.setNext(n);
                        n.setBack(p);
                        q.setBack(n);
                        n.setNext(q);
                        size++;
                    }
                }
            }
        }
    }
    
    public T getFirst(){
        if (isEmpty()){
            return null;
        }else{
            return head.getData();
        }
    }
    
    public void clear(){
        
    }
}
