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
public class Recursion {
    public static void main (String [] args){
        //nPrint("Hola mundo", 4);
        //descomponer("Hola mundo");
        //System.out.println(sumar(4));
        //System.out.println(fibo(6));
        System.out.println(factorial(4));
    }
    
    static void nPrint(String m, int i){
        if (i>=1){
            System.out.println(m);
            nPrint(m, i-1);
        }
    }
    
    static void descomponer(String m, int pos){
        char c = m.charAt(pos);
        System.out.print(c+"-");
        if (pos<m.length()){
            descomponer(m, pos+1);
        }
    }
    
    static void descomponer(String m){
        char c = m.charAt(0);
        System.out.print(c+"-");
        if (m.length()>1){
            String nc = m.substring(1);
            descomponer(nc);
        }
    }
    
    static long sumar(long n){
        if (n==1){
            return n;
        }else{
            return n+sumar(n-1);
        }
    }
    
    static long fibo (long n){
        if (n==1||n==0){
            return n;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
    static long factorial(long n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
