
package src;

import java.util.*;

public class Fraccion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fraccion fraccion;
        int num1, num2;
        
        System.out.println("Digite el primer numero ");
        num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero");
        num2 = entrada.nextInt();
        fraccion = new Fraccion(num1, num2);
        
        System.out.println("La suma es: "+fraccion.sumarFracciones());
        System.out.println("La resta es: "+fraccion.restarFracciones());
        System.out.println("La Multiplicacion es:"+fraccion.multiplicarFracciones());
        System.out.println("La División es:"+fraccion.dividirFracciones());
    
       
    }
    
    private double num1;
    private double num2;
    
    public Fraccion(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double sumarFracciones (){
        double suma = num1 + num2;
        return suma;
    }
    
    public double restarFracciones (){
        double resta = num1 - num2;
        return resta;
    }
    
    public double multiplicarFracciones (){
        double Multiplica = num1 * num2;
        return Multiplica;
    }
    
    public double dividirFracciones(){
        double dividir = num1 / num2;
        return dividir;
    }
   
    
    
}
