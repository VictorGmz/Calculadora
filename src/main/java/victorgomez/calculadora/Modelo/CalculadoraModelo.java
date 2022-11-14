/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package victorgomez.calculadora.Modelo;

/**
 *
 * @author DAM2
 */
public class CalculadoraModelo {
    
    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public CalculadoraModelo(){
        numero=0;
    }
    public void suma(double n){
        numero = numero+n;
    }
    public void resta(double n){
        numero = numero-n;
        
    }
    public void multiplicacion(double n){
        numero = numero*n;
        
    }
    public void division(double n){
        numero = numero/n;
    }
    
    public void calcula(char op, double n){
        switch (op) {
            case '+':
                suma(n);
                break;
            case '-':
                resta(n);
                break;
            case '*':
                multiplicacion(n);
                break;
            case '/':
                division(n);
                break;
            default:
                System.err.println("Algo ha ido mal. Caracter desconocido");
        }
    }
}
