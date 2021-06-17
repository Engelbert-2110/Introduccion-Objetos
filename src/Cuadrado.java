
package src;

import java.util.*;

public class Cuadrado {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cuadrado cuad;
        double lado;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextInt();
        cuad = new Cuadrado(lado);
        System.out.println("El área es: "+cuad.getArea());
        System.out.println("El perimetro es: "+cuad.getPerimetro());

        
    }
    
    private double lado;
   

    public Cuadrado(double lado1) {
        this.lado = lado1;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double  getPerimetro(){
        double perimetro = 2*(lado +lado); 
        return perimetro; 
    }
    
    public double getArea(){
        double area = lado * lado;
        return area;
    }
 
    
}