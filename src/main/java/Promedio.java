
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author salso
 */
public class Promedio {

   
    public static void main(String[] args) {
        Scanner g= new Scanner (System.in);
       int calif;
       int calif2;
       int calif3;
       int calif4;
       int calif5;
       int sum;
       double p;
       
        System.out.println("Intoduce tu primer Calificacion");
        calif= g.nextInt();
        System.out.println("Intoduce tu Segunda Calificacion");
        calif2=g.nextInt();
        System.out.println("Intoduce tu Tercera Calificacion");
        calif3=g.nextInt();
        System.out.println("Intoduce tu Cuarta Calificacion");
        calif4=g.nextInt();
        System.out.println("Intoduce tu Quinta Calificacion");
        calif5=g.nextInt();
        
        sum=calif+calif2+calif3+calif4+calif5;
        p=sum/5;
        
        System.out.println("El Promedio de tus Calificaciones es: "+p);
       
    }
    
}
