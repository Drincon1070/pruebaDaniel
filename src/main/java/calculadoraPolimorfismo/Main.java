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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora suma = new Suma(45,67);
        suma.calcular();
        Calculadora resta = new Resta(68,24);
        resta.calcular();
    }
    
}
