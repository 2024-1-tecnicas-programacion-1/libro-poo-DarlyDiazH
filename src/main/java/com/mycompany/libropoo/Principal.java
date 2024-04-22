package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
    
    //Complejidad temporal: O(1) Tiempo constante
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Titulo: ");
        String titulo=sc.nextLine();
        System.out.print("Autor: ");
        String autor=sc.nextLine();
        System.out.print("Genero: ");
        String genero=sc.nextLine();
        System.out.print("Año de Publicacion: ");
        int anioPublicacion=sc.nextInt();
        boolean leido = false;

        Libro nuevoLibro = new Libro(titulo, autor, anioPublicacion, genero, leido);
        System.out.println(nuevoLibro.mostrarInformacion());
        
        nuevoLibro.marcarLeido();
        
        if (nuevoLibro.isLeido() == true) {
            System.out.println("Ya leiste este libro");
        }else{
            System.out.println("Aun no leiste este libro");
        }
        
        if (nuevoLibro.esAntiguo() == true) {
            System.out.println("Este libro es Antiguo");
        }else{
            System.out.println("Este libro es Nuevo");
        }
        
    }
}
    
