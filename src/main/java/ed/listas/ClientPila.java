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
public class ClientPila {
    
    private static Pila<Integer> p1 = new Pila();
    private static Pila<Integer> p2 = new Pila();
    private static Pila<Integer> p1i = new Pila();
    private static Pila<Integer> p2i = new Pila();
    private static Pila<Integer> pSuma = new Pila();
    
    public static void main (String[] args){
        int valor = 0;
        for (int i = (int)(Math.random()*10); i>=0; i--){
            valor = (int)(Math.random()*10);
            p1.push(valor);
        }
        for (int i = (int)(Math.random()*10); i>=0; i--){
            valor = (int)(Math.random()*10);
            p2.push(valor);
        }
        System.out.println(""
                + "Pila 1"
                + "");
        for (int i = p1.getSize(); i>0; i--){
            int d = p1.pop();
            System.out.println(d);
            p1i.push(d);
        }
        System.out.println(""
                + "Pila 2"
                + "");
        for (int i = p2.getSize(); i>0; i--){
            int d = p2.pop();
            System.out.println(d);
            p2i.push(d);
        }
        System.out.println();
        
        p1= invertirPila(p1i);
        p2= invertirPila(p2i);
        
        pSuma = sumarPilas (p1, p2);
        for (int i = pSuma.getSize(); i>0; i--){
            System.out.println(pSuma.pop());
        }
        System.out.println();
    }
    
    public static Pila sumarPilas (Pila a, Pila b){
        Pila<Integer> suma1 = new Pila();
        int dif = getDif (a.getSize(), b.getSize());
        Pila<Integer> mayor = getListaMayor(a, b);
        Pila<Integer> menor = getListaMenor(a, b);
        for (int i = dif; i>0; i--){
            suma1.push(mayor.pop());
        }
        for (int i = menor.getSize(); i>0; i--){
            int suma = mayor.pop() + menor.pop();
            suma1.push(suma);
        }
        Pila<Integer> sumaT = new Pila();
        for (int i = suma1.getSize(); i>0; i--){
            sumaT.push(suma1.pop());
        }
        return sumaT;
    }
    
    public static Pila getListaMenor(Pila a, Pila b){
        if (a.getSize()< b.getSize()){
            return a;
        }else {
            return b;
        }
    }
    
    public static Pila getListaMayor(Pila a, Pila b){
        if (a.getSize()>= b.getSize()){
            return a;
        }else {
            return b;
        }
    }
    
    public static int getDif(int a, int b){
        int d;
        if (a>=b){
            d=a-b;
        }else{
            d=b-a;
        }
        return d;
    }
    
    public static int getMenor(int a, int b){
        int menor=0;
        if (a>=b){
            menor=b;
        }else{
            menor=a;
        }
        return menor;
    }
    
    public static Pila invertirPila(Pila<Integer> p){
        Pila <Integer> inv = new Pila();
        for (int i = p.getSize(); i>0; i--){
            inv.push(p.pop());
        }
        return inv;
    }
}
