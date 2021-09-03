/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraPolimorfismo;

/**
 *
 * @author PC_Daniel
 */
public class Calculadora {
    //ATRIBUTOS: 
    protected int numero1; 
    protected int numero2; 
    
    //CONSTRUCTOR: 
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //METODO
    public void calcular(){
        System.out.println("No se ha seleccionado ninguna opción!");
    }
    
}
