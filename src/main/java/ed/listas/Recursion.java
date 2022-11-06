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
        descomponer("Hola mundo");
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
}
