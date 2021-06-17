package src;


import java.util.Scanner;


public class Circulo {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo c1;
        double radio;
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextInt();
        c1 = new Circulo(radio);
        System.out.println("El área es: "+c1.calcularArea());
        System.out.println("El Periemtro es: "+c1.calcularPerimetro());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    private double radio;
    public Circulo( double radio1){
        this.radio = radio1;
    }
    
    public double calcularArea(){
    double area = Math.PI*radio*radio;
    return area;
    }
    
    public double calcularPerimetro(){
    double periemtro = 2*Math.PI*radio;
    return periemtro;
    }
}
