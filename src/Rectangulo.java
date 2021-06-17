package src;

import java.util.*;


public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rectangulo rec;
        int ancho, largo;
        
        System.out.println("Digite el ancho del rectangulo ");
        ancho = entrada.nextInt();
        System.out.println("Digite el largo del rectangulo");
        largo = entrada.nextInt();
        rec = new Rectangulo(ancho, largo);
                
        if (ancho == largo ) {
            System.out.println("Se le pidio calcular el area de un rectangulo");
        }else{
            System.out.println("El área es: "+rec.calcularArea());
             System.out.println("El Perimetro es: "+rec.calcularPerimetro());
        }
       
        
        
        
    }

    
    public Rectangulo(int ancho1, int largo1){
        this.ancho = ancho1;
        this.largo = largo1;
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    private int ancho;
    private int largo;
    
    

  
    
    public double calcularArea(){
        double area = ancho * largo;
        return area;
    }
     public double calcularPerimetro(){
        double perimetro = 2*(ancho + largo);
        return perimetro;
    }
    
}

