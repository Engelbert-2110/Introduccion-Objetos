package src;

public class Contador {
    public static void main(String[] args) {
       Contador cont = new Contador(10); 
       cont.incrementar();
       System.out.println("Incremento.. "+cont.getContador());
       cont.decrementar();
       System.out.println("Decremento.. "+cont.getContador());
       
       
       Contador contador1 = new Contador(cont);
       System.out.println("Contador Copia.."+contador1.getContador());

    }
    
    //Variables Globales
    private int contador;

    //Contructor con parámetros.
    public Contador(int contador1){
    this.contador = contador1;
    }
    
    //Contador Copia
    public Contador(final Contador c){
        contador = c.contador;
    }
   
    //Getter y Setter
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
     //Método incremento.
    public double incrementar(){
        contador++;
        return contador;
    }
    
    //Método decremento
    public double decrementar(){
         --contador;
        return contador;
    }
    
}
