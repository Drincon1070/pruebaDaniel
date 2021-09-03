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
public class Resta extends Calculadora{
    //CONSTRUCTOR: 
    public Resta(int numero1, int numero2) {
        super(numero1, numero2);
    }
   
    //METODOS: 
    @Override
    public void calcular(){
        System.out.println("Resultado: "+(this.numero1-this.numero2));
    }
   
    
}
