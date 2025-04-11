/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
si el numero es menor que los 10, lo cual significa que solo tine un digito 
se devuelbe el mismo numero,en caso contrario se estrae el ultimo digito utilizando el operador modulo %
y se caclula el los digitos menos 
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
     
     return n+sumaConsecutivos(n-1);
    }
    public int getPotencia(int n, int exponente){
        if (exponente==0) return 1;     
        return n*getPotencia(n,exponente-1); 
    }
    public int sumatoria(int n){
        if (n<10) return n;
        return n%10+sumatoria(n/10);
    }
    
    public void desendente (int n){
        if (n<0) return ;
        System.out.println(n);
         desendente(n-1);
        return ;
    }
    public int reverso(int n){
        if (n==0) return 1;
        int da=n%10;
        System.out.println("reverso "+da);
        return reverso(n/10);
    }
}
