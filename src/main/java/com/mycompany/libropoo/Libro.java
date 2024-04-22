package com.mycompany.libropoo;

public class Libro {
    
    //ATRIBUTO
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;
    
    //MÉTODOS
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public Libro(String titulo, String autor, int anioPublicacion, String genero, boolean leido){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = leido;
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public String mostrarInformacion(){
        return ("Título: "+titulo+", Autor: "+autor+", Año de publicación: "+anioPublicacion+", Género: "+genero);
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public void marcarLeido(){
        leido = true;
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public boolean isLeido() {
        return leido;
    }
    
    //Complejidad temporal: O(1) Tiempo Constante
    
    public boolean esAntiguo(){
        if (anioPublicacion<1974) {
            return true;
        }else{
            return false;
        }
    }
}
