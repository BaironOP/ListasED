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
public class p2 {
    
    public static void main (String[] args){
        imprimirVocales("Calibrar");
        int c = contarCoincidencias("fuego flush afair faraf", 'f');
        System.out.print(c);
    }
    
    public static void imprimirVocales(String palabra){
        if (palabra.length()>0){
            char letra = palabra.charAt(0);
            if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' || letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U'){
                System.out.println(letra);
            }
            imprimirVocales(palabra.substring(1));
        }
    }
    
    public static int contarCoincidencias(String texto, char letra){
        if (texto.length()<=0){
            return 0;
        }else{
            if (texto.charAt(0)==letra){
                return 1+contarCoincidencias(texto.substring(1), letra);
            }else{
                return 0+contarCoincidencias(texto.substring(1), letra);
            }
        }
    }
    
    public static int contarNumerosMayores (int[] arreglo, int numero){
        
        if (arreglo.length<=0){
            return 0;
        }else{
            if (arreglo[0]>numero){
                return 1+contarNumerosMayores(arreglo, numero);
            }else{
                return 0+contarNumerosMayores(arreglo, numero);
            }
        }
    }
}
