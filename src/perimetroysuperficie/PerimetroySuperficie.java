/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetroysuperficie;
import java.util.*;
/**
 *
 * @author esteb
 */
public class PerimetroySuperficie {

 public static void main(String[] args){

float a, b;


Scanner ap = new Scanner (System.in);

System.out.println("Area y Perimetro de un Rectagulo");
System.out.println("Ingrese el valor de a");
a= ap.nextFloat();
System.out.println("ingrese el valor de b");
b= ap.nextFloat();
double area= a*b;
double perimetro=2*(a+b);
System.out.println("El area de un rectangulo es =" + area);
System.out.println("El perimetro de un rectangulo es =" + perimetro); 
 }
}

