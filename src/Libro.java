package src;

import java.util.*;
public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private int prestados;
    public static void main(String[] args) {
        Scanner entrada = new Scanner ( System.in);
        Libro lb1 = new Libro();
        String titulo1, autor1;
        int anio1;
        System.out.print (" Ingrese un titulo del libro 1:");
        titulo1 = entrada.nextLine();
        System.out.print (" Ingrese un autor del libro 1:");
        autor1 = entrada.nextLine();
        System.out.print (" Ingrese el año del libro:");
        anio1 = entrada.nextInt();
        lb1.setTitulo(titulo1);
        lb1.setAutor(autor1);
        lb1.setAnio(anio1);
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + lb1.getTitulo());
        System.out.println("Autor: " + lb1.getAutor());
        System.out.println("Año del libro: " + lb1.getAnio());
        System.out.println("Prestados: " + lb1.getPrestados());
        System.out.println();
        // objeto para el constructor con paramentos 
        Libro lb2 = new Libro(" Java 6", "Carlos jv", 6, 2);
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + lb2.getTitulo());
        System.out.println("Autor: " + lb2.getAutor());
        System.out.println("Cantidad de libros: " + lb2.getAnio());
        System.out.println("Prestados: " + lb2.getPrestados());
        System.out.println();
    }
    // constructor por defecto
    public Libro () {
    }
    // metodo constructor con parametros
    public Libro(String titulo, String autor, int anio, int prestados) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.prestados = prestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getPrestados() {
        return prestados;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    // Metodo para prestar un libro
    public boolean hacerPrestamo (){
        boolean prestamo = true;
        if ( prestamo == true){
            System.out.print(" SE HA REALIZADO EL PRESTAMO EXITOSAMENTE!!");
        } else {
                 System.out.print(" LO SENTIMOS, NO SE HA PODIDO REALIZAR SU PETICION!!");
            }
        return prestamo;
        }
    public boolean hacerDevolucion (){
        boolean devuelto = true;
        if ( devuelto == true ){
            System.out.print(" SE HA DEVUELTO EXITOSAMENTE");
        } else {
            System.out.print (" ERROR !! NO SE HA PODIDO REALIZAR SU PETICION");
        }
        return devuelto;
    }
}