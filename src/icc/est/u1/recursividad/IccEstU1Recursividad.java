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
public class IccEstU1Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        int resultadoFinal=factorial(n);
        EjerciciosRecursivos eR =new EjerciciosRecursivos();
       
        System.out.println(eR.fibonacci(n));
        System.out.println(eR.sumaConsecutivos(n));
    }
    public static int factorial(int n){
        if (n==0) {
            System.out.println("alcanze el caso base");
            return 1;
        }
        int resultado=n*factorial(n-1);
        System.out.println("calcular factorial de " +n+ " * "+" (Factorial) ["+(n-1)+"]" +" = "+resultado );
        return resultado;
    }
    
   
}
