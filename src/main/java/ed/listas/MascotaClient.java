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
public class MascotaClient {
    static SingleList <Mascota> lista = new SingleList<>();
    
    public static void main (String[] args){
        Mascota m1 = new Mascota("Firulais", 2);
        lista.add(m1);
        for (int i = 0; i<lista.getSize(); i++){
            Mascota m = lista.get(i);
            if (m.getEdad()>=2){
                System.out.print(m);
            }
        }
    }
}
