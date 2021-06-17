package src;


public class Principal {
    public static void main(String[] args) {
        Principal ej = new Principal();
    }
    
    
 
    
    public Principal(){
    System.out.println("\nClase Contador");
    Contador cont = new Contador(10);
    Contador cont2 = cont;
    cont2.setContador(20);
    System.out.println("Incremento.." + cont.incrementar());
    System.out.println("Decremento.." + cont.decrementar());
   
    System.out.println("\nClase Cuadrado");
    Cuadrado cuad = new Cuadrado(4);
    Cuadrado cuad2 = cuad;
    cuad2.setLado(8);
    System.out.println("El lado es: "+cuad.getLado());
    System.out.println("El Area es: " + cuad.getArea());
    System.out.println("El Periemtro es: " + cuad.getPerimetro());
    
    
    
    System.out.println("\nClase Circulo");
    Circulo c1 = new Circulo(6);
    Circulo c2 = c1;
    c2.setRadio(3);
    System.out.println("El radio es: " + c1.getRadio());
    System.out.println("El Area es: " + c1.calcularArea());
    System.out.println("El Periemtro es: " +  c1.calcularPerimetro());
    
    
    
    System.out.println("\nClase Rectangulo");
    Rectangulo rec = new Rectangulo(5,6);
    Rectangulo rec2 = rec;
    rec2.setAncho(7);
    rec2.setLargo(9);
    System.out.println("El Ancho es " + rec.getAncho());
    System.out.println("El largo es: " + rec.getLargo());
    System.out.println("El Area del rectangulo es: " +  rec.calcularArea());
    System.out.println("El Periemtro del rectangulo es: " + rec.calcularPerimetro());
    
   
    System.out.println("\nClase Fracción");
    Fraccion fraccion = new Fraccion(5,6);
    Fraccion fraccion2 = fraccion;
    fraccion2.setNum1(8);
    fraccion.setNum2(4);
    System.out.println("Suma: " +fraccion.sumarFracciones());
    System.out.println("Recta: " +fraccion.restarFracciones());
    System.out.println("Multiplicacion: " +fraccion.multiplicarFracciones());
    System.out.println("Division: " +fraccion.dividirFracciones());
    

    }
    
    
}


