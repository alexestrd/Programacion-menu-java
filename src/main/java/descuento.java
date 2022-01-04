
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author salso
 */
public class descuento {
    public static void main(String[] args) {
       Scanner g=new Scanner(System.in);
       int pi;
       int mp;
       int res;
       int mul;
       int pc;
       System.out.println("INGRESA EL PRECIO DEL PRODUCTO");
        pi=g.nextInt();
        System.out.println("INGRESA MONTO PAGADO");
        mp=g.nextInt();
         res=pi-mp;
         mul=res*100;
         pc=mul/pi;
         System.out.println("EL DESCUENTO DEL ARTICULO ES: "+pc+"%");
    }}
