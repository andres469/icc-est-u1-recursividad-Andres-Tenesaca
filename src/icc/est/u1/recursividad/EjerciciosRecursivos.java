/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icc.est.u1.recursividad;

/**
 *
 * @author atene
 */
public class EjerciciosRecursivos {
    
    public int fibonacci(int n){
        if (n<=1)
        {
        return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public int sumaConsecutivos(int n ){
        if (n==1) return 1;
        System.out.println("n"+n);
     return n+sumaConsecutivos(n-1);
    }
}
